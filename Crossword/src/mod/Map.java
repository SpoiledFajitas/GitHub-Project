package mod;

//makes the layout of the crossword setting where each of the words and their letters will be located.
public enum Map {

	Easy(new boolean[][] { 
			{ false, false, false, false, false, false, false, false, false, false },
			{ false, false, false, false, false, false, false, false, false, false },
			{ true, true, false, false, false, false, false, false, false, false },
			{ false, true, false, true, false, false, true, false,  false , false },
			{ false, true, false, true, false, false, true, false,  false , false },
			{ false, true, false, true, false, false, true, false , false, false },
			{ false, true, 	true,  true,  true, true,  true,  true,   true, false },
			{ false, true, false, false,  false,  false, false, false,false, false },
			{ false, true, false, false,  false, false, false, false, false, false },
			{ false, true, false, false, false, false, false, false, false, false } 
			}); // semi-colon ends the number of variables!!!


	
	private boolean[][] _map;

	//returns the map
	public boolean[][] getArr() {
		return _map;
	}

	//creates the map
	private Map(boolean[][] map) {
		_map = map;
	}
}
