package systems;

/*
 * @author Ashlesha Lapalkar
 * @version 1.1
 * 
 */

import java.util.ArrayList;
import java.util.List;

import sensorFactory.TempSensor;

public class FireSystem {
	private String ID;
	
	List<TempSensor> installedSensors;
	List<TempSensor> activatedSensors;
	
	public FireSystem(String ID){
		this.ID = ID;
		installedSensors = new ArrayList<TempSensor>();
		activatedSensors = new ArrayList<TempSensor>();
	}

	public void addtoInstalledSensorList(TempSensor sensor){
		installedSensors.add(sensor);
	}
	
	public void addToActivatedSensorList(TempSensor sensor){
		activatedSensors.add(sensor);
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public List<TempSensor> getInstalledSensors() {
		return installedSensors;
	}

	public List<TempSensor> getActivatedSensors() {
		return activatedSensors;
	}

}
