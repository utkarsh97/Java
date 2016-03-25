//Assignment : Homework 1
//NetID: up270
//Author: Utkarsh Parasramka
//Completion Time: 

import java.util.Scanner;

public class Hexagon {

	public static void main(String[] args) {
		
		double x;
		//Asking user for length
		Scanner in = new Scanner(System.in);
		System.out.println("Enter length of side for hexagon.");
		x = in.nextDouble();
		
		//Calculating Area
		double area;
		area = (6*x*x)/(4*(Math.tan(Math.PI/ 6)));
		
		//Calculating Perimeter
		double perimeter;
		perimeter = 6*x;
		
		System.out.println("The area of hexagon with length " + x + " is: " + area);
		System.out.println("The perimeter of hexagon with length " + x + " is: " + perimeter);
		
		in.close();
	
	}

}
