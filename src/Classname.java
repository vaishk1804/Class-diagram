import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Classname {
	String classname,content;
Classname(){
	Main ob = new Main();
	JTextArea name = new JTextArea();
	Border blackline = BorderFactory.createLineBorder(Color.black);
	name.setBounds(1002,158,340,50);
	classname= name.getText();
	JButton classnam = new JButton(classname);
	classnam.setBackground(Color.white);
	classnam.setBorder(blackline);
	classnam.setBounds(ob.x+5,ob.y+5,10,10);
	classnam.setOpaque(true);
	ob.f.add(classnam);
	}
	public static void main(String[] args) {
	new Classname();

	}

}
