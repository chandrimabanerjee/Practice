package Day2;

public class MethodOverloading{
int a,b;

void add () {
	a=10;b=11;
	int c=a+b;
	System.out.println(c);}

void add (int x,int y) {
	int c=x+y;
	System.out.println(c);}
	
	public static void main(String args[]) {
		MethodOverloading d=new MethodOverloading();
		d.add();
		d.add(4,5);
	}
}

