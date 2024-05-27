public class demo {
     static int a;
     void show()
     {
        System.out .println("I am show...");
     }

     static{
        System.out .println("I am static...");
     }

     public static void main(String str[])
     {
        System.out .println("I am main...");
        demo ob=new demo();
        ob.show();
     }
}
