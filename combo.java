import java.awt.*;
import java.awt.event.*;

class combo extends Frame implements ItemListener
{
  Choice c1;
 TextField t1;
 combo()
 {
    setVisible(true);
    setLayout(new FlowLayout());
    setSize(400,200);
     t1=new TextField(10);
     c1=new Choice(); 
     c1.add("C");
     c1.add("C++");
     c1.add("Java");
      add(c1);
      add(t1);
    c1.addItemListener(this);
    
 }
 public void itemStateChanged(ItemEvent ie)
 {
    if(ie.getSource()==c1)
   {
      String s1=c1.getSelectedItem();
       t1.setText(s1);
    }
}
 public static void main(String str[])
 { 
   combo ob=new combo();
 }

}