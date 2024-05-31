public class construct03 {
    int eno;
    String ename;
    float sal;
    static int cnt=0;

    construct03()
    {
        cnt++;
       eno=103;
       ename="om";
       sal=12000;
    }
    
    construct03(int eno,String ename,float sal)
    {
         cnt++;
       this.eno=eno;
       this.ename=ename;
       this.sal=sal;
    }

    void disp()
    {
       System.out.println("Employee no="+eno);
       System.out.println("Employee name="+ename);
       System.out.println("Employee salsry="+sal);
       System.out.println("Count="+cnt);
    }

   public static void main(String str[])
    {

       construct03 ob=new construct03(101, "ram", 15000);
       ob.disp();
       construct03 ob1=new construct03(102, "sai", 20000);
       ob1.disp();
       construct03 ob2=new construct03(104, "sham", 5000);
       ob2.disp();
       construct03 obj=new construct03();
       obj.disp();
    }
}
