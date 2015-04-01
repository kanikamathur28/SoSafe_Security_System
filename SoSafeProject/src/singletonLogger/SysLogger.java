package singletonLogger;

/*
 * @author Ashlesha Lapalkar
 * @version 1.1
 * 
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class SysLogger {
	static private SysLogger instance = new SysLogger();
	static public SysLogger getInstance(){
		return instance;
	}
	
	private SysLogger(){}
	
	public void writeToLogFile(Date date, String serviceType, String location){
		BufferedWriter writer = null;
		String input = null;
		try {
			writer = new BufferedWriter(new FileWriter("LogFile.txt", true));
			input = date + ","+serviceType+","+location;
			writer.write(input);
			writer.newLine();
			writer.close();
		}
		 catch (IOException e) {
			e.printStackTrace();
		}
	}
}
