package Day3;

import java.util.Arrays;

public class Anagram {
	
	public static void anagram (String s1,String s2) {	
		if (s1.length()==s2.length()) 
			{char c[]=s1.toCharArray();
			char c1[]=s2.toCharArray();

			Arrays.sort(c);
			Arrays.sort(c1);
			boolean s=Arrays.equals(c,c1);
			if (s) {
				System.out.println(s1 + " and " + s2 + " are anagrams");
				} else {
				System.out.println(s1 + " and " + s2 + " are not anagrams");
				}
				}
		}
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s1="Race";
      String s2="arce";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		anagram(s1,s2);

}
}
