package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.util.*;


public class Input extends JPanel implements ActionListener {

    /** Referencja na logikę kalkulatora. */
    private TheCalculator calculator;
    /** Referencja na output. */
    private Output output;

    /** Tablica przycisków cyfr. */
    private ArrayList<CButton> b;
    /** Przycisk "+". */
    private CButton bplus;
    /** Przycisk "-". */
    private CButton bminus;
    /** Przycisk "/". */
    private CButton bdiv;
    /** Przycisk "*". */
    private CButton bmult;
    /** Przycisk "=". */
    private CButton beq;
    /** Przycisk "<-". */
    private CButton besc;
    /** Constructor inputu.
     * @param calculator referencja na kalkulator
     * @param output referencja na output
     * */
    public Input(final TheCalculator calculator, final Output output) {
        
        b = new ArrayList<CButton>();
        for (int i = 0; i <= 9; i++) {
            b.add(new CButton(Integer.toString(i)));
        }
        this.calculator = calculator;
        this.output = output;
        bplus = new CButton("+");
        bminus = new CButton("-");
        bmult = new CButton("*");
        bdiv = new CButton("/");
        besc = new CButton("<-");
        beq = new CButton("=");
        this.setLayout(new GridLayout(4, 4));
        this.add(b.get(0));
        this.add(b.get(1));
        this.add(b.get(2));
        this.add(besc);
        this.add(b.get(3));
        this.add(b.get(4));
        this.add(b.get(5));
        this.add(bplus);
        this.add(b.get(6));
        this.add(b.get(7));
        this.add(b.get(8));
        this.add(bminus);
        this.add(b.get(9));
        this.add(bdiv);
        this.add(bmult);
        this.add(beq);
        b.get(0).addActionListener(this);
        for (int i = 0; i <= 9; i++) {
            b.get(i).addActionListener(this);
        }
        bplus.addActionListener(this);
        bminus.addActionListener(this);
        bmult.addActionListener(this);
        bdiv.addActionListener(this);
        besc.addActionListener(this);
        beq.addActionListener(this);

    }
    /** Funkcja od ActionListener.
     * @param e wykonywana akcja(przycisk)
     *  */
    public void actionPerformed(final ActionEvent e) {
        Object source = e.getSource();
        for (int i = 0; i <= 9; i++) {
            if (source == b.get(i)) {
                calculator.inputCurrent(i);
            }
        }
        if (source == bplus) {
            calculator.inputOperation('+');
        }
        if (source == bminus) {
            calculator.inputOperation('-');
        }
        if (source == bmult) {
            calculator.inputOperation('*');
        }
        if (source == bdiv) {
            calculator.inputOperation('/');
        }
        if (source == beq) {
            calculator.equals();
        }
        if (source == besc) {
            calculator.delete();
        }

        output.updateOutput();
    }
}
