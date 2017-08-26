import java.util.Arrays;


public class TestMatrixOperations {

	public static void test() {
		System.out.println("====================================\n");
		System.out.println("=== Testing Matrix Operations... ===\n");
		System.out.println("====================================\n");

		// Matrix addition test suite
		System.out.println("Matrix addition:");

		System.out.println("======== Valid =======");
		int[][] matrixAddValidA = {{1, 2, 3}, {1, 2, 3}};
		int[][] matrixAddValidB = {{1, 2, 3}, {1, 2, 3}};
		System.out.println("MatrixA:\n"+Arrays.deepToString(matrixAddValidA));
		System.out.println();
		System.out.println("MatrixB:\n"+Arrays.deepToString(matrixAddValidB));

		int[][] addResult = Matrix.add(matrixAddValidA, matrixAddValidB);
		System.out.println("\nMatrix addition result:\n"+Arrays.deepToString(addResult));

		System.out.println("\n======= Invalid ======");
		int[][] matrixAddInvalidA = {{1, 2, 3}, {1, 2, 3}};
		int[][] matrixAddInvalidB = {{1}, {2}};
		System.out.println("MatrixInvalidA:\n"+Arrays.deepToString(matrixAddInvalidA));
		System.out.println();
		System.out.println("MatrixInvalidB:\n"+Arrays.deepToString(matrixAddInvalidB));
		try {
			int[][] invalidAddResult = Matrix.add(matrixAddInvalidA, matrixAddInvalidB);
			System.out.println("\nDot product result:\n"+Arrays.deepToString(invalidAddResult));
		} catch(IllegalArgumentException e) {
			System.out.println("\nMatrix addition cancelled: Error-- " + e.getMessage());
			System.out.println("Correctly raised an error for invalid matrix addition.");	
		}
		
		// Matrix multiplication test suite
		System.out.println("\nMatrix multiplication:");
	
		System.out.println("======== Valid =======");
		int[][] matrixMultiplyValidA = {{1, 2, 3}, {1, 2, 3}};
		int[][] matrixMultiplyValidB = {{1}, {2}, {3}};
		System.out.println("MatrixA:\n"+Arrays.deepToString(matrixMultiplyValidA));
		System.out.println();
		System.out.println("MatrixB:\n"+Arrays.deepToString(matrixMultiplyValidB));
		
		int[][] dotResult = Matrix.dot(matrixMultiplyValidA, matrixMultiplyValidB);
		System.out.println("\nDot product result:\n"+Arrays.deepToString(dotResult));

		System.out.println("\n======= Invalid ======");
		int[][] matrixInvalidA = {{1, 2, 3}, {1, 2, 3}};
		int[][] matrixInvalidB = {{1}, {2}};
		System.out.println("MatrixInvalidA:\n"+Arrays.deepToString(matrixInvalidA));
		System.out.println();
		System.out.println("MatrixInvalidB:\n"+Arrays.deepToString(matrixInvalidB));
		try {
			int[][] invalidDotResult = Matrix.dot(matrixInvalidA, matrixInvalidB);
			System.out.println("\nDot product result:\n"+Arrays.deepToString(invalidDotResult));
		} catch(IllegalArgumentException e) {
			System.out.println("\nMatrix dot product cancelled: Error-- " + e.getMessage());
			System.out.println("Correctly raised an error for invalid dot product.");	
		}
		
		System.out.println("\nMatrix Operations test complete");
		
	}

}
