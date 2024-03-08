package Day2;

import java.util.Scanner;

public class ExceptionHandelingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n;
      Scanner sc= new Scanner (System.in);
      n= sc.nextInt();
      
      try {
    	  System.out.println(100/n);
      }
      
      catch (Exception e) {
    	  e.printStackTrace();
      }
      
      finally {
    	  System.out.println("print another number");
      }
	}

}
