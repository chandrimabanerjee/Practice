package Day3;

import java.util.Scanner;

public class Multiplicationtable {
public static void multi(int n) {
	int s;
	for(int i=0;i<=10;i++) {
		s=n*i;
		System.out.println(n+"*"+i+"="+s);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		 System.out.println("Enter the row number");
		 int n= sc.nextInt();
		 multi(n);
	}

}
