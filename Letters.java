//Assignment : Homework 2
//NetID: up270
//Author: Utkarsh Parasramka
//Completion Time: 


import java.util.Scanner;

public class Letters {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a character: ");
		String letter = in.next();
		//Converting string to character type
		char ch1 = letter.charAt(0);
		//Converting to lower for easier comparison
		char ch = Character.toLowerCase(ch1);
		//Checking if it is a letter
		boolean letter1 = Character.isLetter(ch);
		if (letter1) {
			int i = (int) ch;
			if (i == (int) 'a') {
				System.out.println(ch1 + " is a vowel.");
			}
			else if (i == (int) 'e') {
				System.out.println(ch1 + " is a vowel.");
			}
			else if (i == (int) 'i') {
				System.out.println(ch1 + " is a vowel.");
			}
			else if (i == (int) 'o') {
				System.out.println(ch1 + " is a vowel.");
			}
			else if (i == (int) 'u') {
				System.out.println(ch1 + " is a vowel.");
			}
			else {
				System.out.println(ch1 + " is a consonant.");
			}
		} 
		else {
			System.out.println(ch1 + " is not a letter.");
		}
		in.close();

	}

}
