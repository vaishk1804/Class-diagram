import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.io.FileWriter;  
public class codegenerate {
JFrame codef;
JButton close;
JTextArea codelink,filename;
String nam;
	codegenerate(){
		Main cl=new Main("hekk");
		nam=cl.content;
		Color myColor4 = new Color(33,192,201);
		Color myColor2 = new Color(72, 202, 228);
		Border blackline = BorderFactory.createLineBorder(Color.black);
		codef=new JFrame("CLASS2CODE");
		Color framecolor=new Color(202,240,248);
		codef.getContentPane().setBackground(framecolor);
		JPanel panel = new JPanel();
		JLabel l=new JLabel("sourcecode.txt   ",SwingConstants.CENTER);
		l.setBounds(50,140,850,100);
		l.setBorder(blackline);
		l.setBackground(myColor4);
		l.setOpaque(true);
		codef.add(l);
		close=new JButton("Close");
		close.setBounds(1000,140,300,100);
		close.setBackground(myColor4);
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codef.dispatchEvent(new WindowEvent(codef, WindowEvent.WINDOW_CLOSING));
			     }    
			
			}
		);
		codef.add(close);	
		JLabel ltitle=new JLabel("    YOUR CODE IS SAVED IN FILE    ",SwingConstants.CENTER);
		ltitle.setBorder(blackline);
		ltitle.setBackground(myColor2);
		ltitle.setOpaque(true);
		ltitle.setBounds(0,0,1440,50); 
		codef.add(ltitle);
		codef.setSize(1440,424); 
		codef.setLayout(null);
		codef.setLocationRelativeTo(null);
		codef.setVisible(true);   
		codef.add(panel);
		panel.setBackground(new Color(51,153,255));
	}
	public static void main(String[] args) {
		new codegenerate();
	}

}
