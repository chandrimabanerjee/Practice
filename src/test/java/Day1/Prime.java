package Day1;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	int number = sc.nextInt();
	boolean flag=false;
	for (int i=2;i<number/2;i++)
		{if(number%i==0)
			{flag=true;
		break;}
		}
	System.out.println(""+flag);
	if (flag==false)
		System.out.println("Prime");
	else
		System.out.println("Not Prime");
	
}
}
