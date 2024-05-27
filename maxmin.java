import java.util.*;
public class maxmin{
    public static void main(String str[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no1:");
        int n1=sc.nextInt();
        System.out.println("Enter no2:");
        int n2=sc.nextInt();
        System.out.println("Enter no3:");
        int n3=sc.nextInt();

        if(n1>n2 && n1>n3)
        {
            System.out.println("number is maximum:"+n1);
        }
        else if(n2>n1 && n2>n3)
        {
            System.out.println("number is maximum:"+n2);
        }
        else
        {
            System.out.println("number is maximum:"+n3);
        }

        if(n1<n2 && n1<n3)
        {
            System.out.println("number is minimum:"+n1);
        }
        else if(n2<n1 && n2<n3)
        {
            System.out.println("number is minimum:"+n2);
        }
        else
        {
            System.out.println("number is minimum:"+n3);
        }

    }
}
