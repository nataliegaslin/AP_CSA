public class Tile{
    private boolean isMine = false;
    public Tile(){

    }

    public String mine(){
        isMine = true;
        return "⎈";
    }
}