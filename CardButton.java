import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

import java.awt.image.BufferedImage;

public class CardButton extends CardPanel
    implements ActionListener
{
        private JButton button;
        int x;
        int y;
        
        public CardButton( int x, int y )
        {
            super();
            setLayout( new BorderLayout( 0, 0 ) );
            setBorder( new EmptyBorder( 0, 0, 0, 0 ) );
            button = new JButton( "" );
            add( button, BorderLayout.CENTER );
            button.addActionListener( this );
            this.x = x;
            this.y = y;
        }

        void addListener( ActionListener l )
        {
            button.addActionListener( l );
        }
        
        @Override
        public void setCard( Card c )
        {
            myCard = c;
            setComponentSize();
            repaint();
        }
        
        private void setComponentSize()
        {
            if( myCard != null )
            {
                BufferedImage image = myCard.getPicture();
                size.width  = image.getWidth();
                size.height = image.getHeight();
                revalidate();
            }
        }

        private void addButton( String buttonText )
        {
            JButton button = new JButton( buttonText );
            button.addActionListener( this );
            this.add( button );
        }

        public void actionPerformed( ActionEvent event )
        {
            button.setVisible( false );
        }
}

