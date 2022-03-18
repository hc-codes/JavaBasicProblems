import java.io.*;
class pattern5
{static int n,j;
    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A NUMBER FOR THE LIMIT");
        n=Integer.parseInt(buf.readLine());
        for(int i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            for(int k=j-2;k>=1;k--)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}