import java.lang.Math.*;
public class Dice {
    public static int rollOne(){
        int []rolls = new int[6];
        int totalOne = 0;
        for (int i = 0; i < 6; i++){
            rolls[i] = (int) (Math.random() * 6) + 1; 
        
        if (i % 2 != 0){
            totalOne = totalOne - rolls[i];
        }
        else{
            totalOne += rolls[i];
        }
        }
        System.out.println("|" + rolls[0] + " - " + rolls[1] + " + " + rolls[2] + " - " + rolls[3] + " + " + rolls[4] + " - " + rolls[5] + " | = " + Math.abs(totalOne));
        return Math.abs(totalOne);
    }

    public static void main(String[] args){
        Dice diceOne = new Dice();
        Dice diceTwo = new Dice();
        System.out.println("Player 1 roll:");
        int k = diceOne.rollOne();
        System.out.println("Player 2 roll:");
        int k2 = diceTwo.rollOne();
        if(k > k2){
            System.out.println("Player 1 wins!");
        }
        else if (k < k2){
            System.out.println("Player 2 wins!");
        }
        else{
            System.out.println("It's a tie!");
        }
    }
}