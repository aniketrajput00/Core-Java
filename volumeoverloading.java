//import java.util.*;
public class volumeoverloading {

    void vol(float r)
    {
        float v=4/3*3.14f*r*r*r;
        System.out.println("volume of sphere:"+v);
    }

    void vol(int r,int h)
    {
        float v=3.14f*r*r*h*1/3;
        System.out.println("volume of cone:"+v);
    }

    void vol(double r,double h)
    {
      double v=3.14f*r*r*h;
      System.out.println("volume of cylinder:"+v);
    }

    public static void main(String styr[])
    {
      volumeoverloading ob=new volumeoverloading();
      ob.vol(5.2f);
      ob.vol(14, 5);
      ob.vol(4.5, 5.5);
    }
}
