package Chapter_3;
/*
 * Write a program that simulates picking a card from a deck of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card
 */
import java.util.Random;

public class Chapter3_24 {

	public static void main(String[] args) {
		Random rand = new Random();
		int card = rand.nextInt((13 - 1) + 1) + 1 ;
		int suit = rand.nextInt((4 - 1) + 1 ) + 1;
		String cardIs = "";
		String suitIs = "";
		
		if (card == 1) {
			cardIs="Ace";
		} else if (card==2) {
			cardIs = "2";
		} else if (card==3) {
			cardIs = "3";
		} else if (card==4) {
			cardIs = "4";
		} else if (card==5) {
			cardIs = "5";
		} else if (card==6) {
			cardIs = "6";
		} else if (card==7) {
			cardIs = "7";
		} else if (card==8) {
			cardIs = "8";
		} else if (card==9) {
			cardIs = "9";
		} else if (card==10) {
			cardIs = "10";
		} else if (card==11) {
			cardIs = "Jack";
		} else if (card==12) {
			cardIs = "Queen";
		} else if (card==13) {
			cardIs = "King";
		} 
		
		if (suit==1) {
			suitIs = "Clubs";
		} else if (suit==2) {
			suitIs = "Diamonds";
		} else if (suit==3) {
			suitIs = "Hearts";
		} else if (suit==4) {
			suitIs = "Spades";
		} 
		
		System.out.println("The card you picked is the " + cardIs + " of " + suitIs + ".");
	}

}
