/**
 * LivePokerSquaresPlayer
 * Authors: Noah Santer, Sam Hart
 */
public class LivePokerSquaresPlayer implements PokerSquaresPlayer
{

    private final int SIZE = PokerSquaresModel.SIZE;

    private PokerSquaresCardButtonListener[][] listeners;

    private int last_x, last_y;

    @Override
    public void init()
    {
        for( int row = 0; row < SIZE; row++ )
            for( int col = 0; col < SIZE; col++ )
            {
                listeners[row][col] = new PokerSquaresCardButtonListener(row,col,this);
            }
        last_x = -1;
        last_y = -1;
    }

    @Override
    public void listenerCallback(int x, int y) {

    }

    @Override
    public int[] getPlay( Card card, long millisRemaining )
    {
        int x = last_x;
        int y = last_y;
        last_x = -1;
        last_y = -1;

        int[] play = new int[2];
        play[0] = last_x;
        play[1] = last_y;

        return play;
    }
}
