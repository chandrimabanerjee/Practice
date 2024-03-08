package Day3;

import java.util.Scanner;

public class PalindromeNo {
	  public static void Palindroma(int n) {
		  int s=0;int m;
		  int n1=n;
		  while(n>0) {
		  m=n%10;
		  s=s*10+m;
		  n=n/10;}
		  //System.out.println(n1);
		  if(s==n1) {
			  System.out.println("Palindrom");}
			  else
				  System.out.println("Not Palindrom");  
		  }
	  
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 Scanner sc= new Scanner (System.in);
			 System.out.println("Enter the number");
			 int n= sc.nextInt();
			 Palindroma(n);
		}

	}
	
