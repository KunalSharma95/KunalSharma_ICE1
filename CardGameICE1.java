


 
 // @author Kunal Sharma


import java.util.Random; // needed for randomization
public class Card 
{
  private String suit;
  private String value; //works better as a String than as an int
public static final String[] SUITS={"diamonds","clubs","spades","hearts"};
public static final String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};   
     Random r= new Random(); // initially I tried Math.random()*4 but that didn't work
    int randomValue=r.nextInt(SUITS.length); // created 2 variables that run through each array as indexes.
    int randomValue2 = r.nextInt(values.length);
    

public String getSuits() {
    suit = SUITS[randomValue];   
    return suit;
    }

    
    public void setSuits(String suit) {
        suit = SUITS[randomValue];
        this.suit = suit;
        
    }
    
    public String getValue() {
       value = values[randomValue2];  
        return value;
    }
  
    public void setValue(String value) {
     value = values[randomValue2];  
        this.value = value;
    }
  
    public @Override String toString()
    {
        return this.value + " of " + this.suit;
    }
      
    
}

