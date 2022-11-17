public class Grid{  
    private static int xSize;
    private static int ySize;
    private static int mineNum;

    public Grid(int xDim, int yDim, int num){ //setting grid x and y dimensions
        ySize = yDim;
        xSize = xDim;
        mineNum = num;

    }
    public void makeGrid(){
         Tile[][] myGrid = new Tile[xSize][ySize];

        for(int i = 0; i< mineNum; i++){
            int x = (int) (Math.random() * xSize);
            int y = (int) (Math.random() * ySize);

            if(myGrid[x][y] != null){
                if(myGrid[x][y].isMine == true){
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
                System.out.println(myGrid[i][j]);
            } 
        }
    }
     /* public static String flip(int xCoor, int yCoor){
        grid[xCoor][yCoor] = actualValue[xCoor][yCoor];
        return grid[xCoor][yCoor];
    } */

     public static void main(String[] args){
        Grid newGrid = new Grid(6, 5, 8);
        newGrid.makeGrid();
    }
   
}