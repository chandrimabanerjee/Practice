package Day3;

import java.util.Scanner;

public class ArmstrongNo {
	public static void ArmstrongNo1(int n) {
		int s=0;
		while(n>0) {
		int m= n%10;
		s=m*m*m +s;
		n=n/10;
	}
		System.out.println(s);
		if(n==s)
			System.out.println("Armstrong no");
		else
			System.out.println("Armstrong no");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		 System.out.println("Enter the number");
		 int n= sc.nextInt();
		 ArmstrongNo1(n);
		
	}
	

}
