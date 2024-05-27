//import java.util.*;
public class area {
    float area;

    void circle(float r)
    {
        area=3.14f*r*r;
        System.out.println("Area of circle:"+area);
    }

    void rectangle(float l,float b)
    {
        area=l*b;
        System.out.println("Area of rectangle:"+area);
    }
    void square(float s)
    {
        area=s*s;
        System.out.println("Area of square:"+area);
    }

    public static void main(String str[])
    {
        area ob;
        ob=new area();
        ob.circle(4.5f);
        ob.rectangle(5.4f, 3.2f);
        ob.square(4.0f);
    }
}
