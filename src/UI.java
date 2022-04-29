import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class UI implements ActionListener {

	JFrame core; // The core JFrame
	JFrame gameWindow; // Frame for the game window. 
	JFrame scoreWindow; // Frame for the score window.

	JButton startButton; // Button to start the game.
	JButton playAgainButton; // Button to play again.
	JButton exitButton; // Button to exit.

	Timer timer = new Timer(); // Instance of timer class. 

	// Starts the main menu of the program.
	public void startCore() {

		core = new JFrame();

		JLabel background = new JLabel();

		ImageIcon titleScreen = new ImageIcon("titlescreen.png");
		background.setIcon(titleScreen);
		
		startButton = new JButton();
		startButton.setBounds(525, 460, 150, 50);
		startButton.setText("Start");
		startButton.addActionListener(this);

		core.add(startButton);
		core.add(background);
		core.setSize(1250, 750);

		core.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		core.setTitle("Card Game");
		core.setVisible(true);

	}

	// The game window. 
	public JFrame makeGameWindow() {
		
		gameWindow = new JFrame();
		gameWindow.setSize(1250, 750);
		gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameWindow.setTitle("Card Game");
		gameWindow.setVisible(true);
		gameWindow.setResizable(false);
		gameWindow.setLayout(null);

		JPanel player1NamePanel = new JPanel();
		JPanel player2NamePanel = new JPanel();

		JLabel player1Name = new JLabel();
		JLabel player2Name = new JLabel();

		player1Name.setText("Player 1: You"); 
		player1Name.setVisible(true);

		player2Name.setText("Player 2: Opponent");
		player2Name.setVisible(true);
		
		player1Name.setFont(new Font("Calibri Regular",Font.BOLD,20));
		player2Name.setFont(new Font("Calibri Regular",Font.BOLD,20));
		
		player1NamePanel.add(player1Name);
		player1NamePanel.setBackground(Color.YELLOW);
		player2NamePanel.add(player2Name);
		player2NamePanel.setBackground(Color.YELLOW);
		
		player1NamePanel.setVisible(true);
		player2NamePanel.setVisible(true);
		
		player1NamePanel.setBounds(505, 630, 200, 50);
		player2NamePanel.setBounds(505, 20, 200,50);

		gameWindow.add(player1NamePanel);
		gameWindow.add(player2NamePanel);

		return gameWindow;
	}

	// Makes the game window and starts the game by adding the players and cards.
	public void playGame() {

		gameWindow = makeGameWindow();

		JLabel table = drawBoard();

		JLabel p1c1 = null;
		JLabel p1c2 = null;
		JLabel p1c3 = null;

		JLabel p2c1 = null;
		JLabel p2c2 = null;
		JLabel p2c3 = null;

		Player player1 = new Player();
		Player player2 = new Player();

		player1.populatePlayer();
		player2.populatePlayer();

		
		p1c1 = player1.cardDeck[0];
		p1c2 = player1.cardDeck[1];
		p1c3 = player1.cardDeck[2];

		p2c1 = player2.cardDeck[0];
		p2c2 = player2.cardDeck[1];
		p2c3 = player2.cardDeck[2];

		p1c1.setBounds(325, 380, 169, 230);
		p1c2.setBounds(525, 380, 169, 230);
		p1c3.setBounds(725, 380, 169, 230);

		p2c1.setBounds(325, 90, 169, 230);
		p2c2.setBounds(525, 90, 169, 230);
		p2c3.setBounds(725, 90, 169, 230);

		gameWindow.add(p1c1);
		gameWindow.add(p1c2);
		gameWindow.add(p1c3);

		gameWindow.add(p2c1);
		gameWindow.add(p2c2);
		gameWindow.add(p2c3);

		gameWindow.add(table);
		
		timer(player1, player2);

	}

	// Makes the scoreboard where the score and winner is displayed.
	public JFrame makescoreBoard(Player player1, Player player2) {
		
		JLabel table = drawBoard();

		scoreWindow = new JFrame();
		
		scoreWindow.setSize(1250, 750);
		scoreWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		scoreWindow.setTitle("Card Game");
		scoreWindow.setVisible(true);
		scoreWindow.setResizable(false);
		scoreWindow.setLayout(null);

		playAgainButton = new JButton();
		playAgainButton.setBounds(375, 560, 150, 50);
		playAgainButton.setText("Play Again");
		playAgainButton.addActionListener(this);
		playAgainButton.setVisible(true);
		
		exitButton = new JButton();
		exitButton.setBounds(675, 560, 150, 50);
		exitButton.setText("Exit");
		exitButton.addActionListener(this);
		exitButton.setVisible(true);
		
		JPanel winnerScreen = decideWinner(player1,player2);
	
		scoreWindow.add(playAgainButton);
		scoreWindow.add(exitButton);
		scoreWindow.add(winnerScreen);
		scoreWindow.add(table);
		
		return scoreWindow;

	}

	// Draws the background/table on which the cards are placed.
	public JLabel drawBoard() {
		
		ImageIcon tableImage = new ImageIcon("tablebackground.png");
		JLabel table = new JLabel();
		table.setIcon(tableImage);
		table.setBounds(0, 0, 1250, 750);
		table.setVisible(true);
		return table;

	}
	
	// Decides who the winner is and returns the approriate text.
	public JPanel decideWinner(Player player1, Player player2) {
		
		JPanel summary = new JPanel();
		JLabel winnerText = new JLabel();
		
		int player1Sum = player1.calculateSum();
		int player2Sum = player2.calculateSum();
		
		if (player1Sum > player2Sum) {
			winnerText.setText("Winner is player 1, with a score of " + player1Sum +". Opponents total score is " + player2Sum);
			
		}
		else if (player1Sum < player2Sum) {
			winnerText.setText("Winner is player 2, with a score of " + player2Sum + ". Your total score is " + player1Sum);

		}
		else if (player1Sum == player2Sum || player2Sum == player1Sum){
			winnerText.setText("Draw. Your score is " + player1Sum + ". Opponent score is " + player2Sum);
		}
		
		winnerText.setBounds(475,100,100,100);
		winnerText.setFont(new Font("Calibri Regular",Font.BOLD,20));
		winnerText.setVisible(true);
		
		summary.setVisible(true);
		summary.setBounds(250, 200, 700, 200);
		
		summary.add(winnerText);
		
		return summary;

	} 
	
	// Timer. waits 3.5 secs after displays the cards before closing.
	public void timer(Player player1, Player player2) {
		
		TimerTask wait = new TimerTask() {

			@Override
			public void run() {
				gameWindow.dispose();
				makescoreBoard(player1, player2);
			}
		};
		timer.schedule(wait, 3500);
	}
	
	// For playing the game again.
	public void playAgain() {
		gameWindow.dispose();
		playGame();
	}

	// Actions of the startbutton, playbutton and exitbutton.
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == startButton) {
			core.dispose();
			playGame();
		}

		else if (e.getSource() == playAgainButton) {
			scoreWindow.dispose();
			playAgain();
		} 
		else if (e.getSource() == exitButton) {
			scoreWindow.dispose();
			System.exit(0);
			
		}
	}
}
