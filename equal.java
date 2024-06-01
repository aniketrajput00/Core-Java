import java.util.*;
public class equal {
     
    public static void main(String str[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter string01:");
         String s1=sc.next();
         System.out.println("Enter string02:");
         String s2=sc.next();

         if(s1.equals(s2))
         System.out.println("String are same");
         else
         System.out.println("String are not same");
    }
}
