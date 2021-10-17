package calculator;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Dimension;

public class CButton extends JButton{

	public CButton (String content)
	{
		super(content);
		this.setFont(new Font("Serif", Font.BOLD,20));
		this.setPreferredSize(new Dimension(80,80));
	}
}
