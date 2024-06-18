import java.awt.*;
import java.awt.event.*;
class sum extends Frame implements ActionListener
{
   Label l1,l2,l3;
  TextField t1,t2,t3;
   Button b1;
 sum()
 {
     setVisible(true);
     setLayout(new FlowLayout());
      setSize(400,200);
    l1=new Label("Enter no1:");
    l2=new Label("Enter no2:");
    l3=new Label("Result:");
     t1=new TextField(10);
     t2=new TextField(10);
     t3=new TextField(10);
     b1=new Button("Sum");
    add(l1); add(t1); add(l2); add(t2); add(l3); add(t3); add(b1);
    b1.addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae)
{
  if(ae.getSource()==b1)
  {
      int a=Integer.parseInt(t1.getText());
      int b=Integer.parseInt(t2.getText());
      int c=a+b;
      t3.setText(""+c);
   }
}
 public static void main(String str[])
 {  
     sum ob=new sum();
 }
} 