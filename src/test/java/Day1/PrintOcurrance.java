package Day1;

import java.util.HashMap;
import java.util.Map.Entry;

public class PrintOcurrance {
		public static void main(String[] args){
		HashMap<Character,Integer> map = new HashMap<>();
		map = findFrequency("Java J2EE Java JSP J2EE");
		for(Entry<Character, Integer> entry: map.entrySet()){
		System.out.println("Frequency of character " + entry.getKey() + " is "+ entry.getValue());
		}
		}
		public static HashMap<Character,Integer> findFrequency(String input){
		char[] arr = input.toLowerCase().replaceAll("\\s+","").toCharArray();
		HashMap<Character,Integer> frequency = new HashMap<>();
		for(char c: arr){
		if(frequency.containsKey(c)){
		frequency.put(c,frequency.get(c) + 1);
		}
		else{
		frequency.put(c,1);
		}
		}
		return frequency;
		}
		}

