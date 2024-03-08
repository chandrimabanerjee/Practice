package Day2;

public class ConstructorOverloading {
		int a,b;

		ConstructorOverloading () {
			a=1;b=5;
		}

		ConstructorOverloading (int x,int y) {
			a=x;b=y;
		}
		
		void add() {
			int c=a+b;
			System.out.println(c);
		}
			
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading c= new ConstructorOverloading();
		ConstructorOverloading c1= new ConstructorOverloading(12,13);
		c.add();
		c1.add();
	}

}
