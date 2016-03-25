//Assignment : Homework 2
//NetID: up270
//Author: Utkarsh Parasramka
//Completion Time: 


import java.util.Scanner;

public class BlackjackGame {

	//Declaring method to get Card
	public static int getCard(int Total) {
		int i = 1 + (int) (Math.random() * 4);
		int j = 2 + (int) (Math.random() * 13);
		String suit;
		if (i == 1) {
			suit = "Spades.";
		}
		else if (i == 2) {
			suit = "Hearts.";
		}
		else if (i == 3) {
			suit = "Diamonds.";
		}
		else {
			suit = "Clubs.";
		}
		if (j >= 2 && j <= 10) {
			System.out.println(j + " of " + suit);
			Total += j;
		}
		else if (j == 11) {
			System.out.println("Jack of " + suit);
			Total += 10;
		}
		else if (j == 12) {
			System.out.println("Queen of " + suit);
			Total += 10;
		}
		else if (j == 13) {
			System.out.println("King of " + suit);
			Total += 10;
		}
		else if (j == 14) {
			System.out.println("Ace of " + suit);
			Total += 11;
		}
		return Total;
	}
	
	public static void main(String[] args) {
		int playerTotal = 0;
		int computerTotal = 0;
		System.out.println("The player has the following hand:");
		//Drawing 2 cards each for both players
		for (int k = 1; k < 3; k++) {
			playerTotal = getCard(playerTotal);
		}
		System.out.println();
		System.out.println("The computer has the following hand:");
		for (int k = 1; k < 3; k++) {
			computerTotal = getCard(computerTotal);
		}
		System.out.println();
		System.out.println("The player total is: " + playerTotal);
		Scanner in = new Scanner(System.in);
		System.out.println("Do you want to draw a card (y)es or (n)o?");
		String answer = in.next();
		char ch = answer.charAt(0);
		int l = 0;
		int m = 0;
		//Asking player for additional card
		while ((int) ch == (int) 'y' && l < 3) {
			System.out.println("The player drew:");
			playerTotal = getCard(playerTotal);
			System.out.println("The player total is: " + playerTotal);
			l++;
			if (playerTotal > 21) {
				break;
			}
			System.out.println("Do you want to draw a card (y)es or (n)o?");
			answer = in.next();
			ch = answer.charAt(0);
		}
		System.out.println();
		//Drawing 2 cards for dealer
		for (m = 0; m < 2; m++) {
			System.out.println("The computer drew:");
			computerTotal = getCard(computerTotal);
			System.out.println("The computer total is: " + computerTotal);
			if (computerTotal > 21) {
				break;
			}
		}
		//Deciding and printing out winner
		System.out.println();
		System.out.println("The player total is: " + playerTotal);
		System.out.println("The computer total is: " + computerTotal);
		if (playerTotal > 21 && computerTotal > 21) {
			System.out.println("Both players busted, it is a draw.");
		}
		else if (computerTotal > 21 && playerTotal <= 21) {
			System.out.println("Player won.");
		}
		else if (playerTotal > 21 && computerTotal <= 21) {
			System.out.println("Player won.");
		}
		else if (playerTotal > computerTotal && playerTotal <= 21) {
			System.out.println("Player won.");
		}
		else if (computerTotal > playerTotal && computerTotal <= 21) {
			System.out.println("Computer won.");
		}
		else {
			System.out.println("Both players got blackjack, it is a draw.");
		}
		in.close();
	}
}

