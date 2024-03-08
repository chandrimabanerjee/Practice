package Day3;

import java.util.Scanner;

public class StarasRows {
public static void startprint(int n) {
	for (int i=0;i<n;i++) {
		for (int j=0;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		 System.out.println("Enter the row number");
		 int n= sc.nextInt();
		
		 startprint(n);
	}
	

}
