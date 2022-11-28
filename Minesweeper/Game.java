public class Game {
    private int numSafe;
    private Grid gameGrid;
    private boolean gameOver;
    private int rowNum;
    private int colNum;

    public Game(int rows, int cols, int mines){
        colNum = cols;
        rowNum = rows;
        gameOver = false;
        gameGrid = new Grid(rows, cols, mines);
        numSafe = (rows*cols) - mines;
    }
    public void printOut(){ //prints out the grid
        System.out.println("Safe tiles left:" + numSafe);
        System.out.println(gameGrid);
    }
    public void flip(int rowCoor, int colCoor){ //if tile is flagged, print out message, if it is a mine, end the game, otherwise flip tile
        if(gameGrid.returnTile(rowCoor, colCoor).returnFlagged() == true){
            System.out.println("This tile is flagged! You cannot flip a flagged tile.");
        }
        else if(gameGrid.returnTile(rowCoor, colCoor).isMine() == true){
             gameGrid.returnTile(rowCoor, colCoor).flip();
             System.out.println("You hit a mine!");
             gameOver = true;
        }
        else if(gameGrid.returnTile(rowCoor, colCoor).returnFlipped() == true){
            System.out.println("This tile is already flipped! Please try a different tile.");
        }
        else{
            recursiveFlip(rowCoor, colCoor);
        }
    }
    
    public void recursiveFlip(int rowCoor, int colCoor){ //if the tile chosen to be flipped is blank, it propogates the flipping until it doesn't hit any more blank tiles
        Tile flippedTile = gameGrid.returnTile(rowCoor, colCoor);
        flippedTile.flip();
        numSafe--;
        if(flippedTile.getMinesNear() == 0){
            for(int m = -1; m<2; m+=2){
                if(rowNum > rowCoor-m && rowCoor-m > - 1){
                    flippedTile = gameGrid.returnTile(rowCoor-m, colCoor);
                    if (flippedTile.returnFlagged() == false && flippedTile.returnFlipped() == false){
                        recursiveFlip(rowCoor-m, colCoor);
                    }
                }

                if(colNum > colCoor-m && colCoor-m > -1){
                    flippedTile = gameGrid.returnTile(rowCoor, colCoor-m);
                    if(flippedTile.returnFlagged() == false && flippedTile.returnFlipped() == false){
                        recursiveFlip(rowCoor, colCoor-m);
                    }

                }
            
        }
    }
        
    }
       
    
    public void flag(int rowCoor, int colCoor){ //flags a tile on the game board
        if(gameGrid.returnTile(rowCoor, colCoor).returnFlagged() == true){
            gameGrid.returnTile(rowCoor, colCoor).unflag();
        }
        else if(gameGrid.returnTile(rowCoor, colCoor).returnFlipped() == true){
            System.out.println("This tile is flipped! You cannot flag a flipped tile.");
        }
        else {
            gameGrid.returnTile(rowCoor, colCoor).flag();
        }
        
    }

    public boolean isGameOver(){ //checks if ithe game is over
        if(numSafe == 0){
            return true;
        }
        if(gameOver == true){
            return true;
        }
        else {
            return false;
        }
    }
    public void endMessage(){ //final message for when isGameOver = true
        gameGrid.revealAll();
        System.out.println("Actual game board:");
        System.out.println(gameGrid);
        if(numSafe == 0){
            System.out.println("Congratulations! You won :)");
        }
        else{
            System.out.println("You lost. Better luck next time :(");
        }
        
    }

}
