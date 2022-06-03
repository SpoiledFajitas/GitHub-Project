package main;

import mod.Overseer;

import javax.swing.*;

//main class of the program that will begin the program and allow it to run
public class Main {
	
	//Begins the program as well as giving the user a start up message for the crossword.
	public static void main(String[] args0) {
		ImageIcon start = new ImageIcon("startMOM.png");
		JOptionPane.showMessageDialog(null,"", "Your mom gives you a crossword. You dont like crosswords but you like your mom, so you do the crossword", JOptionPane.INFORMATION_MESSAGE, start);
		JOptionPane.showMessageDialog(null,"Rico Mod menu must be initialized before attempting first guess in order to recieve infinite lives" + "\n" + "otherwise you will see the answers but will not recieve infinite lives");
		Overseer o = new Overseer();
	}
}
