package Day3;

import java.util.Scanner;

public class FloydTraingle {
	public static void floyd(int rows) {
		int n=1;
		for (int i=0;i<rows;i++) {
			for (int j=0;j<=i;j++) {
				System.out.print(n);
				n++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		 System.out.println("Enter the row number");
		 int n= sc.nextInt();
		 floyd(n);
	}

}
