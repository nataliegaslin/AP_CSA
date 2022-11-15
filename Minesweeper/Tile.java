public class Tile{
    private boolean isMine = false;
    public Tile(){
        //no inputs
    }

    public String mine(){
        isMine = true;
        return "⎈";

    }
    public String flag(){
        
    }
}