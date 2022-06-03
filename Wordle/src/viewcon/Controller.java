package viewcon;

//creates the visual aspects of the program
public class Controller {

	int guessNum = 0;
	
	//creates a new controller with the number of guesses the user has made.
	public Controller(int x) {
		guessNum = 0;
	}
	
	
	//takes the strings created by the previous class of all the lines of guesses and what they
	//currently contain and turns it into a 5 by 6 grid of 5 letter words. (both unguesses and guessed words)
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
