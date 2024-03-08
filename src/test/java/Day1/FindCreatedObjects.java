package Day1;

public class FindCreatedObjects {
	static int noOfObjects = 0;
	{
	noOfObjects = noOfObjects + 1;
	}
	public FindCreatedObjects()
	{
	}
	public FindCreatedObjects(int n)
	{
	}
	public FindCreatedObjects(String s)
	{
	}
	public static void main(String args[])
	{
		FindCreatedObjects t1 = new FindCreatedObjects();
		FindCreatedObjects t2 = new FindCreatedObjects(5);
		FindCreatedObjects t3 = new FindCreatedObjects("Automation");
	System.out.println(FindCreatedObjects.noOfObjects);
	}
	}


