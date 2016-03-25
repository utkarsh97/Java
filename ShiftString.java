//Assignment : Homework 3
//NetID: up270
//Author: Utkarsh Parasramka
//Completion Time: 

import java.util.Scanner;

public class ShiftString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string:");
		String answer = in.nextLine();
		System.out.println("Enter number of letters to shift:");
		int number = in.nextInt();
		String word = shift(answer, number);
		System.out.println(word);
		in.close();
	}
	public static String shift(String word, int numberToShift) {
		char array[];
		array = word.toCharArray();
		for (int j = 0; j < numberToShift; j++) {
			char letter = 0;
			char lastLetter = array[array.length - 1];
			for (int i=0; i<array.length; i++) {
				if (i == 0) {
					letter = array[0];
					array[i] = lastLetter;
				}
				else {
					lastLetter = array[i];
					array[i] = letter;
					letter = lastLetter;
				}
				
			}
		}
		String shiftedWord = new String(array);
		return shiftedWord;
		
	}

}
