import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UI implements ActionListener{
	
	JButton startButton = new JButton();
	
	public void startCore() {
		
		JFrame core = new JFrame();
		JLabel background = new JLabel();
		Cards card = new Cards();
		
		JLabel cardArt = card.makeCard();
		JLabel cardArt2 = card.makeCard();
		JLabel cardArt3 = card.makeCard();
		
		cardArt.setSize(400,400);
		cardArt.setBounds(100, 100, 200, 0);
		
		cardArt2.setSize(400,400);
		cardArt2.setBounds(100, 100, 400, 0);
		
		cardArt3.setSize(400,400);
		cardArt3.setBounds(100, 100, 500, 0);
		
		//ImageIcon titleScreen = new ImageIcon("titlescreen.png");
		
		
		
		
		core.setSize(1280,720);
		core.setVisible(true);
		
		//background.setIcon(titleScreen);
		
		//startButton.setBounds(640, 360, 150, 50);
		//startButton.setText("Start");
		//startButton.addActionListener(this);
		
		
		//core.add(startButton);
		//core.add(background);
		core.add(cardArt);
		core.add(cardArt2);
		core.add(cardArt3);
		
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==startButton) {
			System.out.println("e");
		}
		
	}
	
	

	

	
	
	

}
