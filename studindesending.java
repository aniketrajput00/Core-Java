import java.util.*;
public class studindesending {
     
    int rno;
    String sname;
    float per;

    void accept()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter student roll no:");
       rno=sc.nextInt();
       System.out.println("Enter student name:");
       sname=sc.next();
       System.out.println("Enter student percentage:");
       per=sc.nextFloat();
    }

    static void sort(studindesending ob[],int n)
    {
         int i,pass;
        for(pass=1;pass<=n;pass++)
        {
            for(i=0;i<n-pass;i++)
            {
                if(ob[i].per<ob[i+1].per)
                {
                    studindesending t=ob[i];
                    ob[i]=ob[i+1];
                    ob[i+1]=t;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.println(ob[i].rno+" "+ob[i].sname+" "+ob[i].per);
        }
    }

    public static void main(String str[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Limit:");
        int n=sc.nextInt();
        studindesending ob[]=new studindesending[n];
        for(int i=0;i<n;i++)
        {
            ob[i]=new studindesending();
            ob[i].accept();
        }
        sort(ob,n);
    }

}
