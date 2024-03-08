package Day3;

public class BinarySearch {
	public static int BSearch(int a[], int n) {
		int mid;
		int left=0;
		int right= a.length -1;
		while(left<=right) {
		 mid= (left+right)/2;
		 if (a[mid]==n)
			 return mid;
		 else if (a[mid]<n)
			 left=mid+1;
		 else
			 right=mid-1;
	}
	return -1;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]= {10,20,30,40,50};
		  int n= 30;
		  int l= BSearch(a,n);
		  if(l==-1)
			  System.out.println("Item not found");
		  else
			  System.out.println("Element found at index " + l);
	}

}
