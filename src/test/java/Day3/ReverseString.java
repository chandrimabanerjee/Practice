package Day3;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int i;
		 System.out.println("Enter first String");
		 String s1;
		 s1=sc.nextLine();
		 char a[]= s1.toCharArray();
		 for (i=s1.length()-1;i>=0;i--) {
			System.out.print(a[i]);
		 }
		
	}

}
