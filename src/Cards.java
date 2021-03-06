
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Cards {
	
	ImageIcon[] cards = new ImageIcon[10]; // Array for the cards
	int cardNum = 0; // Variable for the card number.
	ImageIcon art = null; // Contains the art associated with the card.
	// Contains the art for cards1-10. 
	ImageIcon card1 = new ImageIcon("card1.png");
	ImageIcon card2 = new ImageIcon("card2.png");
	ImageIcon card3 = new ImageIcon("card3.png");
	ImageIcon card4 = new ImageIcon("card4.png");
	ImageIcon card5 = new ImageIcon("card5.png");
	ImageIcon card6 = new ImageIcon("card6.png");
	ImageIcon card7 = new ImageIcon("card7.png");
	ImageIcon card8 = new ImageIcon("card8.png");
	ImageIcon card9 = new ImageIcon("card9.png");
	ImageIcon card10 = new ImageIcon("card10.png");

	// Gives the elements of the array a card. 
	public void instantiateCards() {
		
		cards[0] = card1;
		cards[1] = card2;
		cards[2] = card3;
		cards[3] = card4;
		cards[4] = card5;
		cards[5] = card6;
		cards[6] = card7;
		cards[7] = card8;
		cards[8] = card9;
		cards[9] = card10;

	}
	

	// Generates a random number. Used to pick cards for the deck. 
	public static int randomCardNumGenerator(int min, int max) {
		
		int randInt = (int)(Math.random() * (max-min)+1);
		return randInt;
	}
	
	// Makes the card and returns it.
	public JLabel makeCard() {
		
		instantiateCards();
		int randomCardNumber = randomCardNumGenerator(0,10);
		this.cardNum = randomCardNumber;
		ImageIcon art = cards[randomCardNumber-1];
		this.art = art;
		JLabel card = new JLabel();
		card.setIcon(art);
		
		return card;
	}
	
	
	// returns the card number.
	public int returnCardNum() {
		return cardNum;
	}
}
	

	
	
	
	
	
	
	


