package Day3;

import java.util.Scanner;

public class ReverseNo {
  public static void reverseno(int n) {
	  int s=0;int m;
	  while(n>0) {
	  m=n%10;
	  s=s*10+m;
	  n=n/10;}
	  System.out.println("Reverse No:" +s);}
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner (System.in);
		 System.out.println("Enter the number");
		 int n= sc.nextInt();
		 reverseno(n);
	}

}
