public class Grid {  
    private int rows;
    private int cols;
    private int mines;
    private Tile[][] myGrid;
   


    public Grid(int rowNum, int colNum, int mineNum){ //setting grid x and y dimensions
        rows = rowNum;
        cols = colNum;
        mines = mineNum;
        myGrid = new Tile[rows][cols];
	    makeGrid();

    }

    public void makeGrid(){ //makes a grid with the correct number of rows, cols, and mines
        for(int i = 0; i< mines; i++){
            int row = (int) (Math.random() * rows);
            int col = (int) (Math.random() * cols);
            
            while (myGrid[row][col] != null){
                row = (int) (Math.random() * rows);
                col = (int) (Math.random() * cols);
            }
        
            Tile myTile = new Tile();
            myGrid[row][col] = myTile;
            myGrid[row][col].markMine();
            
        }
        
        for(int i = 0; i<myGrid.length; i++){
            for(int j = 0; j<myGrid[i].length; j++){
                if(myGrid[i][j] == null){
                    Tile blankTile = new Tile();
                    myGrid[i][j] = blankTile;
                    blankTile.setMinesNear(minesNear(i, j));                
                }
            }
        }
      
    }
    
    public int minesNear(int i, int j){ //determines how many mines are touching a safe tile
        int numMines = 0;
	    if(myGrid[i][j].isMine() == false){
            for(int m = -1; m<2; m++){
                for(int n = -1; n<2; n++){
                    if(i+m > - 1 && j+n > -1 && i+m < myGrid.length && j+n < myGrid[i].length){
			            if(myGrid[i+m][j+n] != null && myGrid[i+m][j+n].isMine() == true){
                           numMines++;
                        }
                    }
                }
            }
        } 
        return numMines;
        }

    public Tile returnTile(int rowCoor, int colCoor){ //to access a specific tile in myGrid
        return myGrid[rowCoor][colCoor];
    }

    public String toString(){ //adds each tile in a given row to a string and then creates a new line for a new row
        String printGrid = "";
        for(int i = 0; i<myGrid.length; i++){
            for(int j = 0; j<myGrid[i].length; j++){  
                printGrid +=myGrid[i][j];
            }
            printGrid += "\n";
        }
        return printGrid;
    }
    public void revealAll(){ //flips all of the tiles (to be used at the end of the game)
        for(int i = 0; i<myGrid.length; i++){
            for(int j = 0; j<myGrid[i].length; j++){
                myGrid[i][j].flip();
            }
        }
    }

   
}
