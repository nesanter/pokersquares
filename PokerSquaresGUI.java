import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * A graphical user interface for the calculator. No calculation is being
 * done here. This class is responsible just for putting up the display on
 * screen. It then refers to the "CalcEngine" to do all the real work.
 *
 * @author David J. Barnes and Michael Kolling
 * @version 31 July 2000
 */
public class PokerSquaresGUI
    implements PokerSquaresView
{
        private boolean showingAuthor;

        private CardPanel[][] cards;
        
        private JFrame frame;
        //        private JTextField display;
        private JLabel status;

        private JPanel cardsPane;

        private PokerSquaresController controller;
        
        /**
         * Create a user interface for a given calcEngine.
         */
        public PokerSquaresGUI()
        {
            cards = new CardPanel[ 5 ][ 5 ];
            makeFrame();
            frame.setVisible( true );
            this.controller = controller;
        }

        @Override
        public void setController( PokerSquaresController controller )
        {
            this.controller = controller;

            JPanel contentPane = ( JPanel )frame.getContentPane();
            //JPanel buttonPanel = new JPanel( new GridLayout( 1, 5 ) );
            
            //addButton( buttonPanel, "start" );
            //addButton( buttonPanel, "new game" );
            
            //contentPane.add( buttonPanel, BorderLayout.NORTH );
            contentPane.add( controller, BorderLayout.NORTH );

            frame.pack();
        }
        
        /**
         * Make this interface visible again. (Has no effect if it is already
         * visible.)
         */
        public void setVisible( boolean visible )
        {
            frame.setVisible( visible );
        }
        
        /**
         * Make the frame for the user interface.
         */
        private void makeFrame()
        {
            frame = new JFrame( "Poker Squares" );
            
            JPanel contentPane = ( JPanel )frame.getContentPane();
            contentPane.setLayout( new BorderLayout( 8, 8 ) );
            contentPane.setBorder( new EmptyBorder( 10, 10, 10, 10 ) );

            //JPanel buttonPanel = new JPanel( new GridLayout( 1, 5 ) );
            
            //addButton( buttonPanel, "start" );
            //addButton( buttonPanel, "new game" );
            
            //contentPane.add( buttonPanel, BorderLayout.NORTH );
            //contentPane.add( controller, BorderLayout.NORTH );
            
            JPanel cardPanel = new JPanel( new GridLayout( 5, 5 ) );
            
            // did two loops just because
            for( int i = 0; i < 5; i++ )
            {
                for( int j = 0; j < 5; j++ )
                {
                    CardButton p = new CardButton();
                    p.setVisible( true );
                    p.setCard( Card.allCards[ 0 ] );
                    // fuck it, we're ace of clubs now.
                    cards[ i ][ j ] = p;
                    cardPanel.add( p );
                }
            }

            cardsPane = cardPanel;

            
            contentPane.add( cardPanel, BorderLayout.CENTER );
            
            status = new JLabel( "Poker Squares is Great!" );
            contentPane.add( status, BorderLayout.SOUTH );
            
            frame.pack();
        }
        
        /**
         * An interface action has been performed. Find out what it was and
         * handle it.
         */
        
        @Override
        public void displayOutOfTime()
        {
            status.setText( "Out of time!" );
        }
        
        @Override
        public void updateDisplay( Card[][] crds )
        {
            //Card[][] crds = this.model.getGrid();

            for( int i = 0; i < 5; i++ )
            {
                for( int j = 0; j < 5; j++ )
                {
                    this.cards[ i ][ j ].setCard( crds[ i ][ j ] );
                }
            }

            cardsPane.repaint();
            JPanel contentPane = ( JPanel )frame.getContentPane();
            contentPane.doLayout();
        }
        
        @Override
        public void displayWin()
        {
            status.setText( "WIN!" );
        }
        
        @Override
        public void displayLoss()
        {
            status.setText( "LOSE!" );
        }
        
        @Override
        public void displayIllegalMove( int[] play )
        {
        }
        
        @Override
        public void displayNextCard( Card card )
        {
        }

        @Override
        public void GiveModelReference( PokerSquaresModel model )
        {
        }
}
