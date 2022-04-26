import javax.swing.JLabel;

public class Player {
	
//	int card1;
	//int card2;
	//int card3;
	
	JLabel [] cardDeck = {null,null,null};
	int[] cardNums = {0,0,0};

	public void populatePlayer() {
		Cards cards = new Cards();
		//cards.displayCards();
		for (int i = 0; i<cardDeck.length; i++) {
			
			cardDeck[i]=cards.makeCard();
			cardNums[i]=cards.returnCardNum();
			//return cardDeck;
		}
	}
	

	public int calculateSum() {
		int sum = ((cardNums[0]+cardNums[1]+cardNums[2]));
		return sum;
	}
	
	
	
	
	
	

	
	


}
