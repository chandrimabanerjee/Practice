package Day1;

public class RemoveDuplicate {
	
	public static void main(String[] args)
	{
	String input="Welcome to QAScript Java Interview Question in QAScript";
	String arr[]=input.split(" ");
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i].equals(arr[j]))
			{
				arr[j]=null;
			}
		}
	}
	for(int k=0;k<arr.length;k++) {
		if(arr[k]!=null)
			System.out.println(arr[k]);
	}
		
			
	
}
}
