public class construct02 {
     int eno;
     String ename;
     float sal;
     
     construct02(int eno,String ename,float sal)
     {
        this.eno=eno;
        this.ename=ename;
        this.sal=sal;
     }

     void disp()
     {
        System.out.println("Employee no="+eno);
        System.out.println("Employee name="+ename);
        System.out.println("Employee salsry="+sal);
     }

     //@SuppressWarnings("unused")
    public static void main(String str[])
     {
        construct02 ob=new construct02(101, "om", 25000);
        ob.disp();
     }
}
