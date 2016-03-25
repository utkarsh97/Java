//Assignment : Homework 2
//NetID: up270
//Author: Utkarsh Parasramka
//Completion Time: 


public class GetCard {
	
	public static String getCard() {
		int i = 1 + (int) (Math.random() * 4);
		int j = 2 + (int) (Math.random() * 13);
		String suit;
		String newCard = "";
		//Assigning suit according to random number i
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
		//Assigning number/face according to random number j
		if (j >= 2 && j <= 10){
			newCard = j + " of " + suit;
		}
		else if (j == 11) {
			newCard = "Jack of " + suit;
		}
		else if (j == 12) {
			newCard = "Queen of " + suit;
		}
		else if (j == 13) {
			newCard = "King of " + suit;
		}
		else if (j == 14) {
			newCard = "Ace of " + suit;
		}
		return newCard;
	}

	public static void main(String[] args) {
		String x = getCard();
		System.out.println(x);
	}
	

}
