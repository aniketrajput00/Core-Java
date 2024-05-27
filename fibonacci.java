import java.util.*;
public class fibonacci {
    public static void main(String str[])
    {
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter number:"); 
         int n=sc.nextInt();
         int f=0,s=1,t;
         for(int i=2;i<n;i++)
         {
          t=f+s;
          System.out.println("fibonacci series of a given number:"+t);
          f=s;
          s=t;
         }
         
    }
}
