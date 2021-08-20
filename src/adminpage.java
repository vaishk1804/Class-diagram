import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.nio.file.Files;
import java.nio.file.Paths;  
public class adminpage {
JFrame repf;
JTextArea report;
JButton close;
String data;
adminpage(){
	repf=new JFrame("CLASS2CODE");
	Color framecolor=new Color(202,240,248);
	repf.getContentPane().setBackground(framecolor);
	JPanel panel = new JPanel();
	try{    
        data="";
        data = new String(Files.readAllBytes(Paths.get("C:\\Users\\Dell\\Desktop\\complaint.txt")));
         
       }catch(Exception c){System.out.println(c);
       }    
	report=new JTextArea(data);
	Font f = new Font("Serif", Font.BOLD, 30);
    report.setFont(f);
	report.setBounds(50,140,850,600);
	Color myColor5=new Color(239,254,255);
	Color myColor4 = new Color(33,192,201);
	Color myColor2 = new Color(72, 202, 228);
	Border blackline = BorderFactory.createLineBorder(Color.black);
	report.setBackground(myColor5);
	report.setBorder(blackline);
	repf.add(report);   
	close=new JButton("CLOSE");
	close.setBounds(1000,400,300,100);
	close.setBackground(myColor4);
	close.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			repf.dispatchEvent(new WindowEvent(repf, WindowEvent.WINDOW_CLOSING));
			entrypage e1 =new entrypage();
			e1.b.setVisible(false);
            e1.welcome.add(e1.start);
            e1.welcome.add(e1.login);
		}
		}
	);
	repf.add(close);	
	JLabel ltitle=new JLabel("    The complaints are   ",SwingConstants.CENTER);
	ltitle.setBorder(blackline);
	ltitle.setBackground(myColor2);
	ltitle.setOpaque(true);
	ltitle.setBounds(0,0,1440,100); 
	repf.add(ltitle);
	repf.setSize(1440,824); 
	repf.setLayout(null); 
	repf.setLocationRelativeTo(null);
	repf.setVisible(true);   
	repf.add(panel);
	panel.setBackground(new Color(51,153,255));
}
public static void main(String args[]) {
new adminpage();
}
}

