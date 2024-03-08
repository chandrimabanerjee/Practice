package Day3;

import java.util.Scanner;

public class Stringcompare {
	public static void oddeven(String s1, String s2) {
		if(s1.equals(s2)) {
			System.out.println("String are equals");
		}
		else
			System.out.println("String are not equals");
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner (System.in);
		 System.out.println("Enter first String");
		 String s1=sc.nextLine();
		 String s2=sc.nextLine();
		 oddeven(s1,s2);
		 
		
	}

}
