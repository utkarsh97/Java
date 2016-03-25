//Assignment : Homework 3
//NetID: up270
//Author: Utkarsh Parasramka
//Completion Time: 

import java.util.Scanner;

public class IsSorted {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int array[] = new int[10];
		for (int i=0; i<10; i++) {
			System.out.println("Enter a number:");
			int number = in.nextInt();
			array[i] = number;
		}
		int j = 0;
		//Comparing each element to see if sorted
		for (int i=0; i<9; i++) {
			if (array[i] <= array[i+1]) {
				j++;
				continue;
			}
			//Using break to stop looping and print result
			else {
				System.out.println("List is not sorted.");
				break;
			}
		}
		if (j == 9) {
			System.out.println("List is sorted");
		}
		in.close();

	}

}
