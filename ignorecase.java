import java.util.*;
public class ignorecase {
    public static void main(String str[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string01:");
        String s1=sc.next();
        System.out.println("Enter string02:");
        String s2=sc.next();

        if(s1.equalsIgnoreCase(s2))
         System.out.println("string are same");
        else 
         System.out.println("string are not same");
    }
}
