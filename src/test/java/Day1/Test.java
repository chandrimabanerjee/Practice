package Day1;

import java.util.Scanner;

public class Test {
	
		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		printFloydTriangle(rows);
		}
		public static void printFloydTriangle(int n){
		int number = 1;
		for(int i=0;i<n;i++){
		for(int j=0;j<=i;j++){
		System.out.print(number +" ");
		number++;
		}
		System.out.println();
		}
		}
		}


