package sensorFactory;

/*
 * @author Ashlesha Lapalkar
 * @version 1.1
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class TempSensor implements Sensor {
	private boolean isActivated = false;
	private int sensorID;
	private String sensorLocation;
	List<Sensor> sensorList;
	public TempSensor(){}
	
	public TempSensor(int id, String location){
		this.sensorID = id;
		this.sensorLocation = location;
		sensorList = new ArrayList<Sensor>();
	}
	
	@Override
	public void activateSensor() {
		isActivated = true;
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
