//rajisthan
package s12;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import s17.*;
public class tour4 extends JFrame
{
	public tour4(){}
	public tour4(String s)
	{
		super(s);
	}
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;	
	ImageIcon i1,i2,i3,i4;
	JButton b1,b2;
	public void raj()
	{
		l1=new JLabel("JAIPUR");
		l2=new JLabel("UDIAPUR");
		l3=new JLabel("JAISALMER");
		l4=new JLabel("JODHPUR");
		i1=new ImageIcon("pic5.jpg");
		i2=new ImageIcon("pic6.jpg");
		i3=new ImageIcon("pic7.jpg");
		i4=new ImageIcon("pic10.jpg");
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
	//	b2.setForeground(Color.white);
		b1.setBackground(Color.black);
		//b2.setBackground(Color.black);
        l5.setVisible(true);
		l6.setVisible(true);
		l7.setVisible(true);
		l8.setVisible(true);
		setLayout(null);
		l5.setBounds(1,1,450,400);
	    l1.setBounds(100,1,200,150);
		l6.setBounds(450,1,450,400);
		l2.setBounds(550,1,200,150);
		l7.setBounds(1,400,450,400);
		l3.setBounds(100,400,300,150);
		l8.setBounds(450,325,450,450);
		l4.setBounds(550,400,300,150);
		b1.setBounds(1000,200,100,70);
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
      h2 hi = new 	h2("INFORMATION");
		hi.his2();
		hi.setSize(1000,1500);
		//h.setResizable(false);
		hi.setVisible(true);
		hi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}
/*	public static void main(String args[])
	{
		
		tour4 t4=new tour4("WELCOME TO RAJISTHAN");
		t4.raj();
		t4.setSize(900,1000);
		t4.setResizable(false);
		t4.setVisible(true);
		t4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
	}*/
}