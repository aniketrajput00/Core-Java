import java.util.*; 
public class cricket {
    int pid,totalruns,innplayed,notout;
    String pname;
    float batavg;
    static int i;

    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter player id:");
        pid=sc.nextInt();
        System.out.println("Enter player name:");
        pname=sc.next();
        System.out.println("Enter player totalruns:");
        totalruns=sc.nextInt();
        System.out.println("Enter player innplayed:");
        innplayed=sc.nextInt();
        System.out.println("Enter player notout:");
        notout=sc.nextInt();
        batavg=avg(totalruns,innplayed,notout);
    }

    static float avg(int totalruns,int innplayed,int notout)
    {
        return totalruns/(innplayed-notout);
    }
     
    void disp()
    {
        System.out.println("pid="+pid);
        System.out.println("pname="+pname);
        System.out.println("totalruns="+totalruns);
        System.out.println("innplayed="+innplayed);
        System.out.println("notout="+notout);
        System.out.println("batavg="+batavg);
    }
     static void sort(cricket ob[],int n)
     {
         float max=ob[0].batavg;
         int index=0;
         for(i=0;i<n;i++)
         {
            if(ob[i].batavg>max)
            {
                max=ob[i].batavg;
                index=1;
            }
         }
        ob[index].disp();
     }
     public static void main(String str[])
     {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit:");
        n=sc.nextInt();
        cricket ob[]=new cricket[n];
        for(i=0;i<n;i++)
        {
            ob[i]=new cricket();
            ob[i].accept();
        }
        sort(ob,n);
     }
}
