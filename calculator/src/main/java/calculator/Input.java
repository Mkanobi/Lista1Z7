package calculator;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Input extends JPanel implements ActionListener{
	
	private TheCalculator calculator;
	private Output output;
	
	private JButton B0;
	private JButton B1;
	private JButton B2;
	private JButton B3;
	private JButton B4;
	private JButton B5;
	private JButton B6;
	private JButton B7;
	private JButton B8;
	private JButton B9;
	private JButton Bplus;
	private JButton Bminus;
	private JButton Bdiv;
	private JButton Bmult;
	private JButton Beq;
	private JButton Besc;
	
	public Input(TheCalculator calculator, Output output)
	{
		
		this.calculator = calculator;
		this.output = output;
		B0 = new JButton("0");
		B1 = new JButton("1");
		B2 = new JButton("2");
		B3 = new JButton("3");
		B4 = new JButton("4");
		B5 = new JButton("5");
		B6 = new JButton("6");
		B7 = new JButton("7");
		B8 = new JButton("8");
		B9 = new JButton("9");
		Bplus = new JButton("+");
		Bminus = new JButton("-");
		Bmult = new JButton("*");
		Bdiv = new JButton("/");
		Besc = new JButton("<-");
		Beq = new JButton("=");
		this.setLayout(new GridLayout(4,4));
		this.add(B0);
		this.add(B1);
		this.add(B2);
		this.add(Besc);
		this.add(B3);
		this.add(B4);
		this.add(B5);
		this.add(Beq);
		this.add(B6);
		this.add(B7);
		this.add(B8);
		this.add(Bplus);
		this.add(B9);
		this.add(Bminus);
		this.add(Bdiv);
		this.add(Bmult);
		B0.addActionListener(this);
		B1.addActionListener(this);
		B2.addActionListener(this);
		B3.addActionListener(this);
		B4.addActionListener(this);
		B5.addActionListener(this);
		B6.addActionListener(this);
		B7.addActionListener(this);
		B8.addActionListener(this);
		B9.addActionListener(this);
		Bplus.addActionListener(this);
		Bminus.addActionListener(this);
		Bmult.addActionListener(this);
		Bdiv.addActionListener(this);
		Besc.addActionListener(this);
		Beq.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		if (source == B0)
		{
			calculator.inputCurrent(0);
		}
		if (source == B1)
		{
			calculator.inputCurrent(1);
		}
		if (source == B2)
		{
			calculator.inputCurrent(2);
		}
		if (source == B3)
		{
			calculator.inputCurrent(3);
		}
		if (source == B4)
		{
			calculator.inputCurrent(4);
		}
		if (source == B5)
		{
			calculator.inputCurrent(5);
		}
		if (source == B6)
		{
			calculator.inputCurrent(6);
		}
		if (source == B7)
		{
			calculator.inputCurrent(7);
		}
		if (source == B8)
		{
			calculator.inputCurrent(8);
		}
		if (source == B9)
		{
			calculator.inputCurrent(9);
		}
		if (source == Bplus)
		{
			calculator.inputOperation('+');
		}
		if (source == Bminus)
		{
			calculator.inputOperation('-');
		}
		if (source == Bmult)
		{
			calculator.inputOperation('*');
		}
		if (source == Bdiv)
		{
			calculator.inputOperation('/');
		}
		if (source == Beq)
		{
			calculator.equals();
		}
		if (source == Besc)
		{
			calculator.delete();
		}
		
		output.updateOutput();
	}
}
