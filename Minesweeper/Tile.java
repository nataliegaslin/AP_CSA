public class Tile{
    public boolean isMine = false;
    private boolean mineEdge = false;
    int minesNear = 0;



    public String markMine(){
        isMine = true;
        return "*";

    }
    public String setup(){
        return "[]";
    }


   
}