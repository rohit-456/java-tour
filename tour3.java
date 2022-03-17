//himachal pradesh
package s131;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import s16.*;
public class tour3 extends JFrame
{
	public tour3(){}
	public tour3(String s)
	{
		super(s);
	}
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;	
	ImageIcon i1,i2,i3,i4;
	JButton b1,b2;
	public void him()
	{
		l1=new JLabel("SHIMLA");
		l2=new JLabel("MANALI");
		l3=new JLabel("DHARMSHALA");
		l4=new JLabel("DALHOUSIE");
		i1=new ImageIcon("shimla2.jpg");
		i2=new ImageIcon("MANALI.jpg");
		i3=new ImageIcon("Dharamshala.jpg");
		i4=new ImageIcon("Dalhousie2.jpg");
		l5=new JLabel(i1);
		l6=new JLabel(i2);
		l7=new JLabel(i3);
		l8=new JLabel(i4);
		b1=new JButton("HISTORY");
		l1.setFont(new Font("Serif",Font.ITALIC,40));
		l2.setFont(new Font("Serif",Font.ITALIC,40));
		l3.setFont(new Font("Serif",Font.ITALIC,40));
		l4.setFont(new Font("Serif",Font.ITALIC,40));
		l1.setForeground(Color.black);
	    l2.setForeground(Color.black);
		l3.setForeground(Color.black);
        l4.setForeground(Color.black);
		b1.setForeground(Color.white);
		//b2.setForeground(Color.white);
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
      h1 h = new 	h1("INFORMATION");
		h.his();
		h.setSize(1000,1500);
		//h.setResizable(false);
		h.setVisible(true);
		h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}   
/*public static void main(String args[])
	{
		
		tour3 t3=new tour3("WELCOME TO HIMACHAL PRADESH");
		t3.him();
		t3.setSize(900,1000);
		t3.setResizable(false);
		t3.setVisible(true);
		t3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
	}*/
}