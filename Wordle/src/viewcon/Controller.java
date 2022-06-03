package viewcon;

public class Controller {

	int guessNum = 0;
	
	public Controller(int x) {
		guessNum = 0;
	}
	
	
	public String drawMap(String one, String two, String three, String four, String five, String six, String store) {
		String ret = "";
		ret += one + "\n";
		ret += two + "\n";
		ret += three + "\n";
		ret += four + "\n";
		ret += five + "\n";
		ret += six + "\n";
		ret += "\n" + "\n" + "last guess was: " + store;
		return ret;
	}
	
}
