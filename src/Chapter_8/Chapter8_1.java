package Chapter_8;

import java.util.Scanner;

public class Chapter8_1 {

	public static void main(String[] args) {
		double[][] matrix = createMatrix();

		for (int i = 0; i < matrix[0].length; i++) {	
			System.out.println(
				"The sum ofcolumn " + (i+1) + " is " + sumColumn(matrix, i));
		}

	}

	public static double sumColumn(double[][] m, int columnIndex) {
		
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i][columnIndex];		
		}
		return sum;
	}
	
	public static double[][] createMatrix() {
		
		int row = 3;
		int column = 4;
		double[][] m = new double[row][column];
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[i].length; j++) 
				m[i][j] = (int)(Math.random()*10);
		return m;
	}
}
