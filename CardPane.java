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
public class CardPane
    extends JPanel
{
        private CardButton[][] cards;
        
        public CardPane()
        {
            cards = new CardButton[ 5 ][ 5 ];

            setLayout( new GridLayout( 5, 5 ) );
            
            // did two loops just because
            for( int i = 0; i < 5; i++ )
            {
                for( int j = 0; j < 5; j++ )
                {
                    CardButton p = new CardButton( i, j );
                    p.setVisible( true );
                    p.setCard( Card.allCards[ 0 ] );
                    // fuck it, we're ace of clubs now.
                    cards[ i ][ j ] = p;
                    add( p );
                }
            }

            // push cardsPane = cardPanel;
        }

        public CardButton[][] getCards()
        {
            return cards;
        }

        void setCard( Card c, int x, int y )
        {
            this.cards[ x ][ y ].setCard( c );
        }
}
