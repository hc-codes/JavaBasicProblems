import java.io.*;
class nprime
{
    static int c,i,n=0,j;
    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER LIMIT NUMBER");
        n=Integer.parseInt(buf.readLine());
        System.out.println("PRIME NUMBERS ARE ......");
        for(i=2;i<=n+1;i++)
        {
            for(j=2;j<=i/2;j++)
            {
                if(i%j==0)
                    c++;
            }
            if(c==0)
                System.out.println(i);
            else
            {
                n++;
                c=0;
            }
        }
    }
}