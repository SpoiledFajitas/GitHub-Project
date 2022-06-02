package mod;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import viewcon.Controller;

//controls how the crossword operates and checks if the word inputed in a specific line for the crossword is right,
//if so it makes the word appear on the map as completed and updates a counter. It will also check if the user gets 
//too many wrong guesses so they will loose.
public class Overseer {

	private Controller _cnt;
	private Maze _maze;
	private int m =1;
	private int winNum = 1;
	private int _level = 0;
	private boolean win1 = false;
	private boolean win2 = false;
	private boolean win3 = false;
	private boolean win4 = false;
	private boolean win5 = false;
	private int tries;
	private String command1;
	private int ric =1;


	//creates a new overseer which will create a new Maze, a new controller, and it will give the user options on which word they want to guess
	//it will loop until the player wins by getting all the words or runs out of attempts.
	public Overseer() {
		_maze = new Maze(_level);
		_cnt = new Controller(_maze, "", win1, win2, win3, win4, win5);
		command1 = JOptionPane.showInputDialog(null, _cnt.drawMap()  + "what would you like to do?" + "\n" + "options: " + "guess | " + "hint" + "\n"+ "lives left: " + tries);
		fCheck();
		tries = rndm();
		while((!win1 || !win2 || !win3|| !win4 || !win5) && update() != 2) {
			_maze = new Maze(_level);
			_cnt = new Controller(_maze, "", win1, win2, win3, win4, win5);
			command1 = JOptionPane.showInputDialog(null, _cnt.drawMap()  + "what would you like to do?" + "\n" + "options: " + "guess | " + "hint" + "\n"+ "lives left: " + tries);
			fCheck();
			update();
		}
		
		
	}
	

	//tells if the first word has been guessed
	public boolean getWin1() { return win1;}

	//tells if the second word has been guessed
	public boolean getWin2() { return win2;}

	//tells if the third word has been guessed
	public boolean getWin3() { return win3;}

	//tells if the fourth word has been guessed
	public boolean getWin4() { return win4;}
	

	//checks if the word given for the previously selected word to be gussed is correct. If it is it updates the corresponding win, if it isnt.
	//An attempt is lost. Additionally, it will also check for the rico cheat, where if your name is rico, it will let you see all the answers.
	public void fCheck() {
		String temp = "";
		String temp2 = "";
		if(command1.equals("guess")) {
			temp = JOptionPane.showInputDialog(null, "which word would you like to guess?" + "n/" + "Horizontal1| Vertical2| Vertical4| Vertical5| Horizontal12");
			if(temp.equals("Horizontal1")){
				temp2 = JOptionPane.showInputDialog(null, "what is your guess, please type in all CAPS");
				if(temp2.equals("NO")) {
					win1 = true;
				}
				else {
					tries --;
				}
			}
			else if(temp.equals("Vertical4")){
				temp2 = JOptionPane.showInputDialog(null, "what is your guess, please type in all CAPS");
				if(temp2.equals("BABY")) {
					win2 = true;
				}
				else {
					tries --;
				}
			}
			else if(temp.equals("Vertical5")){
				temp2 = JOptionPane.showInputDialog(null, "what is your guess, please type in all CAPS");
				if(temp2.equals("ZINC")) {
					win3 = true;
				}
				else {
					tries --;
				}
			}
			else if(temp.equals("Horizontal12")){
				temp2 = JOptionPane.showInputDialog(null, "what is your guess, please type in all CAPS");
				if(temp2.equals("BUYBACKS")) {
					win4 = true;
				}
				else {
					tries --;
				}
			}
			else if(temp.equals("Vertical2")){
				temp2 = JOptionPane.showInputDialog(null, "what is your guess, please type in all CAPS");
				if(temp2.equals("OVERBITE")) {
					win5 = true;
				}
				else {
					tries --;
				}
			}
		}
		else if(command1.equals("Rico")||command1.equals("rico")){
			ric = -1;
			JOptionPane.showMessageDialog(null, "Horizontal1 is NO| Vertical2 is OVERBITE| Vertical4 is BABY| Vertical5 is ZINC| Horizontal12 is BUYBACKS");
		}
		else if(command1.equals("hint")||command1.equals("Hint")){
			JOptionPane.showMessageDialog(null, "Horizontal1: opposite of yes|" + "\n" + "Vertical2: when your top teeth extend beyond your bottom teeth|" + "\n" + "Vertical4: Opposite of adult|" + "\n" + "Vertical5: symbol Zn and Atomic number 30|" + "\n" + "Horizontal12: the process when a company buys its own shares");
		}
	}
	
	//checks if the player has won or lost. If the player guessed all the words they won and they get a victory message, if they ran
	//ran out of attempts they lost so they get a loss message. If neither is true the game keeps going.
	private int update() {
		ImageIcon sad = new ImageIcon("SadMOM.png");
		ImageIcon happy = new ImageIcon("HappyMOM.png");
		if(win1 && win2 && win3 && win4&& win5) {
			JOptionPane.showMessageDialog(null, "", "You won and showed your mom, she loves you", JOptionPane.INFORMATION_MESSAGE, happy);
			_cnt.victory();
			winNum++;
			return 1;
		}
		else if(tries ==0) {
			JOptionPane.showMessageDialog(null,"", "Your mom isnt mad, just disappointed, but she still loves you",  JOptionPane.INFORMATION_MESSAGE, sad);
			_cnt.defeat();
			return 2;
		}
		return 0;

	}

	//returns a number of 3 times the value of ric.
	private int rndm() {
		int x = 3;
		return x * ric;
	}

/*

	*/
	
	
	
	
}