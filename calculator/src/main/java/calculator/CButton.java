package calculator;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;

public class CButton extends JButton {

    public CButton(String content) {
        super(content);
        this.setFont(new Font("Serif", Font.BOLD, 20));
        this.setPreferredSize(new Dimension(80, 80));
    }
}
