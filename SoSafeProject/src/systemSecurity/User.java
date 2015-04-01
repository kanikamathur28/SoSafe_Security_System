package systemSecurity;

/*
 * @author Ashlesha Lapalkar
 * @version 1.1
 * 
 */

public class User {
	
	String userCode;
	String userPasscode;
	
	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserPasscode() {
		return userPasscode;
	}

	public void setUserPasscode(String userPasscode) {
		this.userPasscode = userPasscode;
	}

	public User(){}
	
	public User(String code, String passcode){
		this.userCode = code;
		this.userPasscode = passcode;
	}

	

}
