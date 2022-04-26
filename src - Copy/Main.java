import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		UI startMain = new UI();
		Cards card = new Cards();
		startMain.startCore();
		
		
		//card.instantiateCards();
		card.makeCard();
		
		int[] player1 = {0,0,0};
		int[] player2 = {0,0,0};
		
		/**
		for (int i = 0; i<player1.length; i++) {
			player1[i]=Cards.randomCardNumGenerator(1, 10);
		}
		
		for (int i = 0; i<player2.length; i++) {
			player2[i]=Cards.randomCardNumGenerator(1, 10);
		}
		
		for (int i = 0; i<player1.length; i++) {
			System.out.println("Player 1 nums are: " + player1[i]);;
		}
		System.out.println("Player 1 total sum is " + (player1[0]+player1[1]+player1[2]));
		
		for (int i = 0; i<player2.length; i++) {
			System.out.println("Player 2 nums are: " + player2[i]);;
		}
		System.out.println("Player 1 total sum is " + (player2[0]+player1[1]+player1[2]));
		//System.out.println(Cards.randomCardNumGenerator(1, 10));
	**/
	}
	
	

}
