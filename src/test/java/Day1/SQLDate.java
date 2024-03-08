package Day1;

import java.util.Date;

public class SQLDate {

		public static void main(String[] args) {
		//long millis=System.currentTimeMillis();
			Date D=new Date();
		java.sql.Date date=new java.sql.Date(D.getTime());
		System.out.println(date);
		}
		}

