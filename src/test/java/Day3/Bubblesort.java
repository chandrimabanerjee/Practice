package Day3;

public class Bubblesort {
	public static void bubbleSort(int arr[]) {
		int temp;
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr.length-1;j++) {
				if (arr[j] > arr[j+1])
				{
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
					
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
		bubbleSort(arr);
		System.out.println("Sorted array");
		for (int i=0; i<arr.length; ++i)
			System.out.print(arr[i] + " ");
	}

}
