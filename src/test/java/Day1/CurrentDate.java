package Day1;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CurrentDate {
	
private static final SimpleDateFormat sdf = new SimpleDateFormat
("yyyy/MM/dd HH:mm:ss");
		
		public static void main(String[] args) {
		Date date = new Date();
		System.out.println(sdf.format(date));
		Calendar cal = Calendar.getInstance();
		System.out.println(sdf.format(cal.getTime()));
		}}
		
		
		
