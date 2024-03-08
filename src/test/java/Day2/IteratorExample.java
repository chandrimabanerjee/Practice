package Day2;

import java.util.ArrayList;

import org.apache.commons.math3.util.MultidimensionalCounter.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList<Integer> a= new ArrayList<Integer>();
 a.add(3);
 a.add(6);
 a.add(61);
 a.add(1);
 java.util.Iterator<Integer> i=  a.iterator();
 while(i.hasNext())
	 System.out.println(i.next());
	}

}
