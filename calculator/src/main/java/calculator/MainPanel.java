package calculator;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class MainPanel extends JPanel {

    /** Referencja na logikę kalkulatora. */
    private TheCalculator calculator;

    /** Frame z inputem kalkulatora. */
    private Input input;
    /** Frame z outputem kalkulatora. */
    private Output output;

    /** Konstruktor głównego panelu. */
    public MainPanel() {
        calculator = new TheCalculator();
        output = new Output(calculator);
        input = new Input(calculator, output);
        this.setLayout(new BorderLayout());
        // this.setLayout(new GridLayout(2,1));
        this.add(output, BorderLayout.NORTH);
        this.add(input, BorderLayout.SOUTH);

    }

}
