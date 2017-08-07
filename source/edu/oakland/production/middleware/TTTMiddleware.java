package edu.oakland.middleware.production;

public class TTTMiddleware {
	
	private TTTDatabase database;
	private char[][] tttBoard = getBoard();
	
    /**
     * The placeMarkOnBoard method is used to place a mark on the board for the active player.
     *
     * @param mark the mark to place
     * @param row the row to place the mark
     * @param col the column to place the mark
     * @return true if the mark was placed successfully, false if a mark was
     * already placed there previously
     */
    public boolean placeMarkOnBoard(char mark, int row, int col){
    	if (mark == 'X' || mark == 'O' && row >= 0 && row <= 2 && col >= 0 && col <= 2) {
    		if (tttBoard[row][col] == '-') {
    			database.writeToBoard(row, col, mark);
    			return true;
    		}
    		else
    			return false;
    	}
    	else
    		return false;
    }

    /**
     * The checkForWinOrDraw determines if win or draw has occurred.
     *
     * @return the character of the player that won, 'd' for draw, or 'n' for none
     */
    public char checkForWinOrDraw(){}

    /**
     * The getBoard method is used for accessing an array version of the board.
     *
     * @return the board as a two-dimensional board
     */
    public char[][] getBoard(){
    	return(dataBase.getBoardStatus());
    }
}
