public class Grid {  
    private static int xSize;
    private static int ySize;
    private static int mineNum;
    Tile[][] myGrid = new Tile[xSize][ySize];


    public Grid(int xDim, int yDim, int num){ //setting grid x and y dimensions
        ySize = yDim;
        xSize = xDim;
        mineNum = num;

    }

    public void makeGrid(){

        for(int i = 0; i< mineNum; i++){
            int x = (int) (Math.random() * xSize);
            int y = (int) (Math.random() * ySize);

            if(myGrid[x][y] != null){
                if(myGrid[x][y].isMine() == true){
                    x = (int) (Math.random() * xSize);
                    y = (int) (Math.random() * ySize);
                }
            }

            Tile myTile = new Tile();
            myGrid[x][y] = myTile;
            myGrid[x][y].markMine();
            
        }
       

        for(int i =0; i<myGrid.length; i++){
            for(int j=0; j<myGrid[i].length; j++){
                if(myGrid[i][j].isMine() == false){
                    myGrid[i][j].setup();
                }
                System.out.println(myGrid[i][j]);
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
