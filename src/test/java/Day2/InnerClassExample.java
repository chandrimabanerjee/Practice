package Day2;
 class C{
	public void show() {
		System.out.println("I am in show");
	}
class B	{
	public void config() {
		System.out.println("I am in config");
	}
}
 }
 
public class InnerClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    C a= new C();
    a.show();
    C.B obj= a.new B();
    // if B is static write like  A.B obj= new A.B();
    obj.config();
	}

}
