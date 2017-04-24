package Security;

import Validation.*;

public class Authorization implements IAuthorization {
	int code;
	String psw;
	int incorrectAttempts = 0;
	
	public Authorization(int c, String p) {
		code = c;
		psw = p;
	}
	
	public int getCode() {
		return code;
	}
	
	public String getPsw() {
		return psw;
	}
	
	public void incorrectAttempts() {
		incorrectAttempts++;
	}
	
	public int getNumberIncorrectAttempts() {
		return incorrectAttempts;
	}
}
