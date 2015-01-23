import java.util.Scanner;

public class PokerSquares {
    /**
     * Demonstrate testing of a PokerSquaresPlayer.
     * @param args
     */
    public static void main(String[] args) {

        Scanner s = new Scanner( System.in );
        System.out.println( "Welcome to poker squares!" );
        System.out.println( "  Pick a player to use:" );
        System.out.println( "    0 - Exit" );
        System.out.println( "    1 - Random Player" );
        System.out.println( "    2 - Flush Player" );

        PokerSquaresModel ps;

        switch( s.nextInt() )
        {
            case 0:
                break;
            case 1:
                ps = new PokerSquaresModel(new RandomPokerSquaresPlayer(), PokerSquaresModel.GAME_MILLIS, new PokerSquaresViewText() );
                ps.playSequence(5, 0, false);
                break;
            case 2:
                ps = new PokerSquaresModel(new FlushPokerSquaresPlayer(), PokerSquaresModel.GAME_MILLIS, new PokerSquaresViewText() );
                ps.playSequence(5, 0, false);
                break;
            default:
                System.out.println( "That's not a vaild player choice!" );
                break;
        }
    }
}

