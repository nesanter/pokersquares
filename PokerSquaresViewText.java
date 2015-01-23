/**
 * View interface for PokerSquares
 *
 * Authors: Noah Santer (nesanter@knox.edu), Sam Hart (swhart@knox.edu)
 */

import java.util.Arrays;

public class PokerSquaresViewText implements PokerSquaresView {
    private PokerSquares pokerSquares;

    public PokerSquaresViewText(PokerSquares ps) {
        this.pokerSquares = ps;
    }

    @Override
    public void displayOutOfTime() {
        System.err.println("Player Out of Time");
    }

    @Override
    public void updateDisplay() {
        Card[][] grid = pokerSquares.getGrid();

        // print grid
        for (int row = 0; row < pokerSquares.getSize(); row++) {
            for (int col = 0; col < pokerSquares.getSize(); col++) {
                System.out.printf(" %s ",
                        grid[row][col] == null ? "--" : grid[row][col].toString());
            }
            System.out.printf("%3d\n", pokerSquares.getScoreByRow(row));
        }

        for (int col = 0; col < pokerSquares.getSize(); col++) 
            System.out.printf("%3d ", pokerSquares.getScoreByCol(col));

        System.out.printf("%3d Total\n", pokerSquares.getTotalScore());

        System.out.println();
    }

    @Override
    public void displayIllegalMove(int[] play) {
        System.err.printf("Illegal play: %s\n", Arrays.toString(play));
    }

    @Override
    public void displayWin() {
        
    }

    @Override
    public void displayLoss() {

    }

    @Override
    public void displayNextCard(Card card) {
        System.out.printf("Next card is %s\n", card);
    }
}
