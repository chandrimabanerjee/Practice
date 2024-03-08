package Day2;
enum status{
	Running,failed,pending,success;
}
public class EnumExample {

	public static void main(String[] args) {
		status s= status.Running;
		System.out.println(s);
		status arr[]= s.values();
  for (status x: arr)
	  System.out.println(x);
	}

}
