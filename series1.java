import java.io.*;
class series1
{
    static int n,i,j;
    static double s,f=1.0F;
    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A NUMBER FOR LIMIT");
        n=Integer.parseInt(buf.readLine());
        for(i=0;i<n;i++)
        {
            for(j=1;j<=i;j++)
            {
                f=f*j;
            }
            s=s+1.0/f;
            
        }
         System.out.println(" SUM OF SERIES IS ----  "+s);
    }
}