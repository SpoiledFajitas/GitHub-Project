package mod;

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

	public boolean[][] getArr() {
		return _map;
	}

	private Map(boolean[][] map) {
		_map = map;
	}
}
