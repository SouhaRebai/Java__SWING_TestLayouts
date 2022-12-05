package pack;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.TextArea;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class Box_Layout_Line extends JFrame{
	JPanel pan = new JPanel();
	ImageIcon bigMap = new ImageIcon("C:/images/tunisia.jpg");
	Image extract = bigMap.getImage();
	Image smaller_img = extract.getScaledInstance(200,280,java.awt.Image.SCALE_SMOOTH);
	ImageIcon smallMap = new ImageIcon(smaller_img);
    JLabel map = new JLabel(smallMap);
	JButton a1 = new JButton("A");
	JButton a2 = new JButton("B");
	JButton a3 = new JButton("C");
	JButton a4 = new JButton("D");
	JButton a5 = new JButton("E");
	JButton a6 = new JButton("F");
	JButton a7 = new JButton("G");
	JButton a8 = new JButton("H");
	JButton a9 = new JButton("I");
	JButton validateBut = new JButton("Valider");
	
	public Box_Layout_Line(){
		this.setTitle("Grid Layout LINE_AXIS Test:");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(50, 50, 700, 400);	
		this.add(pan);
		pan.setLayout(new BoxLayout(pan,BoxLayout.LINE_AXIS));
		pan.add(a1);
		pan.add(a2);
		pan.add(a3);
		pan.add(a4);
		pan.add(a5);
		pan.add(a6);
		pan.add(a7);
		pan.add(a8);
		pan.add(validateBut);
		pan.add(map);
		validateBut.setSize(new Dimension (320,320));
		//preferred size does not work 
		pan.add(validateBut);
		this.setVisible(true);
	}
public static void main(String[] args) {
	Box_Layout_Line testFrame = new Box_Layout_Line();
}
}


