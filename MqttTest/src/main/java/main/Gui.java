package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Gui implements ActionListener {
	
	JFrame frame =new JFrame();
	
	JButton Connect = new JButton("Connect");
	JLabel labelServer = new JLabel("Server:");
	JLabel labelPort =new JLabel("Port:");
	JTextField ip= new JTextField();
	JTextField port= new JTextField();
	JCheckBox cb= new JCheckBox("verschlüsselt /unverschlüsselt");
	
	Gui(){
		
		Connect.setBounds(0,160,200,30);
		Connect.setFocusable(false);
		Connect.addActionListener(this);
		
		cb.setBounds(0,50,500,50);
		frame.add(cb);
		
		frame.add(labelServer);
		
		frame.add(ip);
		ip.setBounds(50,15,150,20);
		
		frame.add(port);
		port.setBounds(250, 15,150,20);
		
		labelServer.setBounds(0,0,100,50);
		labelPort.setBounds(210, 0, 30, 50);
		 
		
		frame.add(labelPort);
		frame.add(Connect);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		
		
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==Connect) {
			frame.dispose();
		
			
			JFrame frameafterlogin=new JFrame();
			
			frameafterlogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frameafterlogin.setSize(420,420);
			frameafterlogin.setLayout(null);
			frameafterlogin.setVisible(true);
			}
		
	}
}
