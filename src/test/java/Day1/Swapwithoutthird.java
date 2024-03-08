package Day1;

import java.util.Scanner;

public class Swapwithoutthird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int x= sc.nextInt();
		int y= sc.nextInt();
		x=x+y;
		y=x-y;
		x=x-y;
			
		
		System.out.println("after swap:"+x +" "+y);
	}

}
