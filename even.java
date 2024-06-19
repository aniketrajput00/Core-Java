import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class even extends JFrame implements ActionListener
{
  JLabel l1;
  JTextField t1;
  JButton b1;
  even()
  {
    setVisible(true);
    setSize(400,200);
    setLayout(new FlowLayout());
    l1=new JLabel("Enter Number:");
    t1=new JTextField(10);
    b1=new JButton("ok");
    add(l1);add(t1);add(b1);
    b1.addActionListener(this);
  }
public void actionPerformed(ActionEvent ae)
{
 if(ae.getSource()==b1)
 {
   int n=Integer.parseInt(t1.getText());
   if(n%2==0)
   JOptionPane.showMessageDialog(this,"Number is Even");
  else
   JOptionPane.showMessageDialog(this,"Number is odd");  
 }
}
public static void main(String str[])
{
 even ob=new even();
}
}