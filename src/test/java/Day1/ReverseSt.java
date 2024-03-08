package Day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseSt {
	
		public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string: ");
		String name = br.readLine();
		String odd = "";
		String reversedString = reverseString(name.replaceAll("\\s",""));
		//System.out.println(reverseString);
		for(int i=0;i<reversedString.length();i++){
		if(i%2!=0){
		odd = odd + reversedString.charAt(i);
		}
		}
		System.out.println(odd);
		}
		public static String reverseString(String s){
		String rev="";
		char[] arr = s.toCharArray();
		for(int i=arr.length-1;i>=0;i--)
		rev = rev + arr[i];
		return rev;
		}
		
}

