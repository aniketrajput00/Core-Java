import  java.awt.*;
class regs extends Frame
{
 Label l1,l2,l3,l4,l5,l6;
 TextField t1,t2,t3,t4,t5;
 Button b1,b2;

 regs()
{
  setVisible(true);
  setSize(400,200);
  setLayout(null);
  l1=new Label("User Registration From");
 l2=new Label("First Name");
 l3=new Label("Last Name");
 l4=new Label("Email ID");
 l5=new Label("Paddword");
 l6=new Label("Confirm Password");
 t1=new TextField(10);
 t2=new TextField(10);
 t3=new TextField(10);
 t4=new TextField(10);
 t5=new TextField(10);
 l1.setBounds(10,50,400,30);
 add(l1); 
 l1.setBackground(Color.gray);
 l2.setBounds(10,100,100,50);
 add(l2);
 t1.setBounds(10,150,400,30);
 add(t1);
  l3.setBounds(10,200,100,50);
 add(l3);
 t2.setBounds(10,250,400,30);
 add(t2);
  l4.setBounds(10,300,100,50);
 add(l4);
 t3.setBounds(10,350,400,30);
 add(t3);
  l5.setBounds(10,400,100,50);
 add(l5);
 t4.setBounds(10,450,400,30);
 add(t4);
 l6.setBounds(10,500,100,50);
 add(l6);
 t5.setBounds(10,550,400,30);
 add(t5);
 b1=new Button("Singup");
 b2=new Button("Cancel");
 b1.setBounds(10,600,100,50);
 b2.setBounds(140,600,100,50);
 add(b1); add(b2);
}
public static void main(String str[])
{
  regs ob=new regs();
}
}
