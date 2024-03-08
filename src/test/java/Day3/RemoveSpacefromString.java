package Day3;

import java.util.Scanner;

public class RemoveSpacefromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		 String s1=" Enter the No ";
		 String s2[] = s1.split(" ");
		 
		 for (int i=0;i<s2.length;i++)
				System.out.print(s2[i]);
	}

}
