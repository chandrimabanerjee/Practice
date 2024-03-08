package Day1;

public class Pascal {

		static void printPascal(int n)
		{
			for (int i=0;i<n;i++) {
				
				//for printing spaces
				for (int j=1;j<n-i;j++) {
					System.out.print(" ");
				}
				//for printing number
				int number=1;
				for(int k=0;k<=i;k++) {
					System.out.print(number+" ");
					number=number*(i-k)/(k+1);
				}
				System.out.println();
			}
		}
		public static void main(String args[])
		{
		int n = 5;
		printPascal(n);
		}
		}

