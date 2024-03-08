package Day3;

public class PerfectNo {
 public static boolean perfectnno(int n) {
	 int sum=0;
	 for(int i=1;i<n;i++) {
		 if(n%i==0)
		 sum=sum+i;
	 }
	 if (n==sum)
		 return true;
	 else
		 return false;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		
   boolean flag=perfectnno(n);
   if (flag==true)
	   System.out.println("Perfect no");
   else
	   System.out.println("Not Perfect no");
	}

}
