public class Grid{  
    private static int xSize;
    private static int ySize;
    private static int mineNum;

    public Grid(int xDim, int yDim, int num){ //setting grid x and y dimensions
    ySize = yDim;
    xSize = xDim;
    mineNum = num;

    }

    public static void makeGrid(){
         String[][] grid = new String[xSize][ySize];

        for(int i = 0; i< mineNum; i++){
            int x = (int) (Math.random() * xSize);
            int y = (int) (Math.random() * ySize);
            
            while(grid[x][y] == "m"){
                x = (int) (Math.random() * xSize);
                y = (int) (Math.random() * ySize);
            }
            grid[x][y] = mine();
        }
       

        for(int i =0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                grid[i][j] = "[0]";
                System.out.print(grid[i][j]);
            } 
        }
    }
     public static void main(String[] args){
        Grid newGrid = new Grid(6, 5, 8);
        newGrid.makeGrid();
    }
   
}