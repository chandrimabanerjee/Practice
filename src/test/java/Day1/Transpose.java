package Day1;

public class Transpose {

	public static void main(String args[]) {
		//creating two matrices
		int a[][] = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};
		int trans[][]=new int [3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				trans[i][j]=a[j][i];
			
			System.out.print(trans[i][j]+"");}
			System.out.println();
		}
	}
}
			
	
