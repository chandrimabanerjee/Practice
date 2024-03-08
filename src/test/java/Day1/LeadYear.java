package Day1;

public class LeadYear {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=2024;
		Leapyear(number);
		System.out.println();
	}
	public static void Leapyear(int y) {
		if(y%100==0 && y%400==0 || y%100!=0 && y%4==0)
			System.out.println("leap year");
		else
			System.out.println("not leap year");
	}

}
