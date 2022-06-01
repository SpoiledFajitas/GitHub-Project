package mod;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import viewcon.Controller;

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
	
	public boolean getWin1() { return win1;}
	public boolean getWin2() { return win2;}
	public boolean getWin3() { return win3;}
	
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


	private int rndm() {
		int x = 3;
		return x * ric;
	}

/*
	private void nextMap(){
		_maze = new Maze(m);
		m++;
		_ply.getLoc().getCol();
		_ply.getLoc().getRow();
		_min = new Minotaur(_maze.getSpawn());
		_min2 = new Minotaur(_maze.get_spawn2());
		_min3  = new Minotaur(_maze.get_spawn3());
		_cnt = new Controller(_ply, _min, _maze, JOptionPane.showInputDialog("What is your name"),"Type wasd to move. Sword?" + _ply.hasSword(), _trp, _min2, _min3);

		update();
	}
	
	*/
	
	
	
	
}