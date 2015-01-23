/**
 * View interface for PokerSquares
 *
 * Authors: Noah Santer (nesanter@knox.edu), Sam Hart (swhart@knox.edu)
 */

public interface PokerSquaresView {
    /**
     * Inform a player that he is out of time
     */
    //
    // this checks the model and gets reference to cards array
    // displays that array somehow
    //
    void displayTimeOut();
    void updateDisplay();
    void displayWin();
    void displayLoss();
    void displayOutOfTime();
}
