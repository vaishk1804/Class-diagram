import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*; 
import java.io.FileWriter;  
public class Report {
JFrame repf;
JTextArea report;
JButton save;
Report(){
	repf=new JFrame("CLASS2CODE");
	Color framecolor=new Color(202,240,248);
	repf.getContentPane().setBackground(framecolor);
	JPanel panel = new JPanel();
	report=new JTextArea();
	report.setBounds(50,140,850,600);
	Color myColor5=new Color(239,254,255);
	Color myColor4 = new Color(33,192,201);
	Color myColor2 = new Color(72, 202, 228);
	Border blackline = BorderFactory.createLineBorder(Color.black);
	report.setBackground(myColor5);
	report.setBorder(blackline);
	repf.add(report);
	save=new JButton("Submit");
	save.setBounds(1000,400,300,100);
	save.setBackground(myColor4);
	save.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String complaint= report.getText()+"\n";
			try{    
		           FileWriter fw=new FileWriter("C:\\Users\\Dell\\Desktop\\complaint.txt",true);    
		           fw.write(complaint);    
		           fw.close();    
		          }catch(Exception c){System.out.println(e);
		          }    
			repf.dispatchEvent(new WindowEvent(repf, WindowEvent.WINDOW_CLOSING));
		     }    
		}
	);
	repf.add(save);	
	JLabel ltitle=new JLabel("    Enter your complaint   ",SwingConstants.CENTER);
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
new Report();
}
}