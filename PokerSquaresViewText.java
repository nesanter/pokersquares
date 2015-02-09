/**
 * View interface for PokerSquares
 *
 * Authors: Noah Santer (nesanter@knox.edu), Sam Hart (swhart@knox.edu)
 */

import java.util.Arrays;

public class PokerSquaresViewText implements PokerSquaresView
{
        private PokerSquaresModel model;
        
        public PokerSquaresViewText()
        {
        }
        
        @Override
        public void GiveModelReference( PokerSquaresModel model )
        {
            this.model = model;
        }
        
        @Override
        public void displayOutOfTime()
        {
            System.err.println( "Player Out of Time" );
        }
        
        @Override
        public void updateDisplay( Card[][] grid )
        {
            //Card[][] grid = model.getGrid();
            
            // print grid
            for( int row = 0; row < 5; row++ )
            {
                for( int col = 0; col < 5; col++ )
                {
                    System.out.printf( " %s ",
                                       grid[row][col] == null ? "--" : grid[row][col].toString() );
                }
                
                System.out.printf( "%3d\n", model.getScoreByRow( row ) );
            }
            
            for( int col = 0; col < 5; col++ )
            {
                System.out.printf( "%3d ", model.getScoreByCol( col ) );
            }
            
            System.out.printf( "%3d Total\n", model.getTotalScore() );
            
            System.out.println();
        }
        
        @Override
        public void displayIllegalMove( int[] play )
        {
            System.err.printf( "Illegal play: %s\n", Arrays.toString( play ) );
        }
        
        @Override
        public void displayWin()
        {
        
        }
        
        @Override
        public void displayLoss()
        {
        
        }
        
        @Override
        public void displayNextCard( Card card )
        {
            System.out.printf( "Next card is %s\n", card );
        }

        @Override
        public void setController( PokerSquaresController controller )
        {
        }
}
