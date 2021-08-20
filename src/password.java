import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
import java.util.Arrays;  
public class password {  
	password(){
		JFrame f=new JFrame("CLASS2CODE");    
	    Color myColor4 = new Color(33,192,201);
	    Color framecolor=new Color(202,240,248);
		f.getContentPane().setBackground(framecolor);
		JPanel panel = new JPanel(); 
	     final JPasswordField value = new JPasswordField();   
	     value.setBounds(300,200,100,30);   
	     JLabel l1=new JLabel("Username:");    
	        l1.setBounds(200,100,80,30);    
	        JLabel l2=new JLabel("Password:");    
	        l2.setBounds(200,200, 80,30); 
	        JLabel l3=new JLabel("Invalid:");    
	        l3.setBounds(200,200,80,30);  
	        JButton b = new JButton("Login");  
	        b.setBounds(100,320, 280,50); 
	        b.setBackground(myColor4);
	        final JTextField text = new JTextField();  
	        text.setBounds(300,100, 100,30);    
	        JButton close=new JButton("CLOSE");
	    	close.setBounds(400,320,280,50);
	    	close.setBackground(myColor4);
	    	close.addActionListener(new ActionListener() {
	    		public void actionPerformed(ActionEvent e) {
	    			f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
	    			entrypage e1 =new entrypage();
	    			e1.b.setVisible(false);
	                e1.welcome.add(e1.start);
	                e1.welcome.add(e1.login);
	                f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
	    		}
	    		}
	    	);
	    	f.add(close);	
	                f.add(value); f.add(l1); f.add(l2); f.add(b); f.add(text);      
	                b.addActionListener(new ActionListener() {  
	                public void actionPerformed(ActionEvent e) { 
	                	char[] correctPassword = { '1', '2', '3', '4' };
	                	char[] input = value.getPassword();
	                	boolean isCorrect = Arrays.equals (input, correctPassword);  
	                   if(isCorrect && text.getText().equalsIgnoreCase("admin")){
	                	   new adminpage();
	                	   f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
	                   } 
	                   else{
	                		   System.out.println("enter the valid username and password");
	                		   JOptionPane.showMessageDialog(f,"Incorrect login or password",
	                		   "Error",JOptionPane.ERROR_MESSAGE);
	                		   }
	                }  
	             });   
	                f.setSize(740,524); 
	            	f.setLayout(null); 
	            	f.setLocationRelativeTo(null);
	            	f.setVisible(true);  
	                f.add(panel);
	            	panel.setBackground(new Color(51,153,255));
	}  
    public static void main(String[] args) {    
    new password();
}} 

