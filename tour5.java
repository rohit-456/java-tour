//gujrat
package s11;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import s18.*;
public class tour5 extends JFrame
{
	public tour5(){}
	public tour5(String s)
	{
		super(s);
	}
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;	
	ImageIcon i1,i2,i3,i4;
	JButton b1,b2;
	public void guj()
	{
		l1=new JLabel("SOMNATH TEMPLE");
		l2=new JLabel("GIR NATIONAL PARK");
		l3=new JLabel("AHMEDABAD");
		l4=new JLabel("BHUJ");
		i1=new ImageIcon("Somnath-Temple.jpg");
		i2=new ImageIcon("Gir-National-Park.jpg");
		i3=new ImageIcon("Ahmedabad.jpg");
		i4=new ImageIcon("Bhuj.jpg");
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
		l5.setBounds(1,1,500,400);
	    l1.setBounds(100,1,400,150);
		l6.setBounds(500,1,600,400);
		l2.setBounds(550,1,400,150);
		l7.setBounds(1,400,500,400);
		l3.setBounds(100,400,300,150);
		l8.setBounds(500,325,600,450);
		l4.setBounds(600,400,300,150);
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
      h3 hj = new 	h3("INFORMATION");
		hj.his3();
		hj.setSize(1000,1500);
		//h.setResizable(false);
		hj.setVisible(true);
		hj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}
   public static void main(String args[])
	{
		
		tour5 t5=new tour5("WELCOME TO GUJRAT");
		t5.guj();
		t5.setSize(1100,1000);
		t5.setResizable(false);
		t5.setVisible(true);
		t5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
	}
}