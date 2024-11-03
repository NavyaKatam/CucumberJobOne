package util;

import java.util.Date;

public class Utilities {
	
	public static final int EXPLICIT_WAIT_TIME = 30;
	
	public static String getNewEmailWithTimeStamp() {
		return new Date().toString().replaceAll("\\s","").replaceAll("\\:","")+"@gmail.com";
	}

}
 