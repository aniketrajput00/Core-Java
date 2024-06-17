import java.awt.*;
class screen extends Frame
{
  Label l1,l2,l3,l4,l5,l6;
  TextField t1,t2,t3,t4,t5;
  Button b1,b2,b3;

 screen()
{
 setVisible(true);
 setSize(400,200);
 setLayout(null);
 l1=new Label("Compund Intrest Calculator");
 l2=new Label("Principal Amount");
 l3=new Label("Intrest Rate(%)");
 l4=new Label("Time(yrs)");
 l5=new Label("Total Amount");
 l6=new Label("Intrest Amount");
 t1=new TextField(40);
 t2=new TextField(10);
 t3=new TextField(10);
 t4=new TextField(10);
 t5=new TextField(10);
 b1=new Button("Calculate");
 b2=new Button("Clear");
 b3=new Button("Close");
 l1.setBounds(130,50,300,50);
 add(l1);
 Font f=new Font("Gigi",Font.BOLD,18);
 l1.setFont(f);
 l2.setBounds(50,100,100,50);
 add(l2);
 l3.setBounds(50,150,100,50);
 add(l3);
 l4.setBounds(250,150,100,50);
 add(l4);
 l5.setBounds(50,200,100,50);
 add(l5);
 l6.setBounds(50,250,100,50);
 add(l6);
 b1.setBounds(50,300,100,40);
 add(b1);
 b2.setBounds(180,300,100,40);
 add(b2);
 b3.setBounds(300,300,100,40);
 add(b3);
t1.setBounds(150,110,200,25);
 add(t1);
t2.setBounds(150,160,100,25);
 add(t2);
t3.setBounds(200,160,200,25);
 add(t3);
t4.setBounds(150,210,150,25);
 add(t4);
t5.setBounds(150,260,180,25);
 add(t5);
}
public static void main(String str[])
{
 screen ob=new screen();
}
}