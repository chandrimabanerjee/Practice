package Day2;
class Test2 implements Runnable{
	
	public void run () {
		for(int i=0;i<10;i++) {
			System.out.println("hi");
		}
	}
}
 class Test3 implements Runnable{
		public synchronized void run () {
			for(int i=0;i<10;i++) {
				System.out.println("hello");
			}
	}
	}


public class ThreadRunnableEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Test2 t= new Test2();
		Test3 t1=new Test3();
		Thread tt= new Thread(t);
		Thread kk= new Thread(t1);
		tt.start();
		kk.start();
		System.out.println(tt.isAlive());
		tt.join();
		kk.join();
		System.out.println("Bye");

	}
}

