public class pattern2 {
    public static void main(String str[])
    {
        int i,j,k=1;
        for(i=1;i<5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(k++%2);
            }
           System.out.println();
        }
    }
}
