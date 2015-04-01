package sensorFactory;

/*
 * @author Ashlesha Lapalkar
 * @version 1.1
 * 
 */

public interface Sensor {
	public void activateSensor();
	public void deactivateSensor();
	public boolean isActivated();
	public void setSensorID(int sensorId);
	public int getSensorID();
}
