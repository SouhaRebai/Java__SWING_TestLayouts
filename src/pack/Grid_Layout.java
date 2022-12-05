package pack;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
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

public class Grid_Layout extends JFrame{
	JPanel pan = new JPanel();
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
	JButton validateBut = new JButton("This is a very big button");
    JTextField field = new JTextField(15);
    JLabel lab= new JLabel("This is a label");
    String [] options=new String []{"Arabe","Français","Anglais","Italien"};
    JList language=new JList(options);
    
	public Grid_Layout(){
		this.setTitle("Grid Layout Test:");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(50, 50, 1000, 600);
		this.add(pan,BorderLayout.CENTER);
		pan.setLayout(new GridLayout(7,3,2,2));
		validateBut.setPreferredSize(new Dimension (320,300));
		lab.setFont(new Font("Arial",Font.BOLD,20));
		lab.setForeground(Color.WHITE);
		lab.setOpaque(true);
		lab.setBackground(Color.DARK_GRAY);
		pan.add(a1);
		pan.add(a2);
		pan.add(a3);
		pan.add(a4);
		pan.add(a5);
		pan.add(a6);
		pan.add(a7);
		pan.add(a8);
		pan.add(a9);
		pan.add(map);
		pan.add(validateBut);
		pan.add(field);
		pan.add(lab);
		pan.add(language);
		this.setVisible(true);
	}
public static void main(String[] args) {
	Grid_Layout testFrame = new Grid_Layout();
}
}


