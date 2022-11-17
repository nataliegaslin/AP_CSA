public class Tile{
    public boolean isMine = false;
    private boolean isFlag;
    private boolean isEmpty;
    private int nearMines;
    private String app;


    public String markMine(){
        isMine = true;
        return "[m]";
    }



    public String markEmpty(){
        isEmpty = true;
        return "[0]";
    }
}