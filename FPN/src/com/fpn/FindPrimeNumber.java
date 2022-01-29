package com.fpn;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class FindPrimeNumber  extends JFrame {

private Toolkit toolkit;

 public FindPrimeNumber() {
 setTitle("Prime Nuber Finder");
 setSize(800, 600);
 toolkit = getToolkit();
 
 Dimension size = toolkit.getScreenSize();
 setLocation((size.width - getWidth())/2, (size.height -getHeight())/2);
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 JPanel panel = new JPanel();
 getContentPane().add(panel);
 panel.setLayout(null);
 Font fontSanserif = new Font("SansSerif", Font.BOLD, 15);
 JLabel appTitle = new JLabel("Prime Number finder");
 appTitle.setFont(fontSanserif);
 appTitle.setBounds(370, 10, 300, 30);
 
 JLabel lbl1 = new JLabel("Enter numbers  :");
 lbl1.setBounds(150,80,100,30);
 lbl1.setFont(fontSanserif);
 
 JLabel lbl2 = new JLabel("out put      :");
 lbl2.setBounds(150,280,100,30);
 lbl2.setFont(fontSanserif);
 
 final JTextArea txtInput = new JTextArea();
 txtInput.setBounds(270,80,400,160);
 txtInput.setText(" ");
 txtInput.setFont(fontSanserif);
 
 final JTextArea txtOutput = new JTextArea();
 txtOutput.setBounds(270,270,400,160);
 txtOutput.setFont(fontSanserif);

 JButton getOutPut = new JButton("get out put");
 getOutPut.setBounds(200, 460, 110, 30);
 getOutPut.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent event) {
String out = FpnService.getPrime(txtInput.getText());

txtOutput.setText(String.valueOf(out));  
}
});

panel.add(lbl1);
panel.add(appTitle);
panel.add(lbl2);
panel.add(txtInput);
panel.add(txtOutput);
panel.add(getOutPut);
}

public static void main(String[] args) {
	FindPrimeNumber buttons = new FindPrimeNumber();
buttons.setVisible(true);
}
}