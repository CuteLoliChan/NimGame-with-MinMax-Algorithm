package NimGame;

import java.util.Random;

public class Pile {
    static int MAX_PER_PILE = 100;
    static int MIN_PER_PILE = 10;
    private int amount;
    
    //When Pile is created A random number between 10 and 100 is generated using Random
    public Pile(){
        Random genNum = new Random();
        amount = genNum.nextInt(MAX_PER_PILE - MIN_PER_PILE )+ MIN_PER_PILE;
    }
      
    //Removes an specified amount from the Pile
    public void take(int amount){
        this.amount -=amount;
    }
    
    //Current amount in the Pile
    public int getAmount(){
        return amount;
    }
}