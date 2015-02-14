import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

import java.awt.image.BufferedImage;

public class CardPanel extends JPanel
{
        protected Card myCard;

        Dimension size = new Dimension();
        
        public CardPanel()
        {
            super( new GridLayout( 1, 1 ) );
            myCard = null;
        }
        
        //        @Override
        protected void paintComponent( Graphics g )
        {
            super.paintComponent( g );
            
            if( myCard != null )
            {
                g.drawImage( myCard.getPicture(), 0, 0, this );
            }
        }
        
        public void setCard( Card c )
        {
            myCard = c;
            setComponentSize();
            repaint();
        }
        
        public Card getCard()
        {
            return myCard;
        }

        public Dimension getPreferredSize()
        {
            return size;
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
}

