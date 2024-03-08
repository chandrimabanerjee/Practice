package Day1;

public class Palindrome {


		public static void main(String[] args){
			int number=123;
			int temp=number;
			int RN=Palindrome(number);
			if (temp==RN)
				
				System.out.println("Palindrome");
			else
				System.out.println("Not Palindrome");
		}
			public static int Palindrome(int no) {
				int digit;
				int sum=0;
				while(no>0) {
				digit=no%10;
				sum=sum*10+ digit;
				no=no/10;}
				return sum;
			}

}
