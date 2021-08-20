import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.*;
public class entrypage {
	JFrame welcome;
	static JProgressBar b;
	JButton start,login;
	entrypage(){
		welcome = new JFrame("CLASS2CODE");
		Color framecolor=new Color(202,240,248);
		Color myColor1 = new Color(0, 180, 216);
		welcome.getContentPane().setBackground(framecolor);
		JPanel panel = new JPanel();
		b=new JProgressBar(0,2000);
		b.setValue(0);
		b.setStringPainted(true);
		b.setBounds(100,400,800,30);
		welcome.add(b);
		JLabel label= new JLabel("WELCOME",SwingConstants.CENTER);
		label.setFont(new Font("serif",Font.ITALIC,100));
		label.setSize(710,410);
		start=new JButton("START");
		start.setBounds(100,350,400,50);
		start.setBackground(myColor1);
		start.setFont(new Font("serif",Font.ITALIC,20));
		start.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) { 
	    		new Main();
	    		welcome.dispatchEvent(new WindowEvent(welcome, WindowEvent.WINDOW_CLOSING));
	    	}
	    });	    
		login=new JButton("ADMIN LOGIN");
		login.setBounds(600,350,400,50);
		login.setBackground(myColor1);
		login.setFont(new Font("serif",Font.ITALIC,20));
		login.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) { 
	    		new password();
	    		welcome.dispatchEvent(new WindowEvent(welcome, WindowEvent.WINDOW_CLOSING));
	    	}
	    });	    
		welcome.add(label);
		welcome.setSize(1040,524);  
	    welcome.setLayout(null);  
	    welcome.setLocationRelativeTo(null);
	    welcome.setVisible(true);   
	    welcome.add(panel);	
	}
	public void fill()
    {
        int i = 0;
        try {
            while (i <= 2000) {
                b.setValue(i);
                 Thread.sleep(80);
                i += 80;
            }
            b.setVisible(false);
            welcome.add(start);
            welcome.add(login);
        }
        catch (Exception e) {
        }
    }
	public static void main(String[] args) {
		entrypage e = new entrypage();
		e.fill();
	}
}
