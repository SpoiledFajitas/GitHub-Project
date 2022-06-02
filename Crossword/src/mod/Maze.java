package mod;

//calls on the map calss so that a map can be made
public class Maze {

	private Map _map;
	//returns  the map
	public Map getMap() {
		return _map;
	}


	//makes a new map for the crossword at difficulty easy.
	public Maze(int x) {
		_map = Map.Easy;
		
	}

}