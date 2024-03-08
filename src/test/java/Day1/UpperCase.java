package Day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpperCase {
	
		public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string: ");
		String name = br.readLine();
		String s1 = name.substring(0, 2).toUpperCase();
		String nameCapitalized = s1+name.substring(1);;
		System.out.println(nameCapitalized);
		}
		}


