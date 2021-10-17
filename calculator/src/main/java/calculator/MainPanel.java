package calculator;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class MainPanel extends JPanel{
	
	private Input input;
	private Output output;
	public MainPanel()
	{
		input = new Input();
		output = new Output();
		this.setLayout(new BorderLayout());
		//this.setLayout(new GridLayout(2,1));
		this.add(output, BorderLayout.NORTH);
		this.add(input, BorderLayout.SOUTH);
	
	}
	
	
}
