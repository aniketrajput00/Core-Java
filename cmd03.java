public class cmd03 {

    public static void main(String str[])
    {
       for(int i=0;i<str.length;i++)
       {
        int n=Integer.parseInt(str[i]);

        if(n%2==0)
        System.out.print(n+" ");
       }
    }
    
}
