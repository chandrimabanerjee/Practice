package Day3;

import java.util.Scanner;

public class Swapusingthirdvariable {
	public static void swap(int n,int n1) {
		int s=0;
		s=n;
		n=n1;
		n1=s;
		System.out.println("print the number:"+n+ ""+n1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		 System.out.println("Enter the number");
		 int n= sc.nextInt();
		 int n2=sc.nextInt();
		 swap(n,n2);
	}

}
