package Day3;

import java.util.Scanner;

public class OddEvenNumber {
	public static void oddeven(int n) {
		if (n%2==0) {
			System.out.println("number is even");
		}
		else
			System.out.println("number is odd");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc= new Scanner (System.in);
 System.out.println("Enter the number");
 int n= sc.nextInt();
 oddeven(n);
 
	}

}
