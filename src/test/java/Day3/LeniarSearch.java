package Day3;

public class LeniarSearch {

	public static int LSearch(int a[], int n) {
	int i=0;
		for (i=0;i<a.length;i++) {
			if(a[i]==n) 
				return i;
		} 
				return -1;	
	}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a[]= {10,20,30,40,60};
  int n= 30;
  int l= LSearch(a,n);
  if(l==-1)
	  System.out.println("Item not found");
  else
	  System.out.println("Item found"+l);
	}
}


