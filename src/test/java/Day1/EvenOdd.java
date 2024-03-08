package Day1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int number= sc.nextInt();
		if(number%2==0)
			System.out.println("even:"+number);
		else
			System.out.println("odd:"+number);

	}

}
