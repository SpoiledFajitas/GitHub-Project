package Mod;

import java.lang.reflect.Array;
import java.util.ArrayList;

//Allows for easy storage of all the created users and their information with methods to use the information
public class userBank {


    private static ArrayList<User> users = new ArrayList();

    //creates a new user bank.
    public userBank() {

    }
    
    //returns the amount of users stored.
    public int numUsers() {
    	return users.size();
    }
    
    //returns a string containing all the users user names.
    public String returnUsersNames() {
    	String t = "";
    	for(int i =0; i<users.size(); i++) {
    		t += users.get(i).getUsername();
    	}
    	return t;
    }
    
    //checks if there are more than 0 users created.
    public boolean moreThanZeroUsers() {
    	return users.size()>0;
    }

    //adds a new user to the user storage
    public void addNewUser(String uName, String pass){
        users.add(new User(uName, pass));
    }

    //finds a user in the user storage based on their username.
    public User findUser(String uName){
        for(int i =0; i<users.size(); i++){
            if(users.get(i).getUsername().equals(uName)){
                return users.get(i);
            }
        }
        return null;
    }

    //checks if a user name inputed as a parameter matches an existing user name
    public boolean checkUsername(String uName){
        if(findUser(uName) == null){
            return false;
        }
        return true;
    }

    //checks if a password inputed as a parameter matches the password of a user whose username was also inputed as a 
    //parameter
    public boolean checkCorrectPasswrd(String uName, String passW){
        if(checkUsername(uName)){
            if(findUser(uName).getPassword().equals(passW)){
                return true;
            }
            return false;
        }
        return false;
    }
}
