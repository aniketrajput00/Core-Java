import java.util.*;
public class table
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        System.out.println("multiplication table");
        for(int i=1; i<=10; i++)
        {
            System.out.println(i*n);
        }
    }
}
