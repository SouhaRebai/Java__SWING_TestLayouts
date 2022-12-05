package pack;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.TextArea;
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

public class Flow_Layout extends JFrame{
	JPanel pan1 = new JPanel();
	JPanel pan2 = new JPanel();
	JPanel pan3 = new JPanel();
	JTextArea area = new JTextArea();
	ImageIcon bigMap = new ImageIcon("C:/images/tunisia.jpg");
	Image extract = bigMap.getImage();
	Image smaller_img = extract.getScaledInstance(180,250,java.awt.Image.SCALE_SMOOTH);
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
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");
	JButton c1 = new JButton("a");
	JButton c2 = new JButton("b");
	JButton c3 = new JButton("c");
	JButton c4 = new JButton("d");
	JButton c5 = new JButton("e");
	JButton c6 = new JButton("f");
	JButton c7 = new JButton("g");
	JButton c8 = new JButton("h");
	JButton c9 = new JButton("i");
	JButton validateBut = new JButton("This is a very big button");
	
	public Flow_Layout(){
		this.setTitle("Flow Layout Test:");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(50, 50, 600, 450);
		this.add(pan1,BorderLayout.CENTER);
		this.add(pan2,BorderLayout.NORTH);
		this.add(pan3,BorderLayout.SOUTH);
		pan1.setLayout(new FlowLayout(FlowLayout.LEFT));
		pan2.setLayout(new FlowLayout(FlowLayout.RIGHT));
		pan3.setLayout(new FlowLayout(FlowLayout.CENTER));
		validateBut.setPreferredSize(new Dimension (320,300));
		pan1.add(b1);
		pan1.add(b2);
		pan1.add(b3);
		pan1.add(b4);
		pan1.add(b5);
		pan1.add(b6);
		pan1.add(b7);
		pan1.add(b8);
		pan1.add(b9);
		pan1.add(map);
		pan1.add(validateBut);
		pan2.add(a1);
		pan2.add(a2);
		pan2.add(a3);
		pan2.add(a4);
		pan2.add(a5);
		pan2.add(a6);
		pan2.add(a7);
		pan2.add(a8);
		pan2.add(a9);
		pan3.add(c1);
		pan3.add(c2);
		pan3.add(c3);
		pan3.add(c4);
		pan3.add(c5);
		pan3.add(c6);
		pan3.add(c7);
		pan3.add(c8);
		pan3.add(c9);
		
		this.setVisible(true);
	}
public static void main(String[] args) {
	Flow_Layout testFrame = new Flow_Layout();
}
}

