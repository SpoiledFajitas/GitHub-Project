package Main;


import Mod.startup_screen;

//serves as the main class of the program, will initiate all other parts of the program
public class main {

//First Method run in the program which initializes it
public static void main(String[] args) {
		
		System.out.println("start");
		startup_screen o = new startup_screen();
		o.setVisible(true);
		o.isVisible();
	}
}
