package pack;
import java.awt.BorderLayout;
import java.awt.CardLayout;
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

public class Card_Layout extends JFrame{
	JPanel pan = new JPanel();
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
	JButton validateBut = new JButton("This is a very big button");
	
	public Card_Layout(){
		this.setTitle("Card Layout Test:");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(50, 50, 550, 450);
		pan.setLayout(new CardLayout());
		this.add(pan);
		pan.add(b1);
		pan.add(b2);
		pan.add(b3);
		pan.add(b4);
		pan.add(b5);
		pan.add(b6);
		pan.add(b7);
		pan.add(b8);
		pan.add(b9);
		pan.add(map);
		pan.add(validateBut);
		pan.add(a1);
		pan.add(a2);
		pan.add(a3);
		pan.add(a4);
		pan.add(a5);
		pan.add(a6);
		pan.add(a7);
		pan.add(a8);
		pan.add(a9);
		this.setVisible(true);
	}
public static void main(String[] args) {
	Card_Layout testFrame = new Card_Layout();
}
}

