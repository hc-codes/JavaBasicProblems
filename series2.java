import java.io.*;
class series2
{
    static int n,i,j,x;
    static double s,f=1.0;
    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A NUMBER FOR LIMIT");
        n=Integer.parseInt(buf.readLine());
        System.out.println("ENTER A NUMBER ");
        x=Integer.parseInt(buf.readLine());
        for(i=1;i<=n;i++)
        {
            f=f*i;
            if(i%2==0)
                s=s-(Math.pow(x,i))/f;
            else
                s=s+(Math.pow(x,i))/f;
        }
        System.out.println(" SUM OF SERIES IS ----  "+s);
    }
}
