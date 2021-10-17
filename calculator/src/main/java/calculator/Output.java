package calculator;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Output extends JPanel{

	JLabel bufferLabel;
	JLabel currentLabel;
	public Output()
	{
		bufferLabel = new JLabel("   buffer");
		currentLabel = new JLabel("   current");
		this.setLayout(new GridLayout(2,1));
		this.add(bufferLabel);
		this.add(currentLabel);
	}
}
