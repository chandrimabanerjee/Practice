package Day3;

import java.util.Scanner;

public class FindLeapYearorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int year;
     Scanner sc= new Scanner (System.in);
     year=sc.nextInt();
     if (year%400==0 && year%100==0 || year%100!=0 && year %4==0)
    	 System.out.println("Leap year");
     else
    	 System.out.println("Not Leap year");
	}

}
