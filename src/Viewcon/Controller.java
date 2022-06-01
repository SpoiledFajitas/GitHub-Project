package Viewcon;
import Mod.questionsAnswered;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;

//creates a list to be shown of all the problems that the user got wrong and their correct answer.
public class Controller {

	//creates a list to be shown of all the problems that the user got wrong and their correct answer.
	
   public String drawMap(ArrayList<questionsAnswered> k){
       String ret = "";
       for(int i =0; i< k.size(); i++){
           if(k.get(i).returnCorrectness()){
               ret += "you got " + k.get(i).returnProblem() + " right, the answer was: " + k.get(i).returnAnswer() + "; you answered: " + k.get(i).getYourAnswer();
           }
           else{
               ret += "you got " + k.get(i).returnProblem() + " wrong, the answer was: " + k.get(i).returnAnswer() + "; you answered: " + k.get(i).getYourAnswer();
           }
           ret += "\n";

       }
       return ret;
   }
   
  

}

