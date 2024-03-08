package Day1;

public class ForEachExample {


		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int a[]= {2,7,6,9,1};
			int max=a[0];
			for (int x:a) {
				if(x>max)
					max=x;
			}
			
			
			System.out.println("largestno:"+max);
			}
	
	}


