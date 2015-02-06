import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class CardPanel extends JPanel {
    private Card myCard;

    public CardPanel() {
        super(new GridLayout(5, 5));
        myCard = null;
    }

    protected void paintComponent(Graphics g) {
        if (myCard != null) {
            g.drawImage(myCard.getPicture(), 0, 0, this);
        }
    }

    public void setCard(Card c) {
        myCard = c;
    }

    public Card getCard() {
        return myCard;
    }
}

