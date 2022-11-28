public class Tile{
    private boolean isItAMine;
    private boolean isItFlagged;
    private boolean isItFlipped;
    private int minesNear;

    public Tile(){ //sets up initial tile conditions
        isItAMine = false;
        isItFlagged = false;
        isItFlipped = false;
        minesNear = 0;
    }
    public void flip(){ //makes the boolean isItFlipped true
       isItFlipped = true;
           
    } 
    public void flag(){ //makes the boolean isItFlagged true
        isItFlagged = true;
    }
    public void unflag(){ //makes the boolean isItFlagged false
        isItFlagged = false;
    }
    
    public void markMine(){ //makes the boolean isItAMine true
        isItAMine = true;
    }
          
    public boolean isMine(){ //returns the value of isItAMine
        return isItAMine;

    }
    public boolean returnFlagged(){ //returns the value of isItFlagged
        return isItFlagged;
    }
    
    public boolean returnFlipped(){ //returns the value of isItFlipped
        return isItFlipped;
    }
    
    public void setMinesNear(int mineNums){  //changes minesNear to whatever the input is
        minesNear = mineNums;
    }
    
    public int getMinesNear(){ //returns minesNear
        return minesNear;
    }
    
    public String toString(){ //converts all of the Tile values (mine, flag, number of mines near, etc) into strings
        if(isItFlipped != true){
            if(isItFlagged != true){
                return "[ ]";
            }
            else{
                return "[⚐]";
            }
        }
        else{
            if(isItAMine == true){
                return "[⎈]";
            }
            else if(getMinesNear() == 0){
                return "[B]";
            }
            else{
                return "(" + minesNear + ")";
                }
           
        }
}
            
}
