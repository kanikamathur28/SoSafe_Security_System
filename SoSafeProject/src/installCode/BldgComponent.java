package installCode;
import java.util.List;
import sensorFactory.*;


public interface BldgComponent {
	public void add(BldgComponent cmp);
	public void remove(BldgComponent cmp);
	public List<BldgComponent> getList();
	public void setSecurityAlarm();
	public void setFireAlarm();
	public boolean getSecurityAlarm();
	public boolean getFireAlarm();
	public int getID();
	public String getName();
	public void addMotionSensor(MotionSensor sensor);
	public MotionSensor getMotionSensor();
	public void addTempSensor(TempSensor sensor);
	public Sensor getTempSensor();
	
}
