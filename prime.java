import java.io.*;
class prime
{
    static int c,i,n=0,j;
    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A NUMBER");
        n=Integer.parseInt(buf.readLine());
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                c++;
        }
        if(c==2)
            System.out.println(n+" IS A PRIME NUMBER");
        else
            System.out.println(n+" IS NOT A PRIME NUMBER");
    }
}