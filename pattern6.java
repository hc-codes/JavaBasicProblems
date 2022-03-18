import java.io.*;
class pattern6
{
    public static void main()throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A NUMBER FOR THE LIMIT");
        int n=Integer.parseInt(buf.readLine());
        int c=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(c);
                c++;
            }
            System.out.println("\t");
        }
    }
}