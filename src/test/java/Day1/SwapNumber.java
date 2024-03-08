package Day1;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int x= sc.nextInt();
		int y= sc.nextInt();
		int z;
		z=x;
		x=y;
		y=z;
		System.out.println("after swap:"+x +" "+y);
	}

}
