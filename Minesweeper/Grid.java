public class Grid {  
    private int xSize;
    private int ySize;
    private int mineNum;
    private Tile[][] myGrid;
   


    public Grid(int xDim, int yDim, int num){ //setting grid x and y dimensions
        ySize = yDim;
        xSize = xDim;
        mineNum = num;
        myGrid = new Tile[xSize][ySize];

    }

    public void makeGrid(){

        for(int i = 0; i< mineNum; i++){
            int x = (int) (Math.random() * xSize);
            int y = (int) (Math.random() * ySize);
            
            while (myGrid[x][y] != null){
                int x = (int) (Math.random() * xSize);
                int y = (int) (Math.random() * ySize);
            }
        
            Tile myTile = new Tile();
            myGrid[x][y] = myTile;
            myGrid[x][y].markMine();
            
        }
        
        for(int i = 0; i<myGrid.length; i++){
            for(int j = 0; j<myGrid[i].length; j++){
                if(myGrid[i][j] == null){
                    Tile blankTile = new Tile();
                    myGrid[i][j] = blankTile;
                    blankTile.neighborMines(mineNum());
                }
            }
        }
      
    }
    
    public int mineNum(){
        int numMines = 0;
         for(int i =0; i<myGrid.length; i++){
            for(int j=0; j<myGrid[i].length; j++){
                numMines = 0;
                if(myGrid[i][j].isMine() == false){
                    for(int m = -1; m<2; m++){
                        for(int n = -1; n<2; n++){
                            if(i+m > - 1 && j+n > -1 && i+m < myGrid.length && j+n < myGrid[i].length){

                                if(myGrid[i+m][j+n].isMine() == true){
                                    numMines++;
                                }
                            }
                        }
                    }
                }
               return numMines;
        
                }

            } 
        }
     
    }
     public static void main(String[] args){
        Grid newGrid = new Grid(6, 5, 8);
        newGrid.makeGrid();
        System.out.println(mineNum());
    }
   
}
