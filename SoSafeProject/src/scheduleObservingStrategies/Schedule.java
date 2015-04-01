package scheduleObservingStrategies;
/*
 * @author Ashlesha Lapalkar
 * @version 1.1
 * 
 */

public class Schedule{
	private String startTime, endTime, startDate, endDate, scheduleType;
	
	public Schedule(){}
	
	private Schedule(ScheduleBuilder builder){
		this.startTime = builder.startTime;
		this.endTime = builder.endTime;
		this.startDate = builder.startDate;
		this.endDate = builder.endDate;
		this.scheduleType = builder.scheduleType;
	}
	
	public static class ScheduleBuilder{
		private String startTime, endTime, startDate, endDate, scheduleType;
		
		public ScheduleBuilder startTime(String startTime){
			this.startTime = startTime;
			return this;
		}
		
		public ScheduleBuilder endTime(String endTime){
			this.endTime = endTime;
			return this;
		}
		
		public ScheduleBuilder startDate(String startDate){
			this.startDate = startDate;
			return this;
		}
		
		public ScheduleBuilder endDate(String endDate){
			this.endDate = endDate;
			return this;
		}
		
		public ScheduleBuilder scheduleType(String schedType){
			this.scheduleType = schedType;
			return this;
		}
		
		public Schedule buildSchedule(){
			return new Schedule(this);
		}
	}
	public String getStartTime() {
		return startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public String getStartDate() {
		return startDate;
	}

	public String getEndDate() {
		return endDate;
	}
	
	public String getScheduleType(){
		return scheduleType;
	}
	
}
