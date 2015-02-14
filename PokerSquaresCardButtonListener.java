import java.awt.event.*;

public class PokerSquaresCardButtonListener implements ActionListener {
    private int x, y;
    private PokerSquaresPlayer player;

    public PokerSquaresCardButtonListener(int x, int y, PokerSquaresPlayer p) {
        super();
        this.x = x;
        this.y = y;
        this.player = p;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        player.listenerCallback(x, y);
    }
}
