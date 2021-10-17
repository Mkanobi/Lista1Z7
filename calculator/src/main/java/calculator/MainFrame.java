package calculator;

import javax.swing.JFrame;

public class MainFrame extends JFrame
{
	private MainPanel panel;
	public MainFrame()
	{
		panel = new MainPanel();
		setSize(800,800);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		setLocationRelativeTo(null);
	}
}