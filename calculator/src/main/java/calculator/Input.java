package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.util.*;


public class Input extends JPanel implements ActionListener {

    private TheCalculator calculator;
    private Output output;

    private ArrayList<CButton> B;
    private CButton Bplus;
    private CButton Bminus;
    private CButton Bdiv;
    private CButton Bmult;
    private CButton Beq;
    private CButton Besc;

    public Input(TheCalculator calculator, Output output) {
        
        B = new ArrayList<CButton>();
        for (int i = 0; i <= 9; i++) {
            B.add(new CButton(Integer.toString(i)));
        }
        this.calculator = calculator;
        this.output = output;
        Bplus = new CButton("+");
        Bminus = new CButton("-");
        Bmult = new CButton("*");
        Bdiv = new CButton("/");
        Besc = new CButton("<-");
        Beq = new CButton("=");
        this.setLayout(new GridLayout(4, 4));
        this.add(B.get(0));
        this.add(B.get(1));
        this.add(B.get(2));
        this.add(Besc);
        this.add(B.get(3));
        this.add(B.get(4));
        this.add(B.get(5));
        this.add(Bplus);
        this.add(B.get(6));
        this.add(B.get(7));
        this.add(B.get(8));
        this.add(Bminus);
        this.add(B.get(9));
        this.add(Bdiv);
        this.add(Bmult);
        this.add(Beq);
        B.get(0).addActionListener(this);
        for (int i = 0; i <= 9; i++) {
            B.get(i).addActionListener(this);
        }
        Bplus.addActionListener(this);
        Bminus.addActionListener(this);
        Bmult.addActionListener(this);
        Bdiv.addActionListener(this);
        Besc.addActionListener(this);
        Beq.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        for (int i = 0; i <= 9; i++) {
            if (source == B.get(i)) {
                calculator.inputCurrent(i);
            }
        }
        if (source == Bplus) {
            calculator.inputOperation('+');
        }
        if (source == Bminus) {
            calculator.inputOperation('-');
        }
        if (source == Bmult) {
            calculator.inputOperation('*');
        }
        if (source == Bdiv) {
            calculator.inputOperation('/');
        }
        if (source == Beq) {
            calculator.equals();
        }
        if (source == Besc) {
            calculator.delete();
        }

        output.updateOutput();
    }
}
