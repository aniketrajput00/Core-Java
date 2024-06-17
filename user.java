import java.awt.*;
import java.awt.event.*;
class userException extends Exception
{
  public String toString()
 {
    return"Invalid user or pass...";
 }
}
class user  extends Frame implements ActionListener
{
   static int cnt=0;
  Label l1,l2,l3;
  TextField t1,t2,t3;
  Button b1,b2;

 user()
{
  setVisible(true);
  setSize(400,200);
  setLayout(new FlowLayout());

 l1=new Label("User Name");
 l2=new Label("Password");
 l3=new Label("Result");
 t1=new TextField(10);
 t2=new TextField(10);
 t3=new TextField(10);
 b1=new Button("Login");
 b2=new Button("Clear");
 b1.addActionListener(this);
 b2.addActionListener(this);
 add(l1); add(t1);
 add(l2); add(t2);
 add(l3); add(t3);
 add(b1); add(b2);
}
 public void actionPerformed(ActionEvent ae)
{
 if(ae.getSource()==b1)
{
  try
 {
   String s1=t1.getText();
   String s2=t2.getText();
   if(s1.equals(s2))
   {
     t3.setText("Login succ...");
   }
  else
  {
    cnt++;
    if(cnt==4)
    b1.setVisible(false);
    throw new userException();
  }
 }catch(Exception e)
{
 t3.setText("Error:"+e);
}
}
if(ae.getSource()==b2)
{


}
}
public static void main(String str[])
{
  user ob=new user();
}
} 