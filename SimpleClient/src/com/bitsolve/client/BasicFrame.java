package com.bitsolve.client;
import javax.swing.*;

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
