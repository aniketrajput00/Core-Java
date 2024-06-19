import java.awt.*;
import java.awt.event.*;

class focus extends Frame implements FocusListener
{
 TextField t1,t2,t3;
 Button b1,b2;
  focus()
 {
   setVisible(true);
   setSize(400,200);
   setLayout(new GridLayout(5,1));
   t1=new TextField(10);
   t2=new TextField(10);
   t3=new TextField(10);
   b1=new Button("ok");
   b2=new Button("Exit");
   add(t1);add(t2);add(t3);
   add(b1);add(b2);
   t1.addFocusListener(this);
   t2.addFocusListener(this);
   t3.addFocusListener(this);
   b1.addFocusListener(this);
   b2.addFocusListener(this);
 }
 public void focusGained(FocusEvent fe)
 {
  if(fe.getSource()==t1)
   t1.setBackground(Color.orange);
  if(fe.getSource()==t2)
   t2.setBackground(Color.orange);
  if(fe.getSource()==t3)
   t3.setBackground(Color.orange);
  if(fe.getSource()==b1)
   b1.setBackground(Color.red);
  if(fe.getSource()==b2)
   b2.setBackground(Color.red);
 }
 public void focusLost(FocusEvent fe)
 {
  if(fe.getSource()==t1)
   t1.setBackground(Color.white);
  if(fe.getSource()==t2)
   t2.setBackground(Color.white);
  if(fe.getSource()==t3)
   t3.setBackground(Color.white);
  if(fe.getSource()==b1)
   b1.setBackground(Color.white);
  if(fe.getSource()==b2)
   b2.setBackground(Color.white);
 }
public static void main(String str[])
{
 focus ob=new focus();
}
}