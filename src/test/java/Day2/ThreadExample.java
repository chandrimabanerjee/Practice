package Day2;
 class Test extends Thread{
	
	public void run () {
		for(int i=0;i<10;i++) {
			System.out.println("hi");
		}
	}
}
 class Test1 extends Thread{
		public void run () {
			for(int i=0;i<10;i++) {
				System.out.println("hello");
			}
	}
	}

public class ThreadExample   {

	public static void main(String[] args) {
	Test t= new Test();
	Test1 t1=new Test1();
	t.start();
	t1.start();

	}

}
