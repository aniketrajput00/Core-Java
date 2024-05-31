import java.util.*;
public class teacheraob {
    int tid;
    String tname,desig,sub;
    float sal;

    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter teacher id:");
        tid=sc.nextInt();
        System.out.println("Enetr Teacher name:");
        tname=sc.next();
        System.out.println("Enetr designation:");
        desig=sc.next();
        System.out.println("Enter subject:");
        sub=sc.next();
        System.out.println("Enter salary:");
        sal=sc.nextFloat();
    }

    void disp()
    {
        System.out.println("teacher id:"+tid);
        System.out.println("Teacher name:"+tname);
        System.out.println("designation:"+desig);
        System.out.println("subject:"+sub);
        System.out.println("salary:"+sal);
    }
    
    public static void main(String str[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Limit:");
        int n=sc.nextInt();
        teacheraob ob[]=new teacheraob[n];
        for(int i=0;i<n;i++)
        {
            ob[i]=new teacheraob();
            ob[i].accept();
        }
        for(int i=0;i<n;i++)
        {
            if(ob[i].sub.equals("java"))
            {
                ob[i].disp();
            }
        }
    }
}
