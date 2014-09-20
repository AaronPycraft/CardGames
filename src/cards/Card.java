package cards;

public class Card {

//-Fields
	private String cardValue;
	private String suit;
	//--H = Heart
	//--D = diamond
	//--S = spade
	//--C = club
	//--A = ace
	//--K = king
	//--Q = queen
	//--J = jack
	//--2 thru 10 are cards 1-10
//--Constructor
	public Card() {
	}
	public Card(String newSuit, String newCardValue) {
		this.setSuit(newSuit);
		this.setCardValue(newCardValue);
	}
	
//--Methods
	public String getSuit() {
		return this.cardValue;
	}
	
	public void setSuit(String newSuit) {
		this.suit = newSuit;
	}
	
	public String getCardValue() {
		return this.cardValue;
	}
	
	public void setCardValue(String newCardValue) {
		this.cardValue = newCardValue;
	}
}