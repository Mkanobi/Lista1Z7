package calculator;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class MainPanel extends JPanel{
	
	private TheCalculator calculator;
	
	private Input input;
	private Output output;
	public MainPanel()
	{
		calculator = new TheCalculator();
		output = new Output(calculator);
		input = new Input(calculator,output);
		this.setLayout(new BorderLayout());
		//this.setLayout(new GridLayout(2,1));
		this.add(output, BorderLayout.NORTH);
		this.add(input, BorderLayout.SOUTH);
	
	}
	
	
}
