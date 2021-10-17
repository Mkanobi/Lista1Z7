package calculator;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Output extends JPanel{

	private TheCalculator calculator;
	
	JLabel bufferLabel;
	JLabel currentLabel;
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
		currentLabel = new JLabel(calculator.getCurrent());
		this.setLayout(new GridLayout(2,1));
		this.add(bufferLabel);
		this.add(currentLabel);
	}
}
