package Day1;

public class FactorialUsingrecursino {
	
	static int factorial(int n){
		
		if (n == 0)
		return 1;
		else
			
		return (n*factorial(n-1));
		}
		public static void main(String args[]){
		int i;
		int number=5,res;
		res = factorial(number);
		System.out.println("Factorial of "+number+" is: "+res);
		}
		}


