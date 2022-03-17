package u1;
import s14.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class tour extends JFrame
{
	public tour(){}
	public tour(String s){
		super(s);
	}
	JLabel l1,l2;
	JButton b1,b2;
	ImageIcon i;
	public void pic()
	{
		i=new ImageIcon("india2.jpg");
		l1=new JLabel(i);
		l2=new JLabel("WELCOME TO INDIA");
		b1=new JButton("NEXT");
		b2=new JButton("STOP");
		l2.setForeground(Color.red);
		l2.setFont(new Font("Vendana",Font.PLAIN,30));
		b1.setForeground(Color.white);
		b2.setForeground(Color.white);
		b1.setBackground(Color.black);
		b2.setBackground(Color.black);
		b1.setFont(new Font("Vendana",Font.PLAIN,20));
		b2.setFont(new Font("Vendana",Font.PLAIN,20));
		setLayout(null);
		l1.setBounds(1,1,1000,700);
		l2.setBounds(1005,100,300,70);
		b1.setBounds(1050,600,100,70);
		b2.setBounds(1200,600,100,70);
		 l1.setVisible(true);
		 add(l1);
		 add(l2);
		 add(b1);
		 add(b2);
		 b1.addActionListener(new handle());
		 b2.addActionListener(new handle());
		 
	}
class handle implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		 Object o=e.getSource();
		if(o==b1)
		{
			tour2 t2 = new 	tour2("SECOND PAGE");
		   t2.choose();
		   t2.setSize(800,900);
		   t2.setResizable(false);
		  t2.setVisible(true);
		   t2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		else
			System.exit(0);
	}
}

	public static void main(String args[])
	{
		tour t=new 	tour("HOME PAGE");
		t.pic();
		t.setSize(1300,1300);
		t.setVisible(true);
		t.setResizable(true);
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}