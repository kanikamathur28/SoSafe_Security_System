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

public class WeekendDeactStrategyObserver extends TimerTask implements Observer, ScheduleDeactivatingStrategy{

	DateFormat dateFormat = new SimpleDateFormat("EEE MM/dd/yyyy");
	DateFormat timeFormat = new SimpleDateFormat("HH:mm");
	MainSystem sys;
	ArrayList<Schedule> scheduleList;
	ArrayList<Sensor> sensorList;
	AlarmRinger ringer;
	
	public WeekendDeactStrategyObserver(MainSystem sys){
		this.sys = sys;
		this.scheduleList = (ArrayList<Schedule>) sys.getScheduleList();
		this.sensorList = (ArrayList<Sensor>) sys.getActivatedSensors();
		sys.addObserver(this);
		ringer = new AlarmRinger();
	}

	public void update(Observable system, Object list) {
		scheduleList = (ArrayList<Schedule>) list;
	}

	
	@Override
	public void run() {
		deactivateSchedule();
	}
	
	public void start(){
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(this, Calendar.getInstance().getTime(), 60000);
	}

	@Override
	public void deactivateSchedule() {
		String date = dateFormat.format(Calendar.getInstance().getTime());
		String time = timeFormat.format(Calendar.getInstance().getTime());
		for(Schedule sch:scheduleList){
			if((date.substring(0,3).equals("Sun") && sch.getScheduleType().equals("Weekend")) &&
					((new Date(date).before(new Date(sch.getEndDate()))) ||
					(date.equals(sch.getEndDate())) &&
					(new Date(date).after(new Date(sch.getStartDate()))))){
					if( sch.getEndTime().equals(time)){
						for(int i = 0; i<sensorList.size(); i++){
							Sensor sensor = sensorList.get(i);
							sensor.deactivateSensor();
							System.out.println("Successfully deactivated end");
							
						}
						for(int i = 0; i<sys.getActivatedSensors().size();){
				    		Sensor sensor = (Sensor) sys.getActivatedSensors().get(i);
				    		if(!sensor.isActivated()){
				    			sys.removeFromActivatedSensorList(i);
				    		}
				    		else{
				    			i++;
				    		}
				    	}
						sys.setStatus(SysConstants.sysDeactivated);
						ringer.startStoAlarm("Speech Off");
					}
				}
			}
		}
}
