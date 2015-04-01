package installCode;
import java.util.ArrayList;
import java.util.List;

import sensorFactory.*;


public class Room implements BldgComponent{
	
	
	private int roomID;
	private boolean securityAlarm;
	private boolean fireAlarm;
	private String roomName;
	private Sensor sensor;
	private MotionSensor motionSensor;
	private TempSensor tempSensor;

	List <BldgComponent> list = new ArrayList<BldgComponent>();
	public Room(int ID)
	{
		this.roomID = ID;
	}
	public void add(BldgComponent cmp){
		
	}
	
	public void remove(BldgComponent cmp){
		
	}
	public int getID(){
		return roomID;
	}
	
	public void setSecurityAlarm()
	{
		securityAlarm = true;
	}
	
	public void setFireAlarm()
	{
		fireAlarm = true;
	}
	
	public boolean getSecurityAlarm(){
		return securityAlarm;
	}
	
	public boolean getFireAlarm(){
		return fireAlarm;
	}
	
	public List<BldgComponent> getList(){
		return list;
		
	}
	
	public String getName() {
		return roomName;
	}
	
	public void setName(String roomName) {
		this.roomName = roomName;
	}
	@Override
	public void addMotionSensor(MotionSensor sensor) {
		this.motionSensor = sensor;
		
	}
	@Override
	public MotionSensor getMotionSensor() {
		return motionSensor;
	}
	@Override
	public void addTempSensor(TempSensor sensor) {
		this.tempSensor = sensor;
		
	}
	@Override
	public Sensor getTempSensor() {
		return tempSensor;
	}
	
}
