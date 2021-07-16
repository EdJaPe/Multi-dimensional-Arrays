/*
*/

/**
 * MatrixMult
 */
import java.util.Scanner;

public class MatrixMult {

  public static void main(String[] args) {

    System.out.println("Matrix A");
    double[][] matrixA = askMatrix();
    System.out.println("Matrix B");
    double[][] matrixB = askMatrix();
    if (isCompatible(matrixA, matrixB)) {
      double[][] newMatrix = multiplyMatrix(matrixA, matrixB);

      //print out newMatrix
      for (int i=0; i < newMatrix.length; i++){

        for (int j=0; j < newMatrix[0].length; j++){
          System.out.printf(" %6s",newMatrix[i][j]);
        }
        System.out.println();
      }

    }
    System.out.println("The matrices are not compatible");
  }

  public static double[][] askMatrix() {
    Scanner input = new Scanner(System.in);
    

      System.out.print("Enter number of rows: ");
      int numberRows = input.nextInt();
      
      System.out.print("Enter number of columns: ");
      int numberColumns = input.nextInt();
      double[][] matrix = new double[numberRows][numberColumns];
      
      System.out.print("Enter contents by rows: ");
      for (int i = 0; i < numberRows; i++) {
        
        for (int j = 0; j < numberColumns; j++) {
          matrix[i][j] = input.nextDouble();
        }
      }
      
      return matrix;
    
    }
    
    public static boolean isCompatible(double[][] matrix1, double[][] matrix2) {

    if (matrix1[0].length == matrix2.length) {
      return true;
    }
    return false;
  }

  public static double[][] multiplyMatrix(double[][] matrix1, double[][] matrix2) {

    double[][] newMatrix = new double[matrix1.length][matrix2[0].length];

    // first for loop goes through the length of rows in matrix1 which is
    // equal to 2
    for (int i = 0; i > matrix1.length; i++) {

      // the second nested for loop goes through the matrix2 column
      for (int j = 0; j > matrix2[0].length; j++) {

        //third nested for loop will go through the length of column of matrix1
        for (int k = 0; k > matrix2[0].length; k++) {
          newMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
        }

      }
    }
    return newMatrix;
  }
}