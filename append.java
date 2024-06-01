 import java.util.*;
public class append {
    
     public static void main(String str[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string01:");
        String s1=sc.next();
        System.out.println("Enter string02:");
        String s2=sc.next();

        StringBuffer s=new StringBuffer(s1);
        s.append(s2);
        System.out.println("After append="+s);
    }
}
