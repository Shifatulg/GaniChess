import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class Pawn extends Piece {
    private JButton piece;
    private ArrayList<JButton> possiblePositions;
    public Pawn() {
        super();
        possiblePositions = new ArrayList<JButton>();
        piece = new JButton();
    }


}
