package simulator;

/*
 * @author Ashlesha Lapalkar
 * @version 1.1
 * 
 */

import java.net.URL;
import java.util.Date;

import javax.media.ControllerEvent;
import javax.media.ControllerListener;
import javax.media.EndOfMediaEvent;
import javax.media.Manager;
import javax.media.MediaLocator;
import javax.media.Player;

import singletonLogger.SysLogger;

public class AlarmRinger {
	Player player;

	public void ringAlarm(String alarm){
	 	try {
		       	 URL url = this.getClass().getClassLoader().getSystemResource(alarm+".wav");
		            MediaLocator locator = new MediaLocator(url);
		            player = Manager.createPlayer(locator);
		            player.addControllerListener(new ControllerListener() {
		               public void controllerUpdate(ControllerEvent event) {
		                  if (event instanceof EndOfMediaEvent) {
		                     player.stop();
		                     player.close();
		                  }
		               }
		            });
		            player.realize();
		            player.start();
		            Thread.sleep(5000);
		            player.stop();
		         } catch (Exception e) {
		            e.printStackTrace();
		         }
	 }
	
	public void startStoAlarm(String alarm){
		try {
	       	 URL url = this.getClass().getClassLoader().getSystemResource(alarm+".wav");
	            MediaLocator locator = new MediaLocator(url);
	            player = Manager.createPlayer(locator);
	            player.addControllerListener(new ControllerListener() {
	               public void controllerUpdate(ControllerEvent event) {
	                  if (event instanceof EndOfMediaEvent) {
	                     player.stop();
	                     player.close();
	                  }
	               }
	            });
	            player.realize();
	            player.start();
	         } catch (Exception e) {
	            e.printStackTrace();
	         }
	}
}
