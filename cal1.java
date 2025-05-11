import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class cal implements ActionListener
{
      JLabel l1,l2,l3;
     JTextField t1,t2,t3;
     JButton b1,b2,b3,b4,b5;
     cal()
     {
         JFrame f=new JFrame();
        l1=new JLabel("First no:");
       l1.setBounds(30,50,100,30);
       f.add(l1);
       t1=new JTextField();
       t1.setBounds(150,50,150,30);
      f.add(t1);
      l2=new JLabel("second no:");
      l2.setBounds(30,100,100,30);
     f.add(l2);
     t2=new JTextField();
     t2.setBounds(150,100,150,30);
     f.add(t2);
     l3=new JLabel("Result");
    l3.setBounds(30,150,100,30);
    f.add(l3);
    t3=new JTextField();
    t3.setBounds(150,150,150,30);
   f.add(t3);
   b1=new JButton("ADD");
   b1.setBounds(30,200,70,40);
   f.add(b1);
    b2=new JButton("SUB");
   b2.setBounds(120,200,70,40);
   f.add(b2);
   b3=new JButton("MUL");
   b3.setBounds(210,200,70,40);
   f.add(b3);
    b4=new JButton("DIV");
   b4.setBounds(60,260,70,40);
   f.add(b4);
    b5=new JButton("CLEAR");
   b5.setBounds(150,260,90,40);
   f.add(b5);
   b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
 b4.addActionListener(this);
 b5.addActionListener(this);
       f.setSize(600,600);
      f.setLayout(null);
     f.setVisible(true);
    }
   public void actionPerformed(ActionEvent ae)
    {
        double a=Double.parseDouble(t1.getText());
        double b=Double.parseDouble(t2.getText());
       double c=0;
       if(ae.getSource()==b1)
      {
        c=a+b;
        t3.setText(String.valueOf(c));
     }
    if(ae.getSource()==b2)
      {
        c=a-b;
        t3.setText(String.valueOf(c));
     }
    if(ae.getSource()==b3)
      {
        c=a*b;
        t3.setText(String.valueOf(c));
     }
    if(ae.getSource()==b4)
      {
        c=a/b;
        t3.setText(String.valueOf(c));
     }
    if(ae.getSource()==b5)
      {
       t1.setText("");
       t2.setText("");
        t3.setText("");
     }
    }

}
public class cal1
{
    public static void main(String ars[])
   {
     new cal();
   }
}