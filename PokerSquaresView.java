/**
 * View interface for PokerSquares
 *
 * Authors: Noah Santer (nesanter@knox.edu), Sam Hart (swhart@knox.edu)
 */

public interface PokerSquaresView
{
    /**
     * Inform a player that he is out of time
     */
    //
    // this checks the model and gets reference to cards array
    // displays that array somehow
    //
    void displayOutOfTime();
    void updateDisplay( Card[][] grid );
    void displayWin();
    void displayLoss();
    void displayIllegalMove( int[] play );
    void displayNextCard( Card card );
    void GiveModelReference( PokerSquaresModel model );
    void setController( PokerSquaresController controller );
}
