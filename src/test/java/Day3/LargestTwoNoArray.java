package Day3;

import java.util.Scanner;

public class LargestTwoNoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		System.out.print("Enter no. of elements you want in array:");
		int n = scn.nextInt();
		int array[] = new int[n];
		for (int j=0;j<n;j++) {
			array[j]=scn.nextInt();
		}
		System.out.println("Enter all the elements:");
		int largest1=0;
		int largest2=0;
		if(array[1]>array[0]) {
			largest1=array[1];
			largest2=array[0];
		}
		else {
			largest1=array[0];
			largest2=array[1];
	}
		for(int i=2;i<array.length;i++) {
			if(array[i]>largest1) {
				largest2=largest1;
				largest1=array[i];
			
		}
			else if (array[i] > largest2 && array[i] != largest1)
			{
			largest2 = array[i];
			
			}
			}
			System.out.println ("The First largest is " + largest1);
			System.out.println ("The Second largest is " + largest2);
			}
			}


