import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class prime extends JFrame implements ActionListener
{
  JLabel l1;
  JTextField t1;
  JButton b1;
  prime()
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
   int i;
   int n=Integer.parseInt(t1.getText());
  for(i=2;i<=n;i++)
  {
    if(n%i==0)
    {
       break;
    }
  }
   if( i==n)
    JOptionPane.showMessageDialog(this,"Number is Prime");
   else
    JOptionPane.showMessageDialog(this,"Number is not Prime");  
 }
}
public static void main(String str[])
{
 prime ob=new prime();
}
}