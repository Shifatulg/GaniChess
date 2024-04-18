import javax.swing.*;
import java.awt.*;

public class Board {
    private JFrame frame;
    private JPanel panel;
    private Pawn button;
    public Board() {
        frame = new JFrame();
        frame.setSize(800,800);
        frame.setLayout(null);
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0,800,800);
        button = new Pawn();
        makeGrid(panel,0);
        frame.add(panel);
        frame.setVisible(true);
    }

    private static int makeGrid(JPanel gui, int X) {
        JPanel line = new JPanel();
        line.setBackground(Color.LIGHT_GRAY);
        line.setBounds(X, 0, 5, 800);
        gui.add(line);
        if (X == 900) {
            return finishGrid(gui, 0);
        } return makeGrid(gui, X + 100);
    }

    private static int finishGrid(JPanel gui, int Y) {
        JPanel line = new JPanel();
        line.setBackground(Color.LIGHT_GRAY);
        line.setBounds(0, Y, 800, 5);
        gui.add(line);
        if (Y == 900) {
            return 0;
        } return finishGrid(gui,Y + 100);
    }
}
