package systems;

/*
 * @author Ashlesha Lapalkar
 * @version 1.1
 * 
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Observable;

import scheduleObservingStrategies.*;
import sensorFactory.*;
import systemSecurity.User;

public class MainSystem<T extends Sensor> extends Observable{
	private String ID;
	List<Sensor> installedSensors;
	List<Sensor> toBeActivatedSensors;
	List<Sensor> activatedSensors;
	List<Schedule> scheduleList;
	HashMap<String, User> sysUsers = new HashMap<String, User>();
	private String status;
	private String systemResponseCode;
	private String teleNo;
	
	
	public MainSystem(){
		installedSensors = new ArrayList<Sensor>();
		toBeActivatedSensors = new ArrayList<Sensor>();
		activatedSensors = new ArrayList<Sensor>();
		scheduleList = new ArrayList<Schedule>();
	}
	
	public MainSystem(String ID){
		this.ID = ID;
		installedSensors = new ArrayList<Sensor>();
		toBeActivatedSensors = new ArrayList<Sensor>();
		activatedSensors = new ArrayList<Sensor>();
		scheduleList = new ArrayList<Schedule>();
	}

	

	public List<Sensor> getInstalledSensors() {
		return installedSensors;
	}


	public List<Sensor> getToBeActivatedSensors() {
		return toBeActivatedSensors;
	}

	public List<Sensor> getActivatedSensors() {
		return activatedSensors;
	}
	
	public void removeFromActivatedSensorList(int index){
		activatedSensors.remove(index);
	}

	public List<Schedule> getScheduleList() {
		return scheduleList;
	}

	public void addtoInstalledSensorList(Sensor sensor){
		installedSensors.add(sensor);
	}
	
	public void addToActivatedSensorList(Sensor sensor){
		activatedSensors.add(sensor);
	}
	
	public void addInToBeActivatedSensorList(Sensor sensor){
		toBeActivatedSensors.add(sensor);
	}
	
	public void addSchduleToList(Schedule schedule){
		scheduleList.add(schedule);
		setChanged();
		notifyObservers(this.getScheduleList());
	}
	
	public void addToUserList(String id, User user){
		sysUsers.put(id, user);
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getSystemResponseCode() {
		return systemResponseCode;
	}

	public void setSystemResponseCode(String systemCode) {
		this.systemResponseCode = systemCode;
	}

	public String getTeleNo() {
		return teleNo;
	}

	public void setTeleNo(String teleNo) {
		this.teleNo = teleNo;
	}
	
	public List<User> getUserList(){
		ArrayList<User> valuesList = new ArrayList<User>(sysUsers.values());
		return valuesList;
	}
}
