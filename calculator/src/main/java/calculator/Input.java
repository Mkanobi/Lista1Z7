package calculator;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Input extends JPanel implements ActionListener{
	
	private TheCalculator calculator;
	
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
	
	public Input(TheCalculator calculator)
	{
		this.calculator = calculator;
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
		this.setLayout(new GridLayout(4,4));
		this.add(B0);
		this.add(B1);
		this.add(B2);
		this.add(B3);
		this.add(B4);
		this.add(B5);
		this.add(B6);
		this.add(B7);
		this.add(B8);
		this.add(B9);
		this.add(Bplus);
		this.add(Bminus);
		this.add(Bdiv);
		this.add(Bmult);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		
	}
}
