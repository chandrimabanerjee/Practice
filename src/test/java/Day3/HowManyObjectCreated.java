package Day3;



public class HowManyObjectCreated {
	static int noOfObjects = 0;
	{
	noOfObjects = noOfObjects + 1;
	}
	public HowManyObjectCreated ()
	{
	}
	public HowManyObjectCreated(int n)
	{
	}
	public HowManyObjectCreated(String s)
	{
	}
	public static void main(String args[])
	{
		HowManyObjectCreated t1 = new HowManyObjectCreated();
		HowManyObjectCreated t2 = new HowManyObjectCreated(5);
		HowManyObjectCreated t3 = new HowManyObjectCreated("Automation");
	System.out.println(HowManyObjectCreated.noOfObjects);
	}
	
	}


