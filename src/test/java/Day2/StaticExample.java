package Day2;

public class StaticExample {
 static int a=10;
 int b;
 
 void m() {
	 
	 System.out.println("non static menthod");
 }
 static void m1() {
	 
	 System.out.println("static menthod");
 }	
	
	public static void main(String[] args) {
		System.out.println(a);
		m1();
		StaticExample s= new StaticExample();
		s.m();
		s.b=12;
		 System.out.println(s.b);	
		

	}

}
