package Day2;


class D{
	public void show() {
		System.out.println("I am in show");
	}
}
public class AnonymousIneerClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   C a= new C() {
			   public void show() {
					System.out.println("I am IN iNNER CLASS");
				} 
		   };
		   a.show();
		 
	}

}
