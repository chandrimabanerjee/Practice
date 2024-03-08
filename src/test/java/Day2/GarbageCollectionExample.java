package Day2;
class Tes{
	Tes(){
		System.out.println("Object is created");
	}
	protected void finalize() {
		System.out.println("Object is destroyed");
	}
}
public class GarbageCollectionExample {

	public static void main(String[] args) {
		Tes t1=new Tes();
		t1=null;
		System.gc();// call the finalize method before object destroyed

	}

}
