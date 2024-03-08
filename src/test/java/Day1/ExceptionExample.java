package Day1;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int num=100;int i;
  
  try {
	   i=num/0;
  }
  
  catch(Exception e)
  {System.out.println(""+e);}
	}

}
