package Day1;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();
		AmrstongNo(number);}
	public static void AmrstongNo(int n) {
		int sum=0;
		int temp=n;
		while(n>0) {
			int d=n%10;
			sum=sum+(d*d*d);
			n=n/10;}
		if(sum==temp)
			System.out.println("Armstrong");
		else
			System.out.println("not Armstrong");	
		}
	
	}


