package Day3;

import java.util.Scanner;

public class PrimeNo {
	public static void primenumber(int n) {
		boolean flag=false;
	for(int i=2;i<n/2;i++) {
		if (n%i==0) {
			flag=true;
		}
	}
	if (flag==true)
			System.out.println("number is not prime");
		
		else
			System.out.println("number is prime");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc= new Scanner (System.in);
 System.out.println("Enter the number");
 int n= sc.nextInt();
 primenumber(n);

}
}
