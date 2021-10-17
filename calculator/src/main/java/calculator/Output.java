package calculator;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;

public class Output extends JPanel{

	private TheCalculator calculator;
	
	JLabel bufferLabel;
	JLabel currentLabel;
	JLabel separator;
	public void updateOutput()
	{
		bufferLabel.setText(calculator.getBuffer());
		currentLabel.setText(calculator.getCurrent());
		revalidate();
		repaint();
	}
	public Output(TheCalculator calculator)
	{
		this.calculator = calculator;
		bufferLabel = new JLabel(calculator.getBuffer());
		bufferLabel.setFont(new Font("Serif", Font.BOLD,24));
		separator = new JLabel(" ");
		separator.setFont(new Font("Serif", Font.BOLD,15));
		currentLabel = new JLabel(calculator.getCurrent());
		currentLabel.setFont(new Font("Serif", Font.BOLD,24));
		this.setLayout(new GridLayout(3,1));
		this.add(bufferLabel);
		this.add(separator);
		this.add(currentLabel);
	}
}
