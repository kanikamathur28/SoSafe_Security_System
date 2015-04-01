package installCode;
import java.util.ArrayList;
import java.util.List;

import sensorFactory.MotionSensor;
import sensorFactory.Sensor;
import sensorFactory.TempSensor;


public class Building implements BldgComponent{
	
	List <BldgComponent> list = new ArrayList<BldgComponent>();
	private int bldgID;
	private String bldngName;
	
	public Building(int ID)
	{
		bldgID = ID;
	}
	public void add(BldgComponent cmp){
		list.add(cmp);
	}
	
	public void remove(BldgComponent cmp){
		list.remove(cmp);
	}
	public List<BldgComponent> getList(){
		return list;
	}
	public void setSecurityAlarm(){};
	public void setFireAlarm(){};
	public boolean getSecurityAlarm(){return false;};
	public boolean getFireAlarm(){return false;};
	public int getID(){return 0;}
	@Override
	public String getName() {
		return bldngName;
	}
	@Override
	public void addMotionSensor(MotionSensor sensor) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public MotionSensor getMotionSensor() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void addTempSensor(TempSensor sensor) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Sensor getTempSensor() {
		// TODO Auto-generated method stub
		return null;
	};

}
