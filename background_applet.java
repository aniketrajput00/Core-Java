import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class background_applet extends Applet implements ItemListener
{
  Checkbox c1,c2,c3;
  CheckboxGroup cg;

  public void init()
 {
   cg= new CheckboxGroup();
   c1=new Checkbox("red",cg,true);
   c2=new Checkbox("green",cg,false);
   c3=new Checkbox("blue",cg,false);
   add(c1);
   add(c2);
   add(c3);
   c1.addItemListener(this);
   c2.addItemListener(this);
   c3.addItemListener(this);
 }
 public void itemStateChanged(ItemEvent ie)
 {
   if(c1.getState()==true)
   setBackground(Color.red);
   if(c2.getState()==true)
   setBackground(Color.green);
   if(c3.getState()==true)
   setBackground(Color.yellow);
 }
}
/*<applet code="background_applet"  width="500" height="500">
    </applet>
*/