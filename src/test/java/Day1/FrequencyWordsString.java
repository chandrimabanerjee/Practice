package Day1;

import java.util.HashMap;

public class FrequencyWordsString {

	public static void FreString(String str) {
		String s[]=str.split(" ");
		
		HashMap<String,Integer> h=new HashMap<String,Integer>();
		for(int i=0;i<s.length;i++)
		{
			if(h.containsKey(s[i])) {
				h.put(s[i],h.get(s[i])+1);
			}
			
			else
				h.put(s[i],1);
		}
		System.out.println(h);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss="My name is is Chandrima";
		FreString(ss);
	}

}
