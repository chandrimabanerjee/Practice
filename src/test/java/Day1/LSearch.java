package Day1;

public class LSearch {
	
		static int search(int arr[], int n, int x){
		for(int i = 0;i<n;i++){
		if(arr[i] == x)
		return i;
		}
		return -1;
		}
		public static void main(String[] args){
		int[] arr = {5,1,9,4,3,8};
		int n = arr.length;
		int x = 4;
		int index = search(arr,n,x);
		if(index == -1){
		System.out.println("Element is not present in the array");
		}
		else
		System.out.println("Element found at position " + index);
		}
		}



