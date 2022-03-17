package s14;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import s131.*;
import s12.*;
import s11.*;
import s10.*;
public class tour2 extends JFrame
{
	public tour2(){}
	public tour2(String s){
	super(s);}
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JButton b1,b2;
	JRadioButton r1,r2,r3,r4,r5,r6;
	ButtonGroup g1,g2;
	ImageIcon i1;
	public void choose()
	{
		l1=new JLabel("*********WELCOME TO INCERIDIBEL INDIA******** ");
		l2=new JLabel("CHOOSE YOUR PLACE");
		ImageIcon i1=new ImageIcon("mount.jpg");
		l3=new JLabel(i1);
		//l4=new JLabel("");
		//l5=new JLabel("");
		//l6=new JLabel("");
		//l7=new JLabel("");
		b1=new JButton("NEXT");
		b2=new JButton("CANCEL");
		r1=new JRadioButton("HIMACHAL PRADESH");
		r2=new JRadioButton("RAJISTHAN");
		r3=new JRadioButton("GUJRAT");
		r4=new JRadioButton("SOUTH INDIA ");
//r5=new JRadioButton("7 SISTER OF EAST");
		r6=new JRadioButton("EXIT");
		g1=new ButtonGroup();
		g1.add(r1);
		g1.add(r2);
		g1.add(r3);
		g1.add(r4);
	//	g1.add(r5);
		g1.add(r6);
		l3.setVisible(true);
		setLayout(null);
		l3.setBounds(1,1,800,900);
		l1.setBounds(50,50,500,70);
		l2.setBounds(50,150,500,70);
		r1.setBounds(200,300,250,70);
		r2.setBounds(500,300,150,70);
		r3.setBounds(200,400,150,70);
		r4.setBounds(400,400,200,70);
		//r5.setBounds(200,500,250,70);
		r6.setBounds(500,500,150,70);
		b1.setBounds(550,1,100,50);
		b2.setBounds(650,1,150,50);
		l1.setFont(new Font("Vendana",Font.PLAIN,20));
		l2.setFont(new Font("Vendana",Font.PLAIN,20));
		r1.setFont(new Font("Vendana",Font.PLAIN,15));
		r2.setFont(new Font("Vendana",Font.PLAIN,15));
		r3.setFont(new Font("Vendana",Font.PLAIN,15));
		r4.setFont(new Font("Vendana",Font.PLAIN,15));
		//r5.setFont(new Font("Vendana",Font.PLAIN,15));
		r6.setFont(new Font("Vendana",Font.PLAIN,15));
		b1.setForeground(Color.white);
		b2.setForeground(Color.white);
		b1.setBackground(Color.black);
		b2.setBackground(Color.black);
		b1.setFont(new Font("Vendana",Font.PLAIN,20));
		b2.setFont(new Font("Vendana",Font.PLAIN,20));
	    l1.setForeground(Color.red);
		l2.setForeground(Color.red);
		r1.setForeground(Color.red);
		r2.setForeground(Color.red);
		r3.setForeground(Color.red);
		r4.setForeground(Color.red);
		//r5.setForeground(Color.red);
		r6.setForeground(Color.red);
		add(l1);
		add(l2);
		add(r1);
		add(r2);
		add(r3);
		add(r4);
	//	add(r5);
		add(r6);
		add(b1);
		add(b2);
		add(l3);		
		b1.addActionListener(new handle());
		b2.addActionListener(new handle());
	}
	class handle implements ActionListener
	{
		public void actionPerformed(ActionEvent oe)
		{
			Object o=oe.getSource();
			{
				if(o==b1)
				{ 
			      if(r1.isSelected())
					{
		  				tour3 t3=new tour3("WELCOME TO HIMACHAL PRADESH");
         		               t3.him();
		                    t3.setSize(1000,1100);
	                 	//t3.setResizable(false);
		                    t3.setVisible(true);
		                 t3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
				 else if(r2.isSelected())
				 {
					 tour4 t4=new tour4("WELCOME TO RAJISTHAN");
		          t4.raj();
		         t4.setSize(1000,1100);
		         //t4.setResizable(false);
		          t4.setVisible(true);
		            t4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
				 else if(r3.isSelected())
				 {
					 tour5 t5=new tour5("WELCOME TO GUJRAT");
	              	t5.guj();
						t5.setSize(1400,1100);
						//t5.setResizable(false);
		             t5.setVisible(true);
              		t5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
				 }
				 else if(r4.isSelected())
				 {
		
		
		          tour6 t6=new tour6("WELCOME TO SOUTH INDIA");
	             	t6.sou();
           	     	t6.setSize(1400,1100);
		             //t6.setResizable(false);
	        	   t6.setVisible(true);
		          t6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 }
				 /*else if(r5.isSelected())
				 {
				 }*/
				 else
				 {
					 System.exit(0);
				 }
				}
				else
				{
					System.exit(0);
				}
			}
		}
	}
				
					
	/*public static void main(String args[])
	{
		tour2 t2 = new 	tour2("SECOND PAGE");
		t2.choose();
		t2.setSize(800,900);
		t2.setResizable(false);
		t2.setVisible(true);
		t2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }*/
}

		