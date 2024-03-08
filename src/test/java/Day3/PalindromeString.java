package Day3;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
	
		 System.out.println("Enter first String");
		 String s1;
		 String rev="";
		 s1=sc.nextLine();
		 String original=s1;
		 for (int i=s1.length()-1;i>=0;i--) {
			 rev= rev+ s1.charAt(i);
		 }
		 if (original.equals(rev)) {
			 System.out.println("Palidroma");
		 }
		 else
		 System.out.println("Not Palidroma");
	}

}
