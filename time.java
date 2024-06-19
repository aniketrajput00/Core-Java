import java.awt.*;
import java.awt.event.*;
import java.util.*;
class time extends Frame implements ActionListener
{
   Label l1,l2,l3;
   TextField t1;
   Button b1;
   time()
   {
      setVisible(true);
      setSize(400,200);
      setLayout(new GridLayout(5,1));
      l1=new Label("Enter user:");
     l2=new Label("Greet msg:");
     l3=new Label("Date & Time:");
     t1=new TextField(10);
     b1=new Button("submit");
     add(l1);add(t1);
     add(l2);add(l3);add(b1);
   b1.addActionListener(this);
   }
  public void actionPerformed(ActionEvent ae)
{
   if(ae.getSource()==b1)
   {
     String s1=t1.getText();
     Date d=new Date();
     int h=d.getHours();
     if(h>12 && h<=17)
     l2.setText("Good Afternoon "+ s1);
     else if(h>17 && h<=20)
     l2.setText("Good Evening"+s1);
     else if(h>20 && h<=24)
     l2.setText("Good Night"+s1);
     else
     l2.setText("Good Morning"+ s1);
     l3.setText("Date & Time:"+d);
   }
}
public static void main(String str[])
{ 
   time ob=new time();
}
}