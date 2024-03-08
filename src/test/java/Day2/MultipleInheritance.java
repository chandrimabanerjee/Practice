package Day2;
interface A1{
	
	default void shape() {
		System.out.println("test shape");
	}
}
	interface B{
		
		default void shape1() {
			System.out.println("2nd one");
		}
	}
	
public class MultipleInheritance implements A1,B{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritance M= new MultipleInheritance();
		M.shape();
		M.shape1();
	}

}
