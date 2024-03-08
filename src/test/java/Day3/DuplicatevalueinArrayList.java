package Day3;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicatevalueinArrayList {
public static void findduplicate(ArrayList l) {
	
	 HashSet s=new HashSet<>(l);
	 if(s.size()==l.size())
	 {System.out.println("Not Found duplicate element in array");
		}
			else
				{System.out.println("Found duplicate element in array");
			
			}
		
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList a= new ArrayList<>();
 a.add(1);
 a.add("sen");
 a.add(1);
 findduplicate(a);
	}

}
