import java.util.*;
public class compareto {
    
    public static void main(String str[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string01:");
        String s1=sc.next();
        System.out.println("Enter string02:");
        String s2=sc.next();

        int k=s1.compareTo(s2);
        if(k==0)
        System.out.println("String are same");
        else if(k>0)
        System.out.println("String01 is greater");
        else if(k<0)
        System.out.println("string02 is greater");

    }
}
