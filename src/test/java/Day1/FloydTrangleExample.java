package Day1;

import java.util.Scanner;

public class FloydTrangleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();
		floyd(number);
	}
	
	public static void floyd(int rows) {
		int number=1;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<=i;j++){
				System.out.print(number+"");
				number++;
			}
			System.out.println();
					
		}
	}

}
