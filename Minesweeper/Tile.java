public class Tile{
    private boolean isItAMine;
    private boolean isItFlagged;
    private boolean isItFlipped;
    private int minesNear;

    public Tile(){
        isItAMine = false;
        isItFlagged = false;
        isItFlipped = false;
        minesNear = 0;
   

    }
    public void flip(){
       isItFlipped = true;
           
    } 
    public void flag(){
        isItFlagged = true;
    }
    
    public void markMine(){
        isItAMine = true;
    }
          
    public boolean isMine(){
        return isItAMine;

    }
    
    
    public void setMinesNear(mineNums){
        minesNear = mineNums;
    }
    
    public int getMinesNear(){
        return minesNear;
    }
    
    public String toString(){
        if(isItFlipped != true){
            if(isItFlagged != true){
                return "[🌫]";
            }
            else{
                return "[⛄]";
            }
        }
        else{
            if(isItAMine == true){
                return "[⎈]";
            }
            else if(getMinesNear == 0){
                return "   ";
            }
            else{
                return "(" + minesNear + ")"
                }
           
        }
        
            
           


   
}
