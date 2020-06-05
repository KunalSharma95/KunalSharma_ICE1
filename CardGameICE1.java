


 
 // @author Kunal Sharma


// Kunal Sharma 213065933 

import java.util.Random;
import java.util.Scanner;
public class CardGameICE1
{
  
    public static void main(String[] args)
    {        
        Scanner in = new Scanner(System.in);
        int count = 0; // keeps score
        
        Card[] magicHand = new Card[7];
        for (int i=0;i<magicHand.length;i++)
        {
           Card c= new Card();//object
           c.setValue("");
           c.setSuits("");        
           
           magicHand[i]=c;//saving object in array                              
        System.out.println("Enter a card suit followed by 'of' and then its corresponding rank!");
       String guessHand= in.nextLine();
        if (guessHand.equals(c.toString())) { // neccessary to convert object to string in order to compare
          System.out.println("You guessed correctly!");
          count++; //updates the score
        }else {
             System.out.println("Incorrect! The card was actually " + c); // reveals card
        }
        }
         
         System.out.println("You guessed " + count + " cards correctly!"); //prints score at end of loop
    
    }
    
}

