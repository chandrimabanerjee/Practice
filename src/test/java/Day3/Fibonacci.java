package Day3;

public class Fibonacci {
public static void fibonacci () {
	int a=1,b=0;
	int s;
	//System.out.print(b+" "+a);
	for (int i=1;i<=10;i++) {
	
		s=a+b;
		b=a;
		a=s;
		System.out.print(" "+s);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonacci();
	}

}
