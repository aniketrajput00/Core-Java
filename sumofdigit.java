import java.util.*;
public class sumofdigit {
    public static void main(String str[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number:"); 
       int n=sc.nextInt();
       int s=0,d;
       for(int i=0;i<n;i++)
       {
         d=n%10;
         s=s+d;
         n=n/10;
       }
       System.out.println("Sum of digit:"+s);
    }
}
