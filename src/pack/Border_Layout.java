package pack;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class Border_Layout extends JFrame implements ActionListener{
	JPanel pan = new JPanel();
	JButton btn1 = new JButton("LEVEL 1");
	JButton btn2 = new JButton("LEVEL 2");
	JButton btn3 = new JButton("LEVEL 3");
	JButton btn4 = new JButton("LEVEL 4");
	JButton btn5 = new JButton("LEVEL 5");
	JLabel one = new JLabel("CARD NUMBER ONE");
	JTextArea area = new JTextArea();
	ImageIcon bigMap = new ImageIcon("C:/images/tunisia.jpg");
	Image extract = bigMap.getImage();
	Image smaller_img = extract.getScaledInstance(180,250,java.awt.Image.SCALE_SMOOTH);
	ImageIcon smallMap = new ImageIcon(smaller_img);
    JLabel map = new JLabel(smallMap);
    JButton validateBut = new JButton("This is a very big button");
	JLabel text = new JLabel("A normal text");
	
	public Border_Layout(){
		this.setTitle("Border Layout Test:");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(50, 50, 1000, 600);
		this.add(pan);
		pan.setLayout(new BorderLayout());
		btn1.setFont(new Font("Arial",Font.BOLD,100));
		btn2.setFont(new Font("Arial",Font.BOLD,100));
		one.setFont(new Font("Arial",Font.BOLD,80));
		text.setFont(new Font("Arial",Font.BOLD,30));
		area.setPreferredSize(new Dimension (250,200));
		pan.add(btn1);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		this.setVisible(true);
}

	@Override
	public void actionPerformed(ActionEvent event) {
		Object source;
		source = event.getSource();
		if (source==btn1) {
			pan.remove(btn1);
			pan.add(btn2);
		this.setVisible(true);}
		else if (source==btn2) {
			pan.remove(btn1);
			pan.remove(btn2);
			btn1.removeActionListener(this);
			btn2.removeActionListener(this);
			btn3.addActionListener(this);
			btn1.setFont(new Font("Arial",Font.BOLD,15));
			btn2.setFont(new Font("Arial",Font.BOLD,15));
			btn3.setFont(new Font("Arial",Font.BOLD,15));
			btn4.setFont(new Font("Arial",Font.BOLD,15));
			btn5.setFont(new Font("Arial",Font.BOLD,15));
			pan.add(btn1,BorderLayout.NORTH);
			pan.add(btn5,BorderLayout.SOUTH);
			pan.add(btn3,BorderLayout.CENTER);
			pan.add(btn2,BorderLayout.EAST);
			pan.add(btn4,BorderLayout.WEST);
			
		this.setVisible(true);}
		else if (source == btn3) {
			pan.remove(btn1);
			pan.remove(btn2);
			pan.remove(btn3);
			pan.remove(btn4);
			pan.remove(btn5);
			pan.add(map,BorderLayout.NORTH);
			pan.add(one,BorderLayout.SOUTH);
			pan.add(area,BorderLayout.EAST);
			pan.add(validateBut,BorderLayout.WEST);
			pan.add(text,BorderLayout.CENTER);
			map.setToolTipText("BorderLayout.NORTH");
			one.setToolTipText("BorderLayout.SOURH");
			area.setToolTipText("BorderLayout.EAST");
			validateBut.setToolTipText("BorderLayout.WEST");
			text.setToolTipText("BorderLayout.CENTER");
			this.setVisible(true);
		}
		
	}
	public static void main (String [] args ) {
		Border_Layout testFrame = new Border_Layout(); 
	}
}
