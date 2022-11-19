public class Tile{
    private boolean isItAMine = false;
    private boolean mineEdge = false;
    int minesNear = 0;

 /* public String flip(int xCoor, int yCoor){
        grid[xCoor][yCoor] = actualValue[xCoor][yCoor];
        return grid[xCoor][yCoor];
    } */
    
    public void markMine(){
        isItAMine = true;
    }
          
    public boolean isMine(){
        return isItAMine;

    }
    


   
}
