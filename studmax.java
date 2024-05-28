import java.util.*;
public class studmax {
     
    int rno;
    String sname;
    float per;
    static int i;

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

     static void sort(studmax ob[],int n)
    {
        float max=ob[i].per;
            for(i=0;i<n;i++)
            {
                if(ob[i].per>max)
                {
                    System.out.println(ob[i].rno+" "+ob[i].sname+" "+ob[i].per);
                }
            }
    }



    public static void main(String str[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Limit:");
        int n=sc.nextInt();
        studmax ob[]=new studmax[n];
        for(int i=0;i<n;i++)
        {
            ob[i]=new studmax();
            ob[i].accept();
           
        }
        ob[i].sort(ob,n);
    }

 }

