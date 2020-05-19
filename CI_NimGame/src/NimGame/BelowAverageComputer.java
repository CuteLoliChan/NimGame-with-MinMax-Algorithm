//BelowAverageComputer Player
//get input from keyboard
package NimGame;

import java.util.Random;

//BelowAverageComputer will play by selecting Random Numbers
public class BelowAverageComputer implements Player {
    private String name;
   
    public BelowAverageComputer(String name){
        this.name = name;
    }
    
    //Return the amount that computer wants to remove based on Random Class
    public int move(int total){
        Random genNum = new Random();
        // from 1 to n/2
        int amount = genNum.nextInt(total/2)+1;
        return amount;
    }
    
    //Set name of Player
    public void  setName(String name){
        this.name = name;
    }
    
    //Gets name of the Player
    public String getName(){
        return name;
    }
}
