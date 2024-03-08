package Day1;

public class Perfectno {

	static boolean isPerfect(int n)
	{
	int sum = 0;
	for (int i = 1; i<n; i++)
	{
	if (n % i==0)
	{
     sum=sum+i;
	}
	}
	if (sum == n )
	return true;
	return false;
	}
	public static void main (String[] args)
	{
	System.out.println("Below are all perfect" +
	"numbers till 10000");
	for (int n = 2; n < 10000; n++)
	if (isPerfect(n))
	System.out.println( n +
	" is a perfect number");
	}
	}

