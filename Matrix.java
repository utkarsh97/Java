//Assignment : Homework 4
//NetID: up270
//Author: Utkarsh Parasramka
//Completion Time: 

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int rows = in.nextInt();
		System.out.println("Enter number of columns:");
		int columns = in.nextInt();
		while (rows<1 || rows>5 || columns<1 || columns>5) {
			System.out.println("Enter number of rows:");
			int row = in.nextInt();
			rows = row;
			System.out.println("Enter number of columns:");
			int column = in.nextInt();
			columns = column;
		}
		int [][] Matrix = new int[rows][columns];
		for (int row=0; row<Matrix.length; row++) {
			for (int col=0; col<Matrix[row].length; col++) {
				Matrix[row][col] = (int) (-10 + Math.random()*21);
			}
		}
		System.out.println();
		printMatrix(Matrix);
		System.out.println();
		System.out.println("(t)ranspose, (r)owMax, (c)olumnMax or (q)uit?");
		char answer1 = in.next().charAt(0);
		answer1 = Character.toLowerCase(answer1);
		while (Character.isLetter(answer1)) {
			if (answer1 == 't') {
				int [][] transpose = transpose(Matrix);
				System.out.println();
				printMatrix(transpose);
			}
			else if (answer1 == 'r') {
				int [] rowMax = rowMax(Matrix);
				System.out.println();
				printMatrix(rowMax);
			}
			else if (answer1 == 'c') {
				int [] columnSum = columnSum(Matrix);
				System.out.println();
				printMatrix(columnSum);
			}
			else if (answer1 == 'q') {
				break;
			}
			else {
				System.out.println("Error");
			}
			System.out.println();
			System.out.println("(t)ranspose, (r)owMax, (c)olumnMax or (q)uit?");
			char answer = in.next().charAt(0);
			answer1 = Character.toLowerCase(answer);
		}	
		in.close();
	}
	
	public static void printMatrix(int [] matrix) {
		for (int row=0; row<matrix.length; row++) {
			System.out.printf("%3d", matrix[row]);
		}
	}
	
	public static void printMatrix(int [][] matrix) {
		for (int row=0; row<matrix.length; row++) {
			for (int col=0; col<matrix[row].length; col++) {
				System.out.printf("%3d", matrix[row][col]);
			}
			System.out.println();
		}
	}
	
	public static int [][] transpose(int [][] matrix) {
		int [][] matrix1 = new int[matrix.length][matrix[0].length];
		for (int row=0; row<matrix1.length; row++) {
			for (int col=0; col<matrix1[row].length; col++) {
				matrix1[row][col] = matrix[col][row];
			}
		}
		return matrix1;
	}
	
	public static int [] rowMax(int [][] matrix) {
		int [] matrix1 = new int[matrix.length];
		int counter = 0;
		for (int row=0; row<matrix.length; row++) {
			int max = -20;
			for (int col=0; col<matrix[row].length; col++) {
				if (matrix[row][col] > max) {
					max = matrix[row][col];
				}
			}
			matrix1[counter] = max;
			counter += 1;
		}
		return matrix1;
	}
	
	public static int [] columnSum(int [][] matrix) {
		int [] matrix1 = new int[matrix.length];
		int counter = 0;
		for (int row=0; row<matrix.length; row++) {
			int sum = 0;
			for (int col=0; col<matrix[row].length; col++) {
				sum += matrix[row][col];
			}
			matrix1[counter] = sum;
			counter += 1;
		}
		return matrix1;
	}

}
