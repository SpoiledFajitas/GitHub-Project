package Mod;


//Creates a condition that may affect sleep with its name, a tip, and an hour increase for sleep
public class condition {

    private String name;
    private String tip;
    private int hourIncrease;

    //Creates the condition and sets its name, the tip for it, and the hour increase
    public condition(String n, String t, int inc){
        name = n;
        tip = t;
        hourIncrease = inc;
    }
    
    //returns condition name
    public String getName() {
    	return name;
    }
    
    //returns condition tip
    public String getTip() {
    	return tip;
    }
    
    //returns condition hour increase for sleep
    public int getHourIncrease() {
    	return hourIncrease;
    }



}