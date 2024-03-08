package Day1;

import java.util.*;

public class CompareHashmap {
	
	 public static Boolean compareMaps()
	 {
		Map<String, String> country1 = new HashMap<String, String>();
		country1.put("Japan", "Tokyo");
		country1.put("China", "Beijing");
		Map<String, String> country2 = new HashMap<String, String>();
		country2.put("Japan", "Tokyo");
		country2.put("China", "Beijing");
		if(country1==country2){
		return true;
		} else
		return false;
		}
	 public static void main(String args[]) {
		 boolean b= compareMaps();
		 System.out.println(b);

}
	
}
