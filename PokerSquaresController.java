import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class PokerSquaresController extends JPanel
    implements ActionListener
{
        private PokerSquaresModel model;
        private PokerSquaresView view;

        public PokerSquaresController( PokerSquaresModel model, PokerSquaresView view )
        {
            super( new GridLayout( 1, 5 ) );
            addButton( "start" );
            addButton( "new game" );
            this.model = model;
            this.view = view;
        }

        private void addButton( String buttonText )
        {
            JButton button = new JButton( buttonText );
            button.addActionListener( this );
            this.add( button );
        }

        /**
         * Demonstrate testing of a PokerSquaresPlayer.
         * @param args
         */

        public void actionPerformed( ActionEvent event )
        {
            String command = event.getActionCommand();
            
            //
            //            if( command.equals( "0" ) ||
            //                command.equals( "1" ) ||
            //                command.equals( "2" ) ||
            //                command.equals( "3" ) ||
            //                command.equals( "4" ) ||
            //                command.equals( "5" ) ||
            //                command.equals( "6" ) ||
            //                command.equals( "7" ) ||
            //                command.equals( "8" ) ||
            //                command.equals( "9" ) )
            //            {
            //                int number = Integer.parseInt( command );
            //                calc.numberPressed( number );
            //            }
            //            else if( command.equals( "+" ) )
            //            {
            //                calc.plus();
            //            }
            //            else if( command.equals( "-" ) )
            //            {
            //                calc.minus();
            //            }
            //            else if( command.equals( "=" ) )
            //            {
            //                calc.equals();
            //            }
            //            else if( command.equals( "C" ) )
            //            {
            //                calc.clear();
            //            }
            //            else if( command.equals( "?" ) )
            //            {
            //                showInfo();
            //            }
            //
            //            redisplay();
            if( command.equals( "start" ) )
            {
                //start a new game.
                model.playSequence( 1, 0, false );
                view.updateDisplay( model.getGrid() );
            }
        }
}

