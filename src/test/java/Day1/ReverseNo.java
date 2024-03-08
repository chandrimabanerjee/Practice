package Day1;

public class ReverseNo {

	public static void main(String[] args) {
		int number=456;
		int RN=ReverseNo(number);
		System.out.println(RN);
		}
		public static int ReverseNo(int n) {
			int sum=0;
			while(n>0) {
				int digit=n%10;
				sum=sum*10+digit;
				n=n/10;}
			return sum;
				
				
			}
}
			
		

	


