import java.awt.*;
import java.awt.event.*;
class prog2 extends Frame implements ActionListener
{
 Label l1;
 Button b1;
 
 prog2()
 {
   setVisible(true);
   setSize(400,200);
   setLayout(new FlowLayout());
   l1=new Label("Tabel");
   b1=new Button("Red");
   add(l1); add(b1);
  b1.addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae)
{
  if(ae.getSource()==b1)
{
   l1.setBackground(Color.red);
}
}
public static void main(String str[])
{
 prog2 ob=new prog2();
}
}
