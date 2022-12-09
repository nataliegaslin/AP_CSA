import java.util.*;
public class Main{

    public static void main(String[] args){ //gets inputs from the user and actually plays the game: determines whether the player wants to flip or flag a tile
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rows and columns in your grid?");
        int rowNum = sc.nextInt();
        int colNum = rowNum;
        System.out.print("How many mines in your grid?");
        int mineNum = sc.nextInt();
        sc.nextLine();

        Game newGame = new Game(rowNum, colNum, mineNum);
        newGame.printOut();
        while(newGame.isGameOver() == false){ //while the game is still being played
            String input = sc.nextLine();
            if(input.substring(0,1).equals("f")){ //if the user wants to flag
                int indexNum = input.indexOf(" ");
                int indexNumTwo = input.indexOf(" ", indexNum+1);
                int rowCoor = Integer.parseInt(input.substring(indexNum+1, indexNumTwo));
                int colCoor = Integer.parseInt(input.substring(indexNumTwo+1, input.length()));
                newGame.flag(rowCoor, colCoor);
                newGame.printOut();
            }
            else{ //if the user watns to flip
                int indexNum = input.indexOf(" ");
                int rowCoor = Integer.parseInt(input.substring(0, indexNum));
                int colCoor = Integer.parseInt(input.substring(indexNum+1, input.length()));
                if(rowCoor < (rowNum-1) && (colCoor < colNum-1)){
                    newGame.flip(rowCoor, colCoor);
                    newGame.printOut();
                }
                else if(rowCoor > rowNum-1 || colCoor > colNum-1){
                    System.out.println("please enter valid coordinates");
                    continue;
                }
            }
        }
        newGame.endMessage();
        
    }
}
