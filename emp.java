import javax.swing.*;
import java.awt.*;
class emp extends JFrame
{
  JTable tb;
   emp()
    {
       setVisible(true);
       setSize(500,500);
       setLayout(new FlowLayout());

      String head[]={"Roll No","Name","Per"};
       String data[][]={{"101","om","45.5"},
                                       {"102","sai","75.5"},
                                       {"103","ram","65.5"},
                                       };
       tb=new JTable(data,head);
      add(tb);
    JScrollPane jsp=new JScrollPane(tb);
    add(jsp);
    }
 public static void main(String str[])
 {
    emp ob=new emp();
 }
}