
public class SetMatrixZero {

	/**
	 * @param args
	 */
	public static void setZeros(int[][] matrix){
		int [] row = new int[matrix.length];
		int [] column = new int[matrix[0].length];
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				if(matrix[i][j] == 0){
					row[i] = 1;
				    column[j] = 1;
				}
			}
		}
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				if(row[i]==1 || column[j]==1)
					matrix[i][j] = 0;
			}
		}
		System.out.println();
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] targetMatrix = {{1,2,3,0,5},{0,2,3,4,5},{1,2,3,4,5},{1,0,3,4,5},{1,2,3,4,5}};
		for(int i = 0; i < targetMatrix.length; i++){
			for(int j = 0; j < targetMatrix[0].length; j++){
				System.out.print(targetMatrix[i][j]+" ");
			}
			System.out.println();
		}
		
		setZeros(targetMatrix);
	}

}
