package cards;
/* This class will put in place the basic operations of a dealer in any card
*  game. Some parts are abstract so that children can define those 
*  operations specific to the game being played. 
*/
//--@author: AaronPycraft
//--@version: 0.1
//--@LastModified: 9/20/2014

public abstract class Dealer {
//--Fields
	private boolean isDealerPlaying;	
//--Constructor
	public Dealer() {
		isDealerPlaying=false;
	}	
//--Methods
	public abstract void DealCards() {
	}
//--Exception Handling
}
