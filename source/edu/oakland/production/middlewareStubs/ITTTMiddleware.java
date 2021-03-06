package edu.oakland.production.middleware;

public interface ITTTMiddleware {

    /**
     * The placeMarkOnBoard method is used to place a mark on the board for the active player.
     *
     * @param mark the mark to place
     * @param row the row to place the mark
     * @param col the column to place the mark
     * @return true if the mark was placed successfully, false if a mark was
     * already placed there previously
     */
    boolean placeMarkOnBoard(char mark, int row, int col);

    /**
     * The checkForWinOrDraw determines if win or draw has occurred.
     *
     * @return the character of the player that won, 'd' for draw, or 'n' for none
     */
    char checkForWinOrDraw();

    /**
     * The getBoard method is used for accessing an array version of the board.
     *
     * @return the board as a two-dimensional board
     */
    char[][] getBoard();
}
