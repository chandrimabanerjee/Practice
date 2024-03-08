package Day3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountOfCharinStringOrStatement {
	public static void FreString(String str) {
		char ch[]=str.toCharArray();
		
		HashMap<Character,Integer> h=new HashMap<Character,Integer>();
		for(char c: ch)
		{
			if(!String.valueOf(c).isBlank())
			if(h.containsKey(c)) {
				h.put(c,h.get(c)+1);
			}
			
			else
				h.put(c,1);
		}
		//System.out.println(h);//print all char
		//print only duplicate
		Set <Entry<Character,Integer>> entrySet=h.entrySet();
		for(Map.Entry<Character,Integer> entry :entrySet){  
			if(entry.getValue()>1)
            System.out.println(entry.getKey() + " : " +entry.getValue());  
        }  
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss="My name is is Chandrima";// this will give word how many times occurs in a sentence
		
		FreString(ss);
	}
	
	

}
