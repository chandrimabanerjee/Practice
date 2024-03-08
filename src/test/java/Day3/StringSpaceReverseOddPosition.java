package Day3;

import java.util.Scanner;

public class StringSpaceReverseOddPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int i;
		 System.out.println("Enter first String");
		 String s1;
		 s1=sc.nextLine();
		 //String s2[]=s1.split(" ");
		 for (i=s1.length() - 1;i>=0;i--) {
			 if(i%2!=0)
			 System.out.print(s1.charAt(i));
			 
		 }
	}

}
