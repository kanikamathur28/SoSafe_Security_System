package systems;

/*
 * @author Ashlesha Lapalkar
 * @version 1.1
 * 
 */
import java.util.ArrayList;
import java.util.List;

import sensorFactory.*;

public class SecuritySystem extends MainSystem{
	
	private String ID;
	List<MotionSensor> installedSensors;
	List<MotionSensor> activatedSensors;
	
	public SecuritySystem(String ID){
		this.ID = ID;
		installedSensors = new ArrayList<MotionSensor>();
		activatedSensors = new ArrayList<MotionSensor>();
	}

	public void addtoInstalledSensorList(MotionSensor sensor){
		installedSensors.add(sensor);
	}
	
	public void addToActivatedSensorList(MotionSensor sensor){
		activatedSensors.add(sensor);
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public List<MotionSensor> getInstalledSensors() {
		return installedSensors;
	}

	public List<MotionSensor> getActivatedSensors() {
		return activatedSensors;
	}

}
