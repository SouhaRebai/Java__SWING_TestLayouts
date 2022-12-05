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

import javax.swing.BoxLayout;
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
public class Test extends JFrame{
	JPanel pan1 = new JPanel();
	JPanel pan2 = new JPanel();
	JPanel pan3 = new JPanel();
	JTextArea area = new JTextArea();
	JTextField field1 = new JTextField(5);
	JTextField field2 = new JTextField(5);
	JTextField field3 = new JTextField(5);
	JTextField field4 = new JTextField(5);
	JButton btn = new JButton("Tapez votre code");
	public Test(){
		this.setTitle("Border Layout Test:");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(50, 50, 1000, 600);
		this.add(pan1,BorderLayout.NORTH);
		this.add(pan2,BorderLayout.CENTER);
		this.add(pan3,BorderLayout.SOUTH);
		pan2.setLayout(new FlowLayout());
		area.setPreferredSize(new Dimension(250,50));
		pan1.add(area);
		pan2.add(field1);
		pan2.add(field2);
		pan2.add(field3);
		pan2.add(field4);
		pan3.add(btn);
		pack();
		this.setVisible(true);
}


	public static void main(String[] args) {
		Test t = new Test();

	}

}
