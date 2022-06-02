package Mod;

import java.util.ArrayList;

//Stores all of the required personal information for a single user
public class User {




    private ArrayList<condition>  conditions = new ArrayList<>();
    private int hoursOfSleep = 0;
    private int age = 0;
    private String username;
    private String password;
    private int feetHeight;
    private int inchheight;
    private double weight;

    //prevents conditions which have already been added to a user from being added again.
    public boolean alreadyThereCond(String c) {
    	for(int i =0; i<conditions.size(); i++) {
    		if(conditions.get(i).getName().equals(c)) {
    			return true;
    		}
    	}
    	return false;
    }
    
    //sets the hours of sleep a user gets to int n
    public void setHoursOfSleep(int n) {
    	hoursOfSleep = n;
    }
    
    //returns the hours of sleep a user gets
    public int getHoursOfSleep() {
    	return hoursOfSleep;
    }
    
    //creates a new user and assigns their selected user name and password and stores them
    public User(String u, String p) {
        username = u;
        password = p;
    }

    //sets the users age to int variable setA
    public void setAge(int setA){
        age = setA;
    }

    //returns the users user name (used to check sign in)
    public String getUsername() {
        return username;
    }

    //returns the users password (used to check sign in)
    public String getPassword() {
        return password;
    }

    //Adds a condition to the users list of conditions that may affect sleep
    public void addCondition(condition cond){
        conditions.add(cond);
    }
    
    //sets the users height in feet and stores them
    public void setFeet(int h) {
    	feetHeight = h;
    }
    
    //sets the remaining inches of a user height and stores them
    public void setInch(int h) {
    	inchheight = h;
    }
    
    //sets and stores the users weight to the parameter
    public void setWeight(double h) {
    	weight = h;
    }
    
    //returns the users weight
    public double getWeight() {
    	return weight;
    }
    
    //returns the users height in feet
    public int getFeet() {
    	return feetHeight;
    }
    
    //returns the users age
    public int getAge() {
    	return age;
    }
    
    //returns the users remaining height of inches
    public int getInch() {
    	return inchheight;
    }
    
    //returns a list of all the conditions a user has
    public String retConditionNames() {
    	String ret = "";
    	for(int i =0; i<conditions.size(); i++) {
    		ret += conditions.get(i).getName();
    		ret += " and ";
    	}
    	return ret;
    }
    
    //sums up the total amount of extra hours added to a users sleep based on their conditions
    public int retConditionTimeAdd() {
    	int ret = 0;
    	for(int i =0; i<conditions.size(); i++) {
    		ret += conditions.get(i).getHourIncrease();
    	}
    	return ret;
    }
    
    //returns a list of all of a users sleeping tips based on their conditions
    public String retConditionTips() {
    	String ret = "";
    	for(int i =0; i<conditions.size(); i++) {
    		ret += conditions.get(i).getName();
    		ret += ": ";
    		ret += conditions.get(i).getTip();
    		ret += "\n";
    	}
    	return ret;
    }
    
    //states whether or not a person is obese based on a bmi of their weight and height
    public boolean isObese() {
    	double weightKg = 0.45359237* weight;
    	double heightM = (0.3048* feetHeight)+ (0.0254 *inchheight);
    	return weightKg/(heightM*heightM) >25;
    }
}

