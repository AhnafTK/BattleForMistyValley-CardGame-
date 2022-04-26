
public class Player {
	
	int card1;
	int card2;
	int card3;
	int [] cardDeck = {0,0,0};
	
	public int[] makePlayer() {
		int[] player1 = {0,0,0};
		return player1;
	}
	
	public int[] makePlayer2() {
		int[] player2 = {0,0,0};
		return player2;
	}
	
	public void populatePlayer() {
		
		for (int i = 0; i<cardDeck.length; i++) {
			
			cardDeck[i]=Cards.randomCardNumGenerator(1, 10);
			
			//return cardDeck;
		}
	}
	


}
