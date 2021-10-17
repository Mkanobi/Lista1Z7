package calculator;

import javax.swing.JPanel;
import java.awt.GridLayout;

public class MainPanel extends JPanel{
	
	private Input input;
	private Output output;
	public MainPanel()
	{
		this.setLayout(new GridLayout(1,2));
		this.add(output);
		this.add(input);
	
	}
	
	
}
