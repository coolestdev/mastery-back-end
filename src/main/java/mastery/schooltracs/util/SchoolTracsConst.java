package mastery.schooltracs.util;

import java.text.SimpleDateFormat;

public class SchoolTracsConst {
	
	public static final String HTTPS = "https://";
	public static final String HOST = "my.schooltracs.com";
	public static final String HOST_URL = HTTPS + HOST;
	
	public static final String USER_AGENT = "Apache-HttpClient/4.1.1 (java 1.5)";
	public static final String ACCEPT_ENCODING = "gzip,deflate";
	public static final String CONNECTION = "Keep-Alive";
	public static final String CONTENT_TYPE_JSON = "application/json";
	public static final String CONTENT_TYPE_FORM = "application/x-www-form-urlencoded; charset=UTF-8";
	
	public static final String LOGIN_URL = HOST_URL + "/app/login";
	public static final String INFO_REQ_URL = HOST_URL + "/masteryoim/app/?v=&c=2";
	public static final String FAC_REQ_URL = HOST_URL + "/masteryoim/app/facility/read";
	
	public static final SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public enum Task{
		
		SEARCH_ACTIVITY("Activity.searchActivities");
		
		private String code;
		
		Task(String code){
			this.code = code;
		}
		
		public String code(){
			return code;
		}
	}
	
	public enum DisplayMode{
		COURSE("c"),
		STAFF("t"),
		CUSTOMER("s"),
		FACILITY("r"),
		PRODUCT("p");
		
		private String code;
		
		DisplayMode(String code){
			this.code = code;
		}
		
		public String code(){
			return code;
		}
	}
	
	public enum Timeslot{
		ALL("all"),
		OCCUPIED("occupied");
		
		private String code;
		
		Timeslot(String code){
			this.code = code;
		}
		
		public String code(){
			return code;
		}
	}
	
	public enum Level{
		NONE(-1),
		P1(0),
		P2(1),
		P3(2),
		P4(3),
		P5(4),
		P6(5),
		S1(6),
		S2(7),
		S3(8),
		S4(9),
		S5(10),
		S6(11);
		
		private int code;
		
		Level(int code){
			this.code = code;
		}
		
		public int code(){
			return code;
		}
		
	}
}
