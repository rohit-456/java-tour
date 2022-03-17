//thankyou
package s15;
import javax.swing.*;
import java.awt.*;
public class thank extends JFrame
{
	public thank(){}
	public thank(String s)
	{
		super(s);
	}
	JLabel l1;
	ImageIcon i1;
	public void thanks()
	{
		i1=new ImageIcon("thk2.jpg");
		l1=new JLabel(i1);
		l1.setVisible(true);
		setLayout(null);
		l1.setBounds(0,0,800,600);
		add(l1);
	}
	/*public static void main(String args[])
	{
		thank s1=new thank("OK THEN");
		s1.thanks();
		s1.setSize(800,600);
		s1.setResizable(false);
		s1.setVisible(true);
		s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}*/
}
