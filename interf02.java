interface shape
{
    final float pi=3.14f;
    void area_cricle(int r);
    void area_sphere(int r);
}
public class interf02 implements shape{
    
    public void area_cricle(int r)
    {
        float a=pi*r*r;
        System.out.println("area of circle="+a);
    }

    public void area_sphere(int r)
    {
        float a=4*pi*r*r;
        System.out.println("area of sphere="+a);
    }

    public static void main(String str[])
    {
        interf02 ob=new interf02();
        ob.area_cricle(4);
        ob.area_sphere(8);
    }
}
