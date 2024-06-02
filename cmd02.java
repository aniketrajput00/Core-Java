public class cmd02 {
     public static void main(String str[])
     {
        int a=Integer.parseInt(str[0]);
        int b=Integer.parseInt(str[1]);
        int c=a+b;
        int d=a-b;
        int e=a/b;
        int f=a*b;

        System.out.println("Addition="+c);
        System.out.println("Substraction="+d);
        System.out.println("Division="+e);
        System.out.println("Multiplication="+f);
    }
}
