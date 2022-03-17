package s18;
import s15.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
public class h3 extends JFrame
{
	public h3(){}
	public h3(String s)
	{
		super(s);
	}
	JLabel l1,l2,l21,l22,l23,l24,l3,l40,l41,l42,l43,l5,l6,l61,l62,l63,l7,l8,l81,l82,l9;
	ImageIcon i;
	JButton b1,b2;
	public void his3()
	{
		l1=new JLabel("SOMNATH TEMPLE");
		l2=new JLabel("The Somnath temple located in Prabhas Patan near Veraval in Saurashtra on the western coast of Gujarat."); 
		l21=new JLabel("India is believed to be the first among the twelve jyotirlinga shrines of Shiva."); 
		l22=new JLabel(" It is an important pilgrimage and tourist spot of Gujarat.");
       // l23=new JLabel("It’s also known for the handicraft shops that line The Mall, a pedestrian avenue, as well as the Lakkar Bazaar.");
        l24=new JLabel("The present temple was reconstructed in the Chaulukya style of Hindu temple architecture and completed in May 1951.");
		l3=new JLabel("GIR NATIONAL PARK");
		l40=new JLabel("Gir Forest National Park is a wildlife sanctuary in Gujarat, western India.");
        l41=new JLabel("It was established to protect Asiatic lions, who frequent the fenced-off Devalia Safari Park."); 
		l42=new JLabel(" Gir Jungle Trail, outside the fenced area, traverses deciduous forest and is home to wildlife including vultures and pythons");
        l43=new JLabel("The Kamleshwar Dam has marsh crocodiles and birds, such as Indian skimmers and pelicans.");
        //l44=new JLabel("A market specializing in wooden toys and crafts.");
		l5=new JLabel("AHMEDABAD");
		l6=new JLabel("Ahmedabad, in western India, is the largest city in the state of Gujarat.");   
		l61=new JLabel(" The Sabarmati River runs through its center. On the western bank is the Gandhi Ashram at Sabarmati."); 
		l62=new JLabel("Across the river, the Calico Museum of Textiles");
        l63=new JLabel("Once a cloth merchant's mansion, has a significant collection of antique and modern");
		l7=new JLabel("BHUJ");
		l8=new JLabel("Bhuj was founded by Rao Hamir in 1510 and was made the capital of Kutch by Rao Khengarji.");  ;
		l81=new JLabel("Bhuj has been attacked six times. In two instances, the defense was successful and in four other instances, the defense failed.."); 
		l82=new JLabel("Bhuj has an average elevation of 110 metres (360 feet). On the eastern side of the city is a hill known as Bhujia Hill.");
        //i=new ImageIcon("bac.jpg");
		//l9=new JLabel(i);
		b1=new JButton("NEXT");
		b2=new JButton("CANCEL");
		l1.setFont(new Font("Serif",Font.ITALIC,40));
		l3.setFont(new Font("Serif",Font.ITALIC,40));
		l5.setFont(new Font("Serif",Font.ITALIC,40));
		l7.setFont(new Font("Serif",Font.ITALIC,40));
		l1.setForeground(Color.black);
        l3.setForeground(Color.black);
		l5.setForeground(Color.black);
		l7.setForeground(Color.black);
		l2.setFont(new Font("Serif",Font.ITALIC,23));
         l21.setFont(new Font("Serif",Font.ITALIC,23));
         l22.setFont(new Font("Serif",Font.ITALIC,23));
        l24.setFont(new Font("Serif",Font.ITALIC,23));
        l40.setFont(new Font("Serif",Font.ITALIC,23));
         l41.setFont(new Font("Serif",Font.ITALIC,23));
         l42.setFont(new Font("Serif",Font.ITALIC,23));
		 l43.setFont(new Font("Serif",Font.ITALIC,23));
		 l6.setFont(new Font("Serif",Font.ITALIC,23));
         l61.setFont(new Font("Serif",Font.ITALIC,23));
         l62.setFont(new Font("Serif",Font.ITALIC,23));
		 l63.setFont(new Font("Serif",Font.ITALIC,23));
		 l8.setFont(new Font("Serif",Font.ITALIC,23));
         l81.setFont(new Font("Serif",Font.ITALIC,23));
         l82.setFont(new Font("Serif",Font.ITALIC,23));
        //l9.setVisible(true);
		l2.setForeground(Color.red);
	 l21.setForeground(Color.red);
	l22.setForeground(Color.red);
	l24.setForeground(Color.red);
	l40.setForeground(Color.red);
	l41.setForeground(Color.red);
	l42.setForeground(Color.red);
	l43.setForeground(Color.red);
   	l6.setForeground(Color.red);
	l61.setForeground(Color.red);
	l62.setForeground(Color.red);
		l63.setForeground(Color.red);
	   l8.setForeground(Color.red);
	   l81.setForeground(Color.red);
      	l82.setForeground(Color.red);

	b1.setForeground(Color.white);
		b2.setForeground(Color.white);
		b1.setBackground(Color.black);
		b2.setBackground(Color.black);
    	setLayout(null);
		l1.setBounds(20,20,500,100);
		l2.setBounds(40,60,1100,100);
		l21.setBounds(40,80,1000,100);
		l22.setBounds(40,100,1000,100);
		l24.setBounds(40,120,1000,100);
		l3.setBounds(20,200,300,100);
		l40.setBounds(40,240,1000,100);
		l41.setBounds(40,260,1000,100);
		l42.setBounds(40,280,1000,100);
		l43.setBounds(40,300,1000,100);
		l5.setBounds(20, 350,300,100);
		l6.setBounds(40,390,1200,100);
		l61.setBounds(40,410,1000,100);
		l62.setBounds(40,430,1000,100);
		l63.setBounds(40,450,1000,100);
		l7.setBounds( 20,530,300,100);
		l8.setBounds(40,570,1400,100);
		l81.setBounds(40,590,1400,100);
		l82.setBounds(40,610,1400,100);
//		l83.setBounds(670,420,600,100);
		//l9.setBounds(1,1,1000,1500);
		b1.setBounds(1150,100,100,70);
		b2.setBounds(1250,100,100,70);
		add(l1);
		add(l2);
		add(l21);
		add(l22);
		//add(l23);
		add(l24);
		add(l3);
		add(l40);
		add(l41);
		add(l42);
		add(l43);
		add(l5);
		add(l6);
		add(l61);
		add(l62);
		add(l63);
		add(l7);
		add(l8);
		add(l81);
		add(l82);
	//	add(l83);
		//add(l9);
		add(b1);
       add(b2);
      b1.addActionListener(new handle());
     b2.addActionListener(new handle());	  
	  }
class handle implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{
		Object a=ae.getSource();
		if(a==b1)
		{
			thank s1=new thank("OK THEN");
		s1.thanks();
		s1.setSize(800,600);
		s1.setResizable(false);
		s1.setVisible(true);
		s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		else
		{
			System.exit(0);
		}
	}
}
	/*public static void main(String args[])
	{
		h3 hj = new 	hj("INFORMATION");
		hj.his3();
		hj.setSize(1000,1500);
		//h.setResizable(false);
		hj.setVisible(true);
		hj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}*/
}