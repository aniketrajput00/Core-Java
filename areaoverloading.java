//import java.util.*;
public class areaoverloading {

    void area(float r)
    {
        float a=3.14f*r*r;
        System.out.println("Area of circle:"+a);
    }

    void area(int b,float h)
    {
        float a=0.5f*b*h;
        System.out.println("Area of trianle:"+a);
    }

    void area(double l,double b)
    {
      double a=l*b;
      System.out.println("Area of rectangle:"+a);
    }

    public static void main(String styr[])
    {
      areaoverloading ob=new areaoverloading();
      ob.area(5.2f);
      ob.area(4, 4.2f);
      ob.area(4.5, 5.5);
    }
}
