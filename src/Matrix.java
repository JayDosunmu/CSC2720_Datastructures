/**
 * This class contains 
 * @author Taslim (Jay) Dosunmu
 * @version 1.0
 * @since 25 Aug 2017
 */

public class Matrix {
	/**
	 * 
	 * @param matrixA
	 * @param matrixB
	 * @return
	 */
	public static int[][] add(int[][] matrixA, int[][] matrixB) {
		if (matrixA[0].length != matrixB[0].length ||
			matrixA.length != matrixB.length) {
			throw new IllegalArgumentException("The dimensions of the inputted matrices do not match");
		}
		
		int[][] output = new int[matrixA.length][matrixA[0].length];
		
		for (int i=0; i<matrixA.length; i++){
			for (int j=0; j<matrixA[0].length; j++) {
				output[i][j] = matrixA[i][j] + matrixB[i][j];
			}
		}
		
		return output;
		
	}
	
	/**
	 * 
	 * @param matrixA
	 * @param matrixB
	 * @return
	 */
	public static int[][] dot(int[][] matrixA, int[][] matrixB) {
		if (matrixA[0].length != matrixB.length) {
			throw new IllegalArgumentException("The number of rows of the second matrix does not match the number of columns of the first");
		}
		
		int[][] output = new int[matrixA.length][matrixB[0].length]; 
		
		for (int i=0; i<matrixA.length; i++) {
			for (int j=0; j<matrixA[0].length; j++) {
				for (int k=0; k<matrixB[0].length; k++) {
					output[i][k] += matrixA[i][j] * matrixB[j][k];
				}
			}
		}
		
		return output;
	}

}
