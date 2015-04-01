package scheduleObservingStrategies;

/*
 * @author Ashlesha Lapalkar
 * @version 1.1
 * 
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;
import java.util.Timer;
import java.util.TimerTask;

import controlPanel.SysConfigPanel;
import sensorFactory.Sensor;
import simulator.AlarmRinger;
import systems.MainSystem;
import systems.SysConstants;

public class WeekEndActStrategyObserver extends TimerTask implements ScheduleActivatingStrategy, Observer{

	DateFormat dateFormat = new SimpleDateFormat("EEE MM/dd/yyyy");
	DateFormat timeFormat = new SimpleDateFormat("HH:mm");
	MainSystem sys;
	AlarmRinger ringer;
	
	ArrayList<Schedule> scheduleList;
	ArrayList<Sensor> sensorList;
	
	public WeekEndActStrategyObserver(MainSystem sys){
		this.sys = sys;
		this.scheduleList = (ArrayList<Schedule>) sys.getScheduleList();
		this.sensorList = (ArrayList<Sensor>) sys.getInstalledSensors();
		sys.addObserver(this);
		ringer = new AlarmRinger();
	}
	
	@Override
	public void activateSchedule() {
		String date = dateFormat.format(Calendar.getInstance().getTime());
		String time = timeFormat.format(Calendar.getInstance().getTime());
		for(Schedule sch:scheduleList){
			if((date.substring(0,3).equals("Sat") && sch.getScheduleType().equals("Weekend")) && 
				(((new Date(date).after(new Date(sch.getStartDate()))) ||
				(date.equals(sch.getStartDate()))) &&
				((new Date(date).before(new Date(sch.getEndDate()))) ||
				(date.equals(sch.getStartDate()))))){
				if(sch.getStartTime().equals(time)){
					for(int i = 0; i<sensorList.size(); i++){
						Sensor sensor = sensorList.get(i);
						sensor.activateSensor();
						if(sensor == null || sensor.isActivated())
							return;
						sys.addToActivatedSensorList(sensor);
						System.out.println("Successfully done wwe");
						
					}
					sys.setStatus(SysConstants.sysActivated);
					SysConfigPanel p = new SysConfigPanel();
					ringer.startStoAlarm("Speech On");
				}
			}
		}
	}

	@Override
	public void update(Observable arg0, Object list) {
		scheduleList = (ArrayList<Schedule>) list;
	}

	@Override
	public void run() {
		activateSchedule();
		
	}
	
	public void start(){
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(this, Calendar.getInstance().getTime(), 60000);
	}

}
