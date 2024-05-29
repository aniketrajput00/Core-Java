import java.util.*;
public class book {
    float price;
    String bname;
    int qyt;

    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr book price:");
        price=sc.nextFloat();
        System.out.println("Enter book name:");
        bname=sc.next();
        System.out.println("Enter book qty:");
        qyt=sc.nextInt();
    }

    public static void main(String str[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit:");
        int n=sc.nextInt();
        book ob[]=new book[n];
        for(int i=0;i<n;i++)
        {
            ob[i]=new book();
            ob[i].accept();
        }
        System.out.println("Enter book name to search qyt:");
        String name=sc.next();
        int flag=0;
        for(int i=0;i<n;i++)
        {
         if(ob[i].bname.equals(name))
         {
             System.out.println("quantity="+ob[i].qyt);
             flag=1;
             break;
         }
        }
        if(flag==0)
        {
            System.out.println("Book not found..");
        }
    }
}
