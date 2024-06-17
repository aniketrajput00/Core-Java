import java.awt.*;
class prog1 extends Frame
{
  Label l1;
  
  prog1()
 {
   setVisible(true);
   setSize(400,200);
   setLayout(new FlowLayout());
   l1=new Label("Hello World");
   Font f=new Font("Times New Roman",Font.BOLD,20);
   l1.setFont(f);
   l1.setBackground(Color.red);
   l1.setForeground(Color.blue);
  add(l1);
 }
public static void main(String str[])
{
 prog1 ob=new prog1();
}
}