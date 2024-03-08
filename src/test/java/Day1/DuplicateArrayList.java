package Day1;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateArrayList {
	
	public static void findDuplicates(ArrayList<Integer> input) {
		Set<Integer> duplicates = new HashSet<Integer>(input);
		if (duplicates.size()==input.size())
		{System.out.println("Not Found duplicate element in array");
	}
		else
			{System.out.println("Found duplicate element in array");
		System.out.println(""+duplicates.size());}
		}
	
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(3);
	
           findDuplicates(list);
	}

}
