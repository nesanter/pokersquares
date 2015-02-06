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
public class UserInterface
    implements ActionListener
{
        private boolean showingAuthor;
        
        private JFrame frame;
//        private JTextField display;
//        private JLabel status;
        
        /**
         * Create a user interface for a given calcEngine.
         */
        public UserInterface()
        {
            makeFrame();
            frame.setVisible( true );
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
            
            JPanel cardPanel = new JPanel( new GridLayout( 5, 5 ) );

            // did two loops just because
            for( int i = 0; i < 5; i++ )
            {
                for( int j = 0; j < 5; j++ )
                {
                    cardPanel.add( new JPanel() );
                }
            }
            
            contentPane.add( cardPanel, BorderLayout.CENTER );

            JPanel buttonPanel = new JPanel( new GridLayout( 5, 1 ) );

            contentPane.add( buttonPanel, BorderLayout.SOUTH );
            
//            status = new JLabel( calc.getAuthor() );
//            contentPane.add( status, BorderLayout.SOUTH );
            
            frame.pack();
        }
        
        /**
         * Add a button to the button panel.
         */
        private void addButton( Container panel, String buttonText )
        {
            JButton button = new JButton( buttonText );
            button.addActionListener( this );
            panel.add( button );
        }
        
        /**
         * An interface action has been performed. Find out what it was and
         * handle it.
         */
        public void actionPerformed( ActionEvent event )
        {
//            String command = event.getActionCommand();
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
        }
        
        /**
         * Update the interface display to show the current value of the
         * calculator.
         */
        private void redisplay()
        {
//            display.setText( "" + calc.getDisplayValue() );
        }
        
        /**
         * Toggle the info display in the calculator's status area between the
         * author and version information.
         */
        private void showInfo()
        {
//            if( showingAuthor )
//            {
//                status.setText( calc.getVersion() );
//            }
//            else
//            {
//                status.setText( calc.getAuthor() );
//            }
//            
//            showingAuthor = !showingAuthor;
        }
}
