//Assignment : Homework 1
//NetID: up270
//Author: Utkarsh Parasramka
//Completion Time: 

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		
		System.out.println("Enter number of employees.");
		Scanner in = new Scanner(System.in);
		int numberOfEmployees = in.nextInt();
		
		//For loop for names and bonus'
		String name = "";
		int bonus = 0;
		//Second variable to track second highest
		String name2 = "";
		int bonus2 = 0;
		for (int i = 1; i <= numberOfEmployees; i += 1) {
			System.out.println("Enter name of employee " + i);
			String name1 = in.next();
			System.out.println("Enter bonus of employee " + i);
			int bonus1 = in.nextInt();
			if (bonus1 > bonus) {
				bonus2 = bonus;
				name2 = name;
				bonus = bonus1;
				name = name1;
			}
			//Else if statement in case of exceptions
			else if (bonus1 > bonus2) {
				bonus2 = bonus1;
				name2 = name1;
			}
			else {
				continue;
			}
		}
		System.out.println("Employee with highest bonus is: " + name);
		System.out.println("His bonus is: " + bonus);
		System.out.println("Employee with second highest bonus is: " + name2);
		System.out.println("His bonus is: " + bonus2);
		in.close();
	}

}
