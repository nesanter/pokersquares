/**
 * View interface for PokerSquares
 *
 * Authors: Noah Santer (nesanter@knox.edu), Sam Hart (swhart@knox.edu)
 */

public class PokerSquaresViewText implements PokerSquaresView {
    /**
     * Inform a player that he is out of time
     */
    //
    // this checks the model and gets reference to cards array
    // displays that array somehow
    //
    static void displayTimeOut() {
        System.err.println("Player Out of Time");
    }

    static void updateDisplay() {
        Card[][] grid = PokerSqaures.getGrid();

        // print grid
        for (int row = 0; row < PokerSquares.getSize(); row++) {
            for (int col = 0; col < PokerSquares.getSize(); col++) {
                System.out.printf(" %s ",
                        grid[row][col] == null ? "--" : grid[row][col].toString());
            }
            System.out.printf("%3d\n", PokerSquares.getScoreByRow(row));
        }

        for (int col = 0; col < Controller.getSize(); col++) 
            System.out.printf("%3d ", PokerSquares.getScoreByCol(col));

        System.out.printf("%3d Total\n", Controller.getTotalScore());

        System.out.println();
    }

    static void displayIllegalMove() {
        System.err.printf("Illegal play: %s\n", Arrays.toString(play));
    }
    static void displayWin() {
        
    }
    static void displayLoss() {

    }

    static void displayCard() {
        System.out.printf("Next card is %s\n", card);
    }
}
