package Day1;

import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		Double f= sc.nextDouble();
		Double c;
		c=(f-32)*5/9;
		
		System.out.println(""+c);
	}

}
