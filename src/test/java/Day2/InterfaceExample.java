package Day2;
 interface A{
	int s=10; int a=55;
	void circle();
	default void shape() {
		System.out.println("test shape");
	}
	static void rect() {
		System.out.println("rectangle");
	}
}
public class InterfaceExample implements A{

        public void circle() {
        	System.out.println("you are in circle");
        }
        public static void main(String[] args) {
        A l= new InterfaceExample();
        l.shape();
        l.circle();
        A.rect();// static menthod can access directly
        
	}


}
