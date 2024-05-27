//import java.util.*;
public class armstrongstatic {
   static int n=153,s=0,n1,d;

    static{
       // int d,s=0;
         n1=n;
        while(n>0)
        {
          d=n%10;
          n=n/10;
          s=s+d*d*d;
          
        }
   }
    public static void main(String str[])
   {
    if(n1==s)
     System.out.println("number is armstrong...");
    else
     System.out.println("number is  not armstrong...");
    }
} 

