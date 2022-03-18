import java.io.*;
class series3
{
    static int n,i,x;
    static double s;
    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A NUMBER FOR LIMIT");
        n=Integer.parseInt(buf.readLine());
        System.out.println("ENTER A NUMBER ");
        x=Integer.parseInt(buf.readLine());
        for(i=1;i<=n;i++)
        {
            s=s+(Math.pow(x,i));
        }
        System.out.println(" SUM OF SERIES IS ----  "+s);
    }
}
