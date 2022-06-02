package viewcon;

import javax.swing.JOptionPane;


import mod.Maze;
import mod.Overseer;

//Will control the visuals showing a victory screen, and also will update the map every time a correct word is guessed to have the word
//show up on the map.
public class Controller {

	private Maze _map;
	private String _msg;
	private boolean _victory;
	private boolean _win1;
	private boolean _win2;
	private boolean _win3;
	private boolean _win4;
	private boolean _win5;

	//returns if the game was won or not
	public boolean getVictory(){return _victory;}


	//creates a new controller with the map type, the name of the player, and if all 5 words have been guessed.
	public Controller(Maze map, String m, boolean w1, boolean w2, boolean w3, boolean w4, boolean w5) {
		_map = map;
		_msg = m;
		_win1 = w1;
		_win2 = w2;
		_win3 = w3;
		_win4 = w4;
		_win5 = w5;
	}
	

	
	



	//displays a victory message and sets victory to true if the player won
	public void victory() {
		JOptionPane.showMessageDialog(null, drawMap() + "\n" + "You beat the level" + "\n");
		_victory = true;

	}
	//displays a defeat message if the player lost
	public void defeat() {
		JOptionPane.showMessageDialog(null, drawMap() + "\n" + "Out of tries" + "\n");
	}

	//sets the map visually using the map and maze classes, and uses black squares to represent spaces without letters/ words,
	// and uses x's to represent places where words would go. Additionally, if a word is gussed correctly, the x's in the location where the
	//letters of the word should go are replaced for the actual letters.
	public String drawMap() {
		String MAP = "";
		int num = 1;
		String black = "■";
		String white = "x";
		String space = " ";
		String letter = "B";
		String letter2 = "A";
		String letter3 = "Y";
		String letter4 = "Z";
		String letter5 = "I";
		String letter6 = "N";
		String letter7 = "C";
		String letter8 = "O";
		String letter9 = "U";
		String letter10 = "K";
		String letter11 = "S";
		String letter12 = "V";
		String letter13 = "E";
		String letter14 = "R";
		String letter15 = "T";

		boolean[][] map = _map.getMap().getArr();

		for(int r = 0; r < map.length; r++) {
			for(int c = 0; c < map[r].length; c++) {
					if(r == 2 && c == 0 && map[r][c]) {
						if(_win1) {
							MAP += letter6 + space;
							num++;
						}
						else {
							MAP += num + space;
							num++;
						}
					}
					else if(r == 2 && c == 1&& map[r][c]) {
						if(_win1) {
							MAP += letter8 + space;
							num++;
						}
						else {
							MAP += num + space;
							num++;
						}
					}
					if(r == 3 && c == 3&& map[r][c]) {
						if(_win2) {
							MAP += letter + space;
							num++;
						}
						else {
							MAP += num + space +space;
							num++;
						}
					}
					else if(r == 4 && c == 3&& map[r][c]) {
						if(_win2) {
							MAP += letter2 + space;
							num++;
						}
						else {
							MAP += num + space+space;
							num++;
						}
					}
					else if(r == 5 && c == 3&& map[r][c]) {
						if(_win2) {
							MAP += letter + space;
							num++;
						}
						else {
							MAP += num + space;
							num++;
						}
					}
					else if(r == 6 && c == 3&& map[r][c]) {
						if(_win2) {
							MAP += letter3 + space;
							num++;
						}
						else {
							MAP += white + space;
							num++;
						}
					}
					if(r == 3 && c == 6&& map[r][c]) {
						if(_win3) {
							MAP += letter4 + space;
							num++;
						}
						else {
							MAP += num + space;
							num++;
						}
					}
					if(r == 4 && c == 6&& map[r][c]) {
						if(_win3) {
							MAP += letter5 + space;
							num++;
						}
						else {
							MAP += num + space;
							num++;
						}
					}
					if(r == 5 && c == 6&& map[r][c]) {
						if(_win3) {
							MAP += letter6 + space;
							num++;
						}
						else {
							MAP += num + space;
							num++;
						}
					}
					if(r == 6 && c == 6&& map[r][c]) {
						if(_win3) {
							MAP += letter7 + space;
							num++;
						}
						else {
							MAP += white;
							num++;
						}
					}
					if(r == 6 && c == 1&& map[r][c]) {
						if(_win4) {
							MAP += letter + space;
							num++;
						}
						else {
							MAP += num + space;
							num++;
						}
					}
					if(r == 6 && c == 2&& map[r][c]) {
						if(_win4) {
							MAP += letter9 + space + space;
							num++;
						}
						else {
							MAP += num + space;
							num++;
						}
					}
					if(r == 6 && c == 4&& map[r][c]) {
						if(_win4) {
							MAP += letter + space + space;
							num++;
						}
						else {
							MAP += num + space;
							num++;
						}
					}
					if(r == 6 && c == 5&& map[r][c]) {
						if(_win4) {
							MAP += letter2 + space + space;
							num++;
						}
						else {
							MAP += num + space;
							num++;
						}
					}
					if(r == 6 && c == 7&& map[r][c]) {
						if(_win4) {
							MAP += letter10 + space;
							num++;
						}
						else {
							MAP += num + space;
							num++;
						}
					}
					if(r == 6 && c == 8&& map[r][c]) {
						if(_win4) {
							MAP += letter11 + space;
							num++;
						}
						else {
							MAP += num;
							num++;
						}
					}
					if(r == 3 && c == 1&& map[r][c]) {
						if(_win5) {
							MAP += letter12 + space;
							num++;
						}
						else {
							MAP += num + space;
							num++;
						}
					}
					if(r == 4 && c == 1&& map[r][c]) {
						if(_win5) {
							MAP += letter13 + space;
							num++;
						}
						else {
							MAP += num + space;
							num++;
						}
					}
					if(r == 5 && c == 1&& map[r][c]) {
						if(_win5) {
							MAP += letter14 + space;
							num++;
						}
						else {
							MAP += num + space;
							num++;
						}
					}
					if(r == 7 && c == 1&& map[r][c]) {
						if(_win5) {
							MAP += letter5 + space;
							num++;
						}
						else {
							MAP += num;
							num++;
						}
					}
					if(r == 8 && c == 1&& map[r][c]) {
						if(_win5) {
							MAP += letter15 + space;
							num++;
						}
						else {
							MAP += num + space;
							num++;
						}
					}
					if(r == 9 && c == 1&& map[r][c]) {
						if(_win5) {
							MAP += letter13 + space;
							num++;
						}
						else {
							MAP += num;
							num++;
						}
					}
				if(map[r][c]) {
					if(r == 0 || c == 0) {
						if(!(r == 2 && c == 0) && !(r == 2 && c == 1)&& !(r == 3 && c == 3)&& !(r == 4 && c == 3)&& !(r == 5 && c == 3)&& !(r == 6 && c == 3)&& !(r == 3 && c == 6)&& !(r == 4 && c == 6)&& !(r == 5 && c == 6)&& !(r == 6 && c == 6)&& !(r == 6 && c == 1)&& !(r == 6 && c == 2)&& !(r == 6 && c == 4)&& !(r == 6 && c == 5)&& !(r == 6 && c == 7)&& !(r == 6 && c == 8)&& !(r == 3 && c == 1)&& !(r == 4 && c == 1)&& !(r == 5 && c == 1)&& !(r == 7 && c == 1)&& !(r == 8 && c == 1)&& !(r == 9 && c == 1)) {
							if(num <= 9) {
								MAP += space + num + space;
							}
							else {
								MAP += num;
							}
							num++;
						}
					}
					else if(!map[r-1][c] || !map[r][c-1]) {
						if(!(r == 2 && c == 0) && !(r == 2 && c == 1)&& !(r == 3 && c == 3)&& !(r == 4 && c == 3)&& !(r == 5 && c == 3)&& !(r == 6 && c == 3)&& !(r == 3 && c == 6)&& !(r == 4 && c == 6)&& !(r == 5 && c == 6)&& !(r == 6 && c == 6)&& !(r == 6 && c == 1)&& !(r == 6 && c == 2)&& !(r == 6 && c == 4)&& !(r == 6 && c == 5)&& !(r == 6 && c == 7)&& !(r == 6 && c == 8)&& !(r == 3 && c == 1)&& !(r == 4 && c == 1)&& !(r == 5 && c == 1)&& !(r == 7 && c == 1)&& !(r == 8 && c == 1)&& !(r == 9 && c == 1)) {
							if(num <= 9 || num == 13|| num == 16) {
								MAP += space + num + space;
							}
							else {
								MAP += num;
							}
							num++;
						}
					}
					else {
						if(!(r == 2 && c == 0) && !(r == 2 && c == 1)&& !(r == 3 && c == 3)&& !(r == 4 && c == 3)&& !(r == 5 && c == 3)&& !(r == 6 && c == 3)&& !(r == 3 && c == 6)&& !(r == 4 && c == 6)&& !(r == 5 && c == 6)&& !(r == 6 && c == 6)&& !(r == 6 && c == 1)&& !(r == 6 && c == 2)&& !(r == 6 && c == 4)&& !(r == 6 && c == 5)&& !(r == 6 && c == 7)&& !(r == 6 && c == 8)&& !(r == 3 && c == 1)&& !(r == 4 && c == 1)&& !(r == 5 && c == 1)&& !(r == 7 && c == 1)&& !(r == 8 && c == 1)&& !(r == 9 && c == 1)) {
							MAP += white + space;
						}
						
					}
				}
				else {
					MAP += black + space;
				}
			}
			MAP += "\n";
		}
		return MAP;


	}


}




