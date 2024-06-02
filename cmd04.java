public class cmd04 {
  
    public static void main(String str[])
    {
        int eno=Integer.parseInt(str[0]);
        String ename=str[1];
        Float sal=Float.parseFloat(str[2]);

        System.out.println("Employee no="+eno);
        System.out.println("Employee name="+ename);
        System.out.println("Employee salary="+sal);
    }
}
