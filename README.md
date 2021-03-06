# BattleForMistyValley-CardGame-
* By: Ahnaf Kamal
* Project time: April 2022, ~1 month

## What is Battle for Misty Valley?
This program is a basic card game. The player and the opponent both get 3 cards, numbering betweeen 1-10. The player with the greater sum of the numbers on the card wins.
## What does it use?
* Written in Java
  - Arrays
  - Java Swing components (JFrame, JPanel, ImageIcon.. etc) 
 
## How does it work?
All the card images are stored in an imageIcon of size 10, with index 0-9 corresponding to card numbers 1-10. 
A random number is then generated, which gets returned into the makeCard() function, which uses the returned number to get the card art for that card number. The icon is set and the card is made and returned. 
The player and the opponents decks are populated in this manner. The sum of the cards is then calculated and the winner is declared. This program is run on the java Swing components, using JFrames and JPanels to create the main menu, the card table and the winner screen.

## Screenshots of the program running
### Main menu screen
![image](https://user-images.githubusercontent.com/91911908/165984867-9596706a-fc41-4072-b43c-2be1480e8bbc.png)
### Card table scene
![image](https://user-images.githubusercontent.com/91911908/166124209-657c89f0-e212-4142-bbbc-da5e5f5b102d.png)
### Results scene
![image](https://user-images.githubusercontent.com/91911908/166124216-fe08e7b3-5c35-498e-bae5-6958e7940430.png)


