//south India
package s10;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import s19.*;
public class tour6 extends JFrame
{
	public tour6(){}
	public tour6(String s)
	{
		super(s);
	}
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;	
	ImageIcon i1,i2,i3,i4;
	JButton b1,b2;
	public void sou()
	{
		l1=new JLabel("COORG");
		l2=new JLabel("KODAIKANAL");
		l3=new JLabel("OOTY");
		l4=new JLabel("HAMPI");
		i1=new ImageIcon("Coorg-1.jpg");
		i2=new ImageIcon("Kodaikanal-1.jpg");
		i3=new ImageIcon("OOTY-1.jpg");
		i4=new ImageIcon("Hampi-1.jpg");
		l5=new JLabel(i1);
		l6=new JLabel(i2);
		l7=new JLabel(i3);
		l8=new JLabel(i4);
		b1=new JButton("History");
		l1.setFont(new Font("Serif",Font.ITALIC,40));
		l2.setFont(new Font("Serif",Font.ITALIC,40));
		l3.setFont(new Font("Serif",Font.ITALIC,40));
		l4.setFont(new Font("Serif",Font.ITALIC,40));
		l1.setForeground(Color.black);
	    l2.setForeground(Color.black);
		l3.setForeground(Color.black);
        l4.setForeground(Color.black);
		b1.setForeground(Color.white);
		b1.setBackground(Color.black);
        l5.setVisible(true);
		l6.setVisible(true);
		l7.setVisible(true);
		l8.setVisible(true);
		setLayout(null);
		l5.setBounds(1,1,550,400);
	    l1.setBounds(100,1,300,150);
		l6.setBounds(550,1,600,400);
		l2.setBounds(650,1,400,150);
		l7.setBounds(1,400,550,400);
		l3.setBounds(100,400,200,150);
		l8.setBounds(550,325,600,450);
		l4.setBounds(750,400,400,150);
		b1.setBounds(1200,100,100,70);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(b1);
		b1.addActionListener(new handle());
	}
	class handle implements ActionListener
{
   public void actionPerformed(ActionEvent ae)
   {
      h4 hk = new 	h4("INFORMATION");
		hk.his4();
		hk.setSize(1000,1500);
		//h.setResizable(false);
		hk.setVisible(true);
		hk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}
/*	public static void main(String args[])
	{
		
		tour6 t6=new tour6("WELCOME TO SOUTH INDIA");
		t6.sou();
		t6.setSize(1100,1000);
		t6.setResizable(false);
		t6.setVisible(true);
		t6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
	}*/
}