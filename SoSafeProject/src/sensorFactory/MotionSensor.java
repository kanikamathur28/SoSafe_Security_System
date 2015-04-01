package sensorFactory;

/*
 * @author Ashlesha Lapalkar
 * @version 1.1
 * 
 */

public class MotionSensor implements Sensor{

	private int sensorID;
	private String sensorLocation;
	private boolean isActivated = false;
	
	public MotionSensor(){}
	
	public MotionSensor(int id, String location){
		this.sensorID = id;
		this.sensorLocation = location;
	}

	public int getSensorID() {
		return sensorID;
	}

	public void setSensorID(int sensorID) {
		this.sensorID = sensorID;
	}

	public String getSensorLocation() {
		return sensorLocation;
	}

	public void setSensorLocation(String sensorLocation) {
		this.sensorLocation = sensorLocation;
	}

	@Override
	public void activateSensor() {
		isActivated = true;
	}

	@Override
	public void deactivateSensor() {
		isActivated = false;
	}

	@Override
	public boolean isActivated() {
		if(isActivated == true)
			return true;
		else
			return false;
	}

}
