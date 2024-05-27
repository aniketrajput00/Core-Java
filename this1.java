public class this1 {
    int a=20;

    void show()
    {
        int a=10;
        System.out.println("value:"+this.a);
        System.out.println("value:"+a);
        this.a=40;
        System.out.println("value:"+this.a);
        System.out.println("value:"+a);
    }
    public static void main(String str[])
    {
      this1 ob=new this1();
      ob.show();
    }
}
