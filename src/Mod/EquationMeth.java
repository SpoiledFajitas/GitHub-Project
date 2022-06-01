package Mod;

import javax.swing.*;
import java.util.Random;

// this class will create a question based on the selected grade level and problerm type
public class EquationMeth {


   private boolean add;
   private boolean sub;
   private boolean mult;
   private boolean div;
   String question = "";
   int questionNum;
   int numAdd=0;
   int numSub = 0;
   int numMult = 0;
   int numDiv = 0;
   int questionRight=0;
   int gradeLevel;
   private int answer;

   //Constructs an object and sets the types of questions to be created
   //based on the setting of variables to represent problem types, number of the question, and the grade level.
   public EquationMeth(boolean a, boolean s, boolean m, boolean d,int num, int grd){
       add= a;
       sub=s;
       mult=m;
       div=d;
       questionNum = num;
       gradeLevel = grd;


   }

   //Calls the appropriate method to create a question of addition subtraction division or multiplication
   public String chooseEquation() {
	   System.out.println("here");
       int howMany = 0;
       if (add) {
           howMany++;
       }
       if (sub) {
           howMany++;
       }
       if (mult) {
           howMany++;
       }
       if (div) {
           howMany++;
       }
       Random generator = new Random();
       int choose = generator.nextInt(howMany);
       if (add&& sub&& mult && div) {
           return all(howMany);
       }
       else if (sub&& mult&&add) {
           return addSubMult(howMany);
       }
       else if(mult&&div&&add){
           return multDivAdd(howMany);
       }
       else if(mult&&div&&sub){
           return multDivSub(howMany);
       }
       else if(sub&&add&&div){
           return addSubDiv(howMany);
       }
       else if(add&&div){
           return divAdd(howMany);
       }
       else if(add&&mult){
           return addMult(howMany);
       }
       else if(add&&sub){
           return addSub(howMany);
       }
       else if(sub&&div){
           return divSub(howMany);
       }
       else if(sub&&mult){
           return multSub(howMany);
       }
       else if(mult&&div){
           return multDiv(howMany);
       }
       else if(mult){
           return multOnly(howMany);
       }
       else if(div){
           return divOnly(howMany);
       }
       else if(add){
           return addOnly(howMany);
       }else if(sub){
           return subOnly(howMany);
       }


       return"";


   }
   //sets answer equal to the answer of a problem.
   public void returnAnswer(int i) {
       answer = i;
   }

   //returns the correct answer to a problem
   public int getAnswer() {return answer;}


   //creates sets of Math problems that could be from all the 4 different types.
   public String all(int num){

       Random generator = new Random();
       int choose = generator.nextInt(num);
       if(choose ==1){
           int number1 = (int)(Math.random()*gradeLevel);
           while(number1 == 0){
               number1 = (int)(Math.random()*gradeLevel);
           }
           int number2 = (int)(Math.random()*gradeLevel);
           while(number2 == 0){
               number2 = (int)(Math.random()*gradeLevel);
           }
           int number3 = number1 *number2;
           int number4= number3-number1;
           question = number3 + " - " + number1 + " =";
           numSub++;
           returnAnswer(number4);
           return number3 + " - " + number1 + " =";

       }
       else if(choose ==2){
           int number1 = (int)(Math.random()*gradeLevel);
           while(number1 ==0 ){
               number1 = (int)(Math.random()*gradeLevel);
           }
           int number2 = (int)(Math.random()*gradeLevel);
           int number3 = number1 *number2;
           int number4= number3/number1;
           question = number3 + " / " + number1 + " =";
           numDiv++;
           returnAnswer(number4);
           return number3 + " / " + number1 + " =";

       }
       else if(choose ==3){
           int number1 = (int)(Math.random()*gradeLevel);
           int number2 = (int)(Math.random()*gradeLevel);
           int number3 = number1 *number2;
           question = number1 + " * " + number2 + " =";
           numMult ++;
           returnAnswer(number3);
           return number1 + " * " + number2 + " =";
       }
       else if(choose ==4){
           int number1 = (int)(Math.random()*gradeLevel*2);
           int number2 = (int)(Math.random()*gradeLevel*2);
           int number3 = number1 +number2;
           question = number1 + " + " + number2 + " =";
           numAdd++;
           returnAnswer(number3);
           return number1 + " + " + number2 + " =";
       }
       int number1 = (int)(Math.random()*gradeLevel*2);
       int number2 = (int)(Math.random()*gradeLevel	*2);
       int number3 = number1 +number2;
       question = number1 + " + " + number2 + " =";
       numAdd++;
       returnAnswer(number3);
       return number1 + " + " + number2 + " =";

   }
   
   //creates sets of math problems but only multiplication
   public String multOnly(int num){
       int number1 = (int)(Math.random()*gradeLevel*2);
       int number2 = (int)(Math.random()*gradeLevel*2);
       int number3 = number1 *number2;
       question = number1 + " * " + number2 + " =";
       numMult++;
       returnAnswer(number3);
       return number1 + " * " + number2 + " =";
   }

   //creates sets of math problems but only division
   public String divOnly(int num){
       int number1 = (int)(Math.random()*gradeLevel);
       while(number1 ==0 ){
           number1 = (int)(Math.random()*gradeLevel);
       }
       int number2 = (int)(Math.random()*gradeLevel);
       int number3 = number1 *number2;
       int number4= number3/number1;
       question = number3 + " / " + number1 + " =";
       numDiv++;
       returnAnswer(number4);
       return number3 + " / " + number1 + " =";
   }


   //creates sets of math problems but only addition
   public String addOnly(int num){
       int number1 = (int)(Math.random()*gradeLevel*2);
       int number2 = (int)(Math.random()*gradeLevel*2);
       int number3 = number1 +number2;
       question = number1 + " + " + number2 + " =";
       numAdd++;
       returnAnswer(number3);
       return number1 + " + " + number2 + " =";
   }

   //creates sets of math problems but only subtraction
   public String subOnly(int num){
       int number1 = (int)(Math.random()*gradeLevel);
       while(number1 == 0){
           number1 = (int)(Math.random()*gradeLevel);
       }
       int number2 = (int)(Math.random()*gradeLevel);
       while(number2 == 0){
           number2 = (int)(Math.random()*gradeLevel);
       }
       int number3 = number1 *number2;
       int number4= number3-number1;
       question = number3 + " - " + number1 + " =";
       numSub++;
       returnAnswer(number4);
       return number3 + " - " + number1 + " =";
   }

   //creates sets of math problems but only addition, subtraction, and multiplication
   public String addSubMult(int num){
       Random generator = new Random();
       int choose = generator.nextInt(num+1);
       System.out.println(num);
       if(choose ==3){
           int number1 = (int)(Math.random()*gradeLevel);
           while(number1 == 0){
               number1 = (int)(Math.random()*gradeLevel);
           }
           int number2 = (int)(Math.random()*gradeLevel);
           while(number2 == 0){
               number2 = (int)(Math.random()*gradeLevel);
           }
           int number3 = number1 *number2;
           int number4= number3-number1;
           question = number3 + " - " + number1 + " =";
           numSub++;
           returnAnswer(number4);
           return number3 + " - " + number1 + " =";
       }
       else if(choose ==2){
           int number1 = (int)(Math.random()*gradeLevel*2);
           int number2 = (int)(Math.random()*gradeLevel*2);
           int number3 = number1 *number2;
           question = number1 + " * " + number2 + " =";
           numMult++;
           returnAnswer(number3);
           return number1 + " * " + number2 + " =";
       }
       else if(choose ==1){
           int number1 = (int)(Math.random()*gradeLevel*2);
           int number2 = (int)(Math.random()*gradeLevel*2);
           int number3 = number1 +number2;
           question = number1 + " + " + number2 + " =";
           numAdd++;
           returnAnswer(number3);
           return number1 + " + " + number2 + " =";
       }
       int number1 = (int)(Math.random()*gradeLevel*2);
       int number2 = (int)(Math.random()*gradeLevel*2);
       int number3 = number1 *number2;
       question = number1 + " * " + number2 + " =";
       numMult++;
       returnAnswer(number3);
       return number1 + " * " + number2 + " =";
   }


   //creates sets of math problems but addition and subtraction
   public String addSub(int num){
       Random generator = new Random();
       int choose = generator.nextInt(num+2);
       System.out.println(num);
       if(choose ==3){
           int number1 = (int)(Math.random()*gradeLevel);
           while(number1 == 0){
               number1 = (int)(Math.random()*gradeLevel);
           }
           int number2 = (int)(Math.random()*gradeLevel);
           while(number2 == 0){
               number2 = (int)(Math.random()*gradeLevel);
           }
           int number3 = number1 *number2;
           int number4= number3-number1;
           question = number3 + " - " + number1 + " =";
           numSub++;
           returnAnswer(number4);
           return number3 + " - " + number1 + " =";
       }
       else if(choose ==2){
           int number1 = (int)(Math.random()*gradeLevel);
           while(number1 == 0){
               number1 = (int)(Math.random()*gradeLevel);
           }
           int number2 = (int)(Math.random()*gradeLevel);
           while(number2 == 0){
               number2 = (int)(Math.random()*gradeLevel);
           }
           int number3 = number1 *number2;
           int number4= number3-number1;
           question = number3 + " - " + number1 + " =";
           numSub++;
           returnAnswer(number4);
           return number3 + " - " + number1 + " =";
       }
       else if(choose ==1){
           int number1 = (int)(Math.random()*gradeLevel*2);
           int number2 = (int)(Math.random()*gradeLevel*2);
           int number3 = number1 +number2;
           question = number1 + " + " + number2 + " =";
           numAdd++;
           returnAnswer(number3);
           return number1 + " + " + number2 + " =";
       }
       int number1 = (int)(Math.random()*gradeLevel*2);
       int number2 = (int)(Math.random()*gradeLevel*2);
       int number3 = number1 +number2;
       question = number1 + " + " + number2 + " =";
       numAdd++;
       returnAnswer(number3);
       return number1 + " + " + number2 + " =";
   }


   //creates sets of math problems but only multiplication and subtraction
   public String multSub(int num){
       Random generator = new Random();
       int choose = generator.nextInt(num+2);
       System.out.println(num);
       if(choose ==3){
           int number1 = (int)(Math.random()*gradeLevel);
           while(number1 == 0){
               number1 = (int)(Math.random()*gradeLevel);
           }
           int number2 = (int)(Math.random()*gradeLevel);
           while(number2 == 0){
               number2 = (int)(Math.random()*gradeLevel);
           }
           int number3 = number1 *number2;
           int number4= number3-number1;
           question = number3 + " - " + number1 + " =";
           numSub++;
           returnAnswer(number4);
           return number3 + " - " + number1 + " =";
       }
       else if(choose ==2){
           int number1 = (int)(Math.random()*gradeLevel);
           while(number1 == 0){
               number1 = (int)(Math.random()*gradeLevel);
           }
           int number2 = (int)(Math.random()*gradeLevel);
           while(number2 == 0){
               number2 = (int)(Math.random()*gradeLevel);
           }
           int number3 = number1 *number2;
           int number4= number3-number1;
           question = number3 + " - " + number1 + " =";
           numSub++;
           returnAnswer(number4);
           return number3 + " - " + number1 + " =";
       }
       else if(choose ==1){
           int number1 = (int)(Math.random()*gradeLevel*2);
           int number2 = (int)(Math.random()*gradeLevel*2);
           int number3 = number1 *number2;
           question = number1 + " * " + number2 + " =";
           numMult++;
           returnAnswer(number3);
           return number1 + " * " + number2 + " =";
       }
       int number1 = (int)(Math.random()*gradeLevel*2);
       int number2 = (int)(Math.random()*gradeLevel*2);
       int number3 = number1 *number2;
       question = number1 + " * " + number2 + " =";
       numMult++;
       returnAnswer(number3);
       return number1 + " * " + number2 + " =";
   }



   //creates sets of math problems but only multiplication and division
   public String multDiv(int num){
       Random generator = new Random();
       int choose = generator.nextInt(num+2);
       System.out.println(num);
       if(choose ==3){
           int number1 = (int)(Math.random()*gradeLevel);
           while(number1 ==0 ){
               number1 = (int)(Math.random()*gradeLevel);
           }
           int number2 = (int)(Math.random()*gradeLevel);
           int number3 = number1 *number2;
           int number4= number3/number1;
           question = number3 + " / " + number1 + " =";
           numDiv++;
           returnAnswer(number4);
           return number3 + " / " + number1 + " =";
       }
       else if(choose ==2){
           int number1 = (int)(Math.random()*gradeLevel);
           while(number1 ==0 ){
               number1 = (int)(Math.random()*gradeLevel);
           }
           int number2 = (int)(Math.random()*gradeLevel);
           int number3 = number1 *number2;
           int number4= number3/number1;
           question = number3 + " / " + number1 + " =";
           numDiv++;
           returnAnswer(number4);
           return number3 + " / " + number1 + " =";
       }
       else if(choose ==1){
           int number1 = (int)(Math.random()*gradeLevel*2);
           int number2 = (int)(Math.random()*gradeLevel*2);
           int number3 = number1 *number2;
           question = number1 + " * " + number2 + " =";
           numMult++;
           returnAnswer(number3);
           return number1 + " * " + number2 + " =";
       }
       int number1 = (int)(Math.random()*gradeLevel*2);
       int number2 = (int)(Math.random()*gradeLevel*2);
       int number3 = number1 *number2;
       question = number1 + " * " + number2 + " =";
       numMult++;
       returnAnswer(number3);
       return number1 + " * " + number2 + " =";
   }


   //creates sets of math problems but only division and subtraction
   public String divSub(int num){
       Random generator = new Random();
       int choose = generator.nextInt(num+2);
       System.out.println(num);
       if(choose ==3){
           int number1 = (int)(Math.random()*gradeLevel);
           while(number1 == 0){
               number1 = (int)(Math.random()*gradeLevel);
           }
           int number2 = (int)(Math.random()*gradeLevel);
           while(number2 == 0){
               number2 = (int)(Math.random()*gradeLevel);
           }
           int number3 = number1 *number2;
           int number4= number3-number1;
           question = number3 + " - " + number1 + " =";
           numSub++;
           returnAnswer(number4);
           return number3 + " - " + number1 + " =";
       }
       else if(choose ==2){
           int number1 = (int)(Math.random()*gradeLevel);
           while(number1 == 0){
               number1 = (int)(Math.random()*gradeLevel);
           }
           int number2 = (int)(Math.random()*gradeLevel);
           while(number2 == 0){
               number2 = (int)(Math.random()*gradeLevel);
           }
           int number3 = number1 *number2;
           int number4= number3-number1;
           question = number3 + " - " + number1 + " =";
           numSub++;
           returnAnswer(number4);
           return number3 + " - " + number1 + " =";
       }
       else if(choose ==1){
           int number1 = (int)(Math.random()*gradeLevel);
           while(number1 ==0 ){
               number1 = (int)(Math.random()*gradeLevel);
           }
           int number2 = (int)(Math.random()*gradeLevel);
           int number3 = number1 *number2;
           int number4= number3/number1;
           question = number3 + " / " + number1 + " =";
           numDiv++;
           returnAnswer(number4);
           return number3 + " / " + number1 + " =";
       }
       int number1 = (int)(Math.random()*gradeLevel);
       while(number1 ==0 ){
           number1 = (int)(Math.random()*gradeLevel);
       }
       int number2 = (int)(Math.random()*gradeLevel);
       int number3 = number1 *number2;
       int number4= number3/number1;
       question = number3 + " / " + number1 + " =";
       numDiv++;
       returnAnswer(number4);
       return number3 + " / " + number1 + " =";
   }


   //creates sets of math problems but only multiplication and addition
   public String addMult(int num){
       Random generator = new Random();
       int choose = generator.nextInt(num+2);
       System.out.println(num);
       if(choose ==3){
           int number1 = (int)(Math.random()*gradeLevel*2);
           int number2 = (int)(Math.random()*gradeLevel*2);
           int number3 = number1 +number2;
           question = number1 + " + " + number2 + " =";
           numAdd++;
           returnAnswer(number3);
           return number1 + " + " + number2 + " =";
       }
       else if(choose ==2){
           int number1 = (int)(Math.random()*gradeLevel*2);
           int number2 = (int)(Math.random()*gradeLevel*2);
           int number3 = number1 *number2;
           question = number1 + " * " + number2 + " =";
           numMult++;
           returnAnswer(number3);
           return number1 + " * " + number2 + " =";
       }
       else if(choose ==1){
           int number1 = (int)(Math.random()*gradeLevel*2);
           int number2 = (int)(Math.random()*gradeLevel*2);
           int number3 = number1 +number2;
           question = number1 + " + " + number2 + " =";
           numAdd++;
           returnAnswer(number3);
           return number1 + " + " + number2 + " =";
       }
       int number1 = (int)(Math.random()*gradeLevel*2);
       int number2 = (int)(Math.random()*gradeLevel*2);
       int number3 = number1 *number2;
       question = number1 + " * " + number2 + " =";
       numMult++;
       returnAnswer(number3);
       return number1 + " * " + number2 + " =";
   }

   //creates sets of math problems but only multiplication, division, and addition
   public String multDivAdd(int num){
       Random generator = new Random();
       int choose = generator.nextInt(num+1);
       System.out.println(num);
       if(choose ==3){
           int number1 = (int)(Math.random()*gradeLevel);
           while(number1 ==0 ){
               number1 = (int)(Math.random()*gradeLevel);
           }
           int number2 = (int)(Math.random()*gradeLevel);
           int number3 = number1 *number2;
           int number4= number3/number1;
           question = number3 + " / " + number1 + " =";
           numDiv++;
           returnAnswer(number4);
           return number3 + " / " + number1 + " =";
       }
       else if(choose ==2){
           int number1 = (int)(Math.random()*gradeLevel*2);
           int number2 = (int)(Math.random()*gradeLevel*2);
           int number3 = number1 *number2;
           question = number1 + " * " + number2 + " =";
           numMult++;
           returnAnswer(number3);
           return number1 + " * " + number2 + " =";
       }
       else if(choose ==1){
           int number1 = (int)(Math.random()*gradeLevel*2);
           int number2 = (int)(Math.random()*gradeLevel*2);
           int number3 = number1 +number2;
           question = number1 + " + " + number2 + " =";
           numAdd++;
           returnAnswer(number3);
           return number1 + " + " + number2 + " =";
       }
       int number1 = (int)(Math.random()*gradeLevel*2);
       int number2 = (int)(Math.random()*gradeLevel*2);
       int number3 = number1 *number2;
       question = number1 + " * " + number2 + " =";
       numMult++;
       returnAnswer(number3);
       return number1 + " * " + number2 + " =";
   }

   //creates sets of math problems but only division and addition
   public String divAdd(int num){
       Random generator = new Random();
       int choose = generator.nextInt(num+1);
       System.out.println(num);
       if(choose ==2){
           int number1 = (int)(Math.random()*gradeLevel);
           while(number1 ==0 ){
               number1 = (int)(Math.random()*gradeLevel);
           }
           int number2 = (int)(Math.random()*gradeLevel);
           int number3 = number1 *number2;
           int number4= number3/number1;
           question = number3 + " / " + number1 + " =";
           numDiv++;
           returnAnswer(number4);
           return number3 + " / " + number1 + " =";
       }
       else if(choose ==1){
           int number1 = (int)(Math.random()*gradeLevel*2);
           int number2 = (int)(Math.random()*gradeLevel*2);
           int number3 = number1 +number2;
           question = number1 + " + " + number2 + " =";
           numAdd++;
           returnAnswer(number3);
           return number1 + " + " + number2 + " =";
       }
       int number1 = (int)(Math.random()*gradeLevel*2);
       int number2 = (int)(Math.random()*gradeLevel*2);
       int number3 = number1 +number2;
       question = number1 + " + " + number2 + " =";
       numAdd++;
       returnAnswer(number3);
       return number1 + " + " + number2 + " =";
   }




   //creates sets of math problems but only multiplication, division, and subtraction
   public String multDivSub(int num){
       Random generator = new Random();
       int choose = generator.nextInt(num+1);
       System.out.println(num);
       if(choose ==3){
           int number1 = (int)(Math.random()*gradeLevel);
           while(number1 ==0 ){
               number1 = (int)(Math.random()*gradeLevel);
           }
           int number2 = (int)(Math.random()*gradeLevel);
           int number3 = number1 *number2;
           int number4= number3/number1;
           question = number3 + " / " + number1 + " =";
           numDiv++;
           returnAnswer(number4);
           return number3 + " / " + number1 + " =";
       }
       else if(choose ==2){
           int number1 = (int)(Math.random()*gradeLevel*2);
           int number2 = (int)(Math.random()*gradeLevel*2);
           int number3 = number1 *number2;
           question = number1 + " * " + number2 + " =";
           numMult++;
           returnAnswer(number3);
           return number1 + " * " + number2 + " =";
       }
       else if(choose ==1){
           int number1 = (int)(Math.random()*gradeLevel);
           while(number1 == 0){
               number1 = (int)(Math.random()*gradeLevel);
           }
           int number2 = (int)(Math.random()*gradeLevel);
           while(number2 == 0){
               number2 = (int)(Math.random()*gradeLevel);
           }
           int number3 = number1 *number2;
           int number4= number3-number1;
           question = number3 + " - " + number1 + " =";
           numSub++;
           returnAnswer(number4);
           return number3 + " - " + number1 + " =";
       }
       int number1 = (int)(Math.random()*gradeLevel*2);
       int number2 = (int)(Math.random()*gradeLevel*2);
       int number3 = number1 *number2;
       question = number1 + " * " + number2 + " =";
       numMult++;
       returnAnswer(number3);
       return number1 + " * " + number2 + " =";
   }
   //creates sets of math problems but only addition, subtraction, and division
   public String addSubDiv(int num){

       Random generator = new Random();
       int choose = generator.nextInt(num+1);
       System.out.println(num);
       if(choose ==1){
           int number1 = (int)(Math.random()*gradeLevel);
           while(number1 == 0){
               number1 = (int)(Math.random()*gradeLevel);
           }
           int number2 = (int)(Math.random()*gradeLevel);
           while(number2 == 0){
               number2 = (int)(Math.random()*gradeLevel);
           }
           int number3 = number1 *number2;
           int number4= number3-number1;
           question = number3 + " - " + number1 + " =";
           numSub++;
           returnAnswer(number4);
           return number3 + " - " + number1 + " =";

       }
       else if(choose ==2){
           int number1 = (int)(Math.random()*gradeLevel);
           while(number1 ==0 ){
               number1 = (int)(Math.random()*gradeLevel);
           }
           int number2 = (int)(Math.random()*gradeLevel);
           int number3 = number1 *number2;
           int number4= number3/number1;
           question = number3 + " / " + number1 + " =";
           numDiv++;
           returnAnswer(number4);
           return number3 + " / " + number1 + " =";
       }
       else if(choose ==3){
           int number1 = (int)(Math.random()*gradeLevel*2);
           int number2 = (int)(Math.random()*gradeLevel*2);
           int number3 = number1 +number2;
           question = number1 + " + " + number2 + " =";
           numAdd++;
           returnAnswer(number3);
           return number1 + " + " + number2 + " =";

       }
       int number1 = (int)(Math.random()*gradeLevel);
       while(number1 ==0 ){
           number1 = (int)(Math.random()*gradeLevel);
       }
       int number2 = (int)(Math.random()*gradeLevel);
       int number3 = number1 *number2;
       int number4= number3/number1;
       numDiv++;
       question = number3 + " / " + number1 + " =";
       returnAnswer(number4);
       return number3 + " / " + number1 + " =";

   }

   //checks if the answer given is correct or not
   public boolean checkAnswer(int answ, int cAnsw){
       if(answ == cAnsw) {
           return true;
       }
       return false;
   }
}
