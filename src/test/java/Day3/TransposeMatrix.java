package Day3;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};
		//creating another matrix to store the sum of two matrices
		int c[][] = new int[3][3];
		for(int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				c[i][j]= a[j][i];
		
		System.out.print(c[i][j]);
			}
			System.out.println(" ");	
		}

	}

}
