package Day2;
interface L{
	
	void display();
}
public class FunctinalInterfacewithLamda  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     L e= ()->{
    	 System.out.println("this is method");
	};
  e.display();
}
}
