import java.util.*;
interface Integer
{
    void check(int n);
}
public class interface01 implements Integer {
    
    public void check(int n)
    {
        if(n>0)
        System.out.println("Number is positive..");
        else
        System.out.println("Number is negative..");
    }

    public static void main(String str[])
    {
        interface01 ob=new interface01();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        ob.check(n);

    }
}
