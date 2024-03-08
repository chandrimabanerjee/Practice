package Day2;
class Abc{
	static Abc a=new Abc();
	private Abc() {
		
	}
	public static Abc get() {
		return a;
	}
	
}
public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Abc b=Abc.get();

	}

}
