package cards;

public class Deck {
//--Constructor
	public Deck() {
		Card[] deck = new Card[52];
//		H = Heart  = 	72 ASCII
//		D = diamond = 	68 ASCII
//		S = spade =		83 ASCII
//		C = club = 		67 ASCII
//		A = ace = 		65 ASCII
//		K = king = 		75 ASCII
//		Q = queen = 	81 ASCII
//		J = jack = 		74 ASCII
//		2 thru 10 are cards 1-10
		for(int i=0, j=2;i==10;i++) {
			deck[i]=new Card("H",String.valueOf(j) );
		}
		
	}
//--Methods
//	public Card getTopCard() {
//	return null;
//	}
	
}


