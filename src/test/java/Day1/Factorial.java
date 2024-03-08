package Day1;

public class Factorial {

	public static void fact(int n) {
		int i,fact=1;
		for(i=1;i<=n;i++){
		fact=fact*i;
		}
	     System.out.println(fact);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     fact(5);

	}

}
