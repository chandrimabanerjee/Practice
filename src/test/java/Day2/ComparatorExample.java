package Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Comparator<Integer> c= new Comparator<Integer>(){
      public int compare(Integer i, Integer j) {
				if (i%10>j%10)
					return 1;
				else return -1;
			}

		
		};
		 ArrayList<Integer> a= new ArrayList<Integer>();
		 a.add(3);
		 a.add(6);
		 a.add(61);
		 a.add(1);
		 //Collections.sort(a);
		 Collections.sort(a,c);//sort 
		 
		 // if we want to sort as per our own logic then corparator
		 System.out.println(a);
	}

}
