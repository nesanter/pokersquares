import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class PokerSquares
{
        /**
         * Demonstrate testing of a PokerSquaresPlayer.
         * @param args
         */
        public static void main( String[] args )
        {
        
            Scanner s = new Scanner( System.in );
            System.out.println( "Welcome to poker squares!" );
            System.out.println( "  Pick a player to use:" );
            System.out.println( "    0 - Exit" );
            System.out.println( "    1 - Random Player" );
            System.out.println( "    2 - Flush Player" );
            
            PokerSquaresModel model;
            PokerSquaresView view;
            PokerSquaresController controller;

            LivePokerSquaresPlayer lp;
            PokerSquaresGUI gui;
            
            switch( s.nextInt() )
            {
                case 0:
                    break;
                    
                case 1:
                    //ps = new PokerSquaresModel( new RandomPokerSquaresPlayer(), PokerSquaresModel.GAME_MILLIS, new PokerSquaresGUI() );
                    lp = new LivePokerSquaresPlayer();
                    model = new PokerSquaresModel( lp, PokerSquaresModel.GAME_MILLIS );
                    gui = new PokerSquaresGUI();
                    gui.setCardPane( lp.getCardsPane() );
                    view = gui;
                    controller = new PokerSquaresController( model, view );
                    view.GiveModelReference( model );
                    view.setController( controller );
                    break;
                    
                case 2:
                    //ps = new PokerSquaresModel( new FlushPokerSquaresPlayer(), PokerSquaresModel.GAME_MILLIS, new PokerSquaresGUI() );
                    lp = new LivePokerSquaresPlayer();
                    model = new PokerSquaresModel( lp, PokerSquaresModel.GAME_MILLIS );
                    gui = new PokerSquaresGUI();
                    gui.setCardPane( lp.getCardsPane() );
                    view = gui;
                    controller = new PokerSquaresController( model, view );
                    view.GiveModelReference( model );
                    view.setController( controller );
                    break;
                    
                default:
                    System.out.println( "That's not a vaild player choice!" );
                    break;
            }
        }
}

