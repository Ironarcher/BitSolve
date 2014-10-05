package com.bitsolve.server;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BasicFrame extends JFrame{
	JPanel myPanel;
	JLabel outputLabel;
	
	public BasicFrame(){
		myPanel = new JPanel();
		outputLabel = new JLabel();
		outputLabel.setText("NULL");
		myPanel.add(outputLabel);
		this.add(myPanel);
	}
	
}
