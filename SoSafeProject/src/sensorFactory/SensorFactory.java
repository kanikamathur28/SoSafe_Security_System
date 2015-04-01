package sensorFactory;

/*
 * @author Ashlesha Lapalkar
 * @version 1.1
 * 
 */
import systems.*;

public class SensorFactory {
	
	public Sensor createSensor(String sensorCode, int id, String location){
		if(sensorCode.equals(SysConstants.TEMP_SENSOR))
			return new TempSensor(id, location);
		else if(sensorCode.equals(SysConstants.MOTION_SENSOR))
			return new MotionSensor(id, location);
		else
			return null;
	}
}



