import javax.swing.JLabel;

public class Player {
	
	JLabel [] cardDeck = {null,null,null}; // Card deck
	int[] cardNums = {0,0,0}; // The numbers associated with the cards.

	// Populates the players decks.
	public void populatePlayer() {
		Cards cards = new Cards();
		for (int i = 0; i<cardDeck.length; i++) {
			
			cardDeck[i]=cards.makeCard();
			cardNums[i]=cards.returnCardNum();
		}
	}
	
	// Calculates the sum of the numbers and returns it.
	public int calculateSum() {
		int sum = ((cardNums[0]+cardNums[1]+cardNums[2]));
		return sum;
	}
	

}
