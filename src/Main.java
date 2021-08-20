import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.io.FileWriter; 
class MyCanvas extends JComponent {
	int prex,prey;
	int x2,y2;
	public MyCanvas(int prex,int prey,int x2,int y2){
		this.prex=prex;
		this.prey=prey;
		this.x2=x2;
		this.y2=y2;
	setSize(1400, 824); 
	}
	  
    public void paint(Graphics g)
    {
    	System.out.println("whoop");
    	 g.setColor(Color.BLACK);
        g.drawLine(prex,prey,x2,y2);
        
    }
}
class Myassoc extends JComponent {
	int prex,prey;
	int x2,y2;
	public Myassoc(int prex,int prey,int x2,int y2){
		this.prex=prex;
		this.prey=prey;
		this.x2=x2;
		this.y2=y2;
	setSize(1400, 824); 
	}
	  
    public void paint(Graphics g)
    {int dx = x2 - prex, dy = y2 - prey;
    double D = Math.sqrt(dx*dx + dy*dy);
    double xm = D - 10, xn = xm, ym = 10, yn = -10, x;
    double sin = dy / D, cos = dx / D;

    x = xm*cos - ym*sin + prex;
    ym = xm*sin + ym*cos + prey;
    xm = x;

    x = xn*cos - yn*sin + prex;
    yn = xn*sin + yn*cos + prey;
    xn = x;

    int[] xpoints = {x2, (int) xm, (int) xn};
    int[] ypoints = {y2, (int) ym, (int) yn};
    g.drawLine(prex,prey,x2,y2);	
    g.fillPolygon(xpoints, ypoints, 3);
    	
    }
}
public class Main {
	JButton bclass,binterface,bname,binheritance,bupdate,breport,bcodegenerate,bmethod,battri,bassociation;
	JTextArea report,name,method,attribute;
	JFrame f;
	Border blackline;
	Color myColor1,myColor2,myColor3,myColor4,myColor5;
	int prex,prey,x2,y2,x,y,w,h;
	String content=" ";
	Main(String nam){
		
	}
	Main(){
		f=new JFrame("CLASS2CODE");
		Color framecolor=new Color(202,240,248);
		f.getContentPane().setBackground(framecolor);
		JPanel panel = new JPanel();
		prex=0;
		prey=0;
		myColor1 = new Color(0, 180, 216);
		myColor2 = new Color(72, 202, 228);
		myColor3 = new Color(123,221,231);
		myColor4 = new Color(33,192,201);
		myColor5=new Color(239,254,255);
		blackline = BorderFactory.createLineBorder(Color.black);
		JLabel ltitle=new JLabel("                    Class diagram to Code   ");
		ltitle.setBorder(blackline);
		ltitle.setBackground(myColor2);
		ltitle.setOpaque(true);
		JLabel lbox=new JLabel("");
		lbox.setBorder(blackline);
		lbox.setBackground(Color.WHITE);
		lbox.setOpaque(true);
		bclass=new JButton("CLASS");
		binterface=new JButton("CLOSE");
		bname=new JButton("Class name");
		bmethod=new JButton("Methods");
		battri=new JButton("Attributes");
		binheritance=new JButton("Inheritance");
		bassociation=new JButton("Association");
		bupdate=new JButton("UPDATE");
		breport=new JButton("REPORT");
		bcodegenerate=new JButton("CODE GENERATE");
		bclass.setBackground(myColor1);
		binterface.setBackground(myColor1);
		bupdate.setBackground(myColor3);
		breport.setBackground(myColor4);
		binheritance.setBackground(myColor5);
		bassociation.setBackground(myColor5);
		bname.setBackground(myColor5);
		bmethod.setBackground(myColor5);
		battri.setBackground(myColor5);
		bcodegenerate.setBackground(myColor1);
		ltitle.setBounds(0,0,1440,100); 
		lbox.setBounds(10,120,850,600);
		x=10;
		y=120;
		w=850;
		h=600;
		bclass.setBounds(951,38,209,98);  
	    binterface.setBounds(1199,38,209,98);
	    bname.setBounds(1002,158,340,50);
	    bmethod.setBounds(1002,320,340,80);
	    battri.setBounds(1002,220,340,80);
	    binheritance.setBounds(1002,425,160,50);
	    bassociation.setBounds(1180,425,160,50);
	    bupdate.setBounds(1002,499,340,70); 
	    breport.setBounds(1002,593,340,70); 
	    bcodegenerate.setBounds(1002,687,340,70);
	    f.add(bassociation);
	    f.add(bclass);  
	    f.add(binterface); 
	    f.add(bname);
	    f.add(battri);
	    f.add(bmethod);
	    f.add(binheritance);
	    f.add(ltitle); 
	    f.add(lbox);
	    f.add(bupdate);
	    f.add(breport);
	    f.add(bcodegenerate);
	    bcodegenerate.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) { 
	    		new codegenerate();
	    	}
	    });	  
	    breport.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) { 
	    		new Report();
	    	}
	    });	
	    bclass.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) { 
	    		name = new JTextArea(5,20);
	    		attribute = new JTextArea(5,20);
	    		method = new JTextArea(5,20);
	    		bname.setVisible(false);
	    		bmethod.setVisible(false);
	    		battri.setVisible(false);
	    		name.setBounds(1002,158,340,50);
	    		name.setBackground(myColor5);
	    		name.setBorder(blackline);
	    		f.add(name);
	    		attribute.setBounds(1002,220,340,80);
	    		attribute.setBackground(myColor5);
	    		attribute.setBorder(blackline);
	    		f.add(attribute);
	    		method.setBounds(1002,320,340,80);
	    		method.setBackground(myColor5);
	    		attribute.setBorder(blackline);
	    		f.add(method);
	    		
	    	}
	    });	
	    f.addMouseListener(new MouseAdapter() {
	    	@Override 
	    	public void mousePressed(MouseEvent e) {
	    		prex=x2;
	    		prey=y2;
	    			x=e.getX();
	    			y=e.getY();
	    			x2=x;
	    			y2=y-25;
	    			System.out.println(prex+" "+prey+" "+x2+" "+y2);
	    			}});
	    bupdate.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) { 
	    		String classname= name.getText();
	    		String met = method.getText();
	    		String att= attribute.getText();
	    		JButton classnam = new JButton(classname);
	    		classnam.setBackground(Color.white);
	    		classnam.setBorder(blackline);
	    		classnam.setBounds(x2,y2,100,50);
	    		JTextArea attnam = new JTextArea(att);
	    		attnam.setBackground(Color.white);
	    		attnam.setBorder(blackline);
	    		attnam.setBounds(x2,y2+50,100,70);
	    		JTextArea metnam = new JTextArea(met);
	    		metnam.setBackground(Color.white);
	    		metnam.setBorder(blackline);
	    		metnam.setBounds(x2,y2+120,100,70);
	    		classnam.setOpaque(true);
	    		f.add(classnam);
	    		f.add(metnam);
	    		f.add(attnam);
	    		lbox.setVisible(false);
	    		f.remove(name);
	    		f.remove(method);
	    		f.remove(attribute);
	    		bname.setVisible(true);
	    		bmethod.setVisible(true);
	    		battri.setVisible(true);
	    		f.revalidate();
	    		f.validate();
	    		f.repaint();
	    		content=content+"\n\npublic class "+classname+"{ \n\n" ;
	    		if(!(att.equalsIgnoreCase("")))
	    		{
	    			String[] lines = att.split("\\r?\\n");
	    		  for (String line : lines) {
	    			  String k="";
	    			if(line.charAt(0)=='-')
	    				k="private";
	    			else if(line.charAt(0)=='+')
	    				k="public";
	    			else
	    				k="protected";
	    		            content=content+k+line.substring(line.indexOf(" "))+" "+line.substring(1,line.indexOf(" ")-1)+";\n";
	    		            
	    		        }
	    		}
	    		if(!(met.equalsIgnoreCase("")))
	    		{
	    		  String[] meths = met.split("\\r?\\n");
	    		  for (String meth : meths) {
	    			  String k="";
		    			if(meth.charAt(0)=='-')
		    				k="private";
		    			else if(meth.charAt(0)=='+')
		    				k="public";
		    			else
		    				k="protected";
	   	    		            content=content+k+ meth.substring(meth.indexOf(" "))+" "+meth.substring(1,meth.indexOf(" ")-1)+"{\n\n }\n";
    	    		        }
	    		}
	    		  content=content+" \n}";
	    		try{    
			           FileWriter fw=new FileWriter("C:\\Users\\Dell\\Desktop\\sourcecode.txt");    
			           fw.write(content);    
			           fw.close();    
			          }catch(Exception c){System.out.println(e);
			          }    

	    	}
	    });	
	    binterface.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
				entrypage e1 =new entrypage();
				e1.b.setVisible(false);
	            e1.welcome.add(e1.start);
	            e1.welcome.add(e1.login);
			}
			}
		);
	    binheritance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("bro");
				if(prex<x2 && prey>y2)
					f.add(new Myassoc(prex-10,prey-5,x2+10,y2-5));
					else if(prex<x2 && prey<y2)
						f.add(new Myassoc(prex-10,prey-5,x2+10,y2-5));
					else if(x2<prex && y2<prey)
						f.add(new Myassoc(prex+10,prey-10,x2-10,y2-10));
					else
						f.add(new Myassoc(prex+10,prey-10,x2-10,y2-10));
			f.repaint();
			}
			}
		);
	    bassociation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("brother");
				if(prex<x2 && prey>y2)
				f.add(new MyCanvas(prex-10,prey-5,x2+10,y2-15));
				else if(prex<x2 && prey<y2)
					f.add(new MyCanvas(prex-10,prey-5,x2+10,y2-5));
				else if(x2<prex && y2<prey)
					f.add(new MyCanvas(prex+10,prey-10,x2-10,y2-10));
				else
					f.add(new MyCanvas(prex+10,prey-10,x2-10,y2-10));
				f.repaint();
			}
			}
		);
	   
	    f.setSize(1440,824);  
	    f.setLayout(null);  
	    f.setLocationRelativeTo(null);
	    f.setVisible(true);   
	    f.add(panel);
		panel.setBackground(new Color(51,153,255));
		
	}	  
	public static void main(String[] args) {
		new Main();
	
	}

}
