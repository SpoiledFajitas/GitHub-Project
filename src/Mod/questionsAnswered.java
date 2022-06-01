package Mod;
//stores the questions that have been asked, the answer given and if the answer given was correct, and 
//the correct answer.
public class questionsAnswered {

   String problem;
   int answer;
   boolean correct;
   int yourAnswer;

   //gives information to the question, the given answer, if it was correct, and the actual answer.
   public questionsAnswered(String s, int i, boolean b, int y){
       problem = s;
       answer = i;
       correct = b;
       yourAnswer = y;
   }

   //returns the question asked.
   public String returnProblem(){return problem;}

   //returns the correct answer to the problem
   public int returnAnswer() {return answer;}

   //returns the answer given by user to the problem
   public int getYourAnswer() {return yourAnswer;}

   //returns if the answer given was correct
   public boolean returnCorrectness() {return correct;}
}

