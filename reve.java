import java.io.*;
class reve
{
    static int a=0,i,r,k;
    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A NUMBER");
        int n=Integer.parseInt(buf.readLine());
        int n1=n;
        while(n1>0)
        {
            n1=n1/2;
            k++;
        }
        int s[]=new int[k];
        n1=n;
        while(n1>0)
        {
            r=n1%2;
            s[a]=r;
            n1=n1/2;
            a++;
        }
        for(i=a-1;i>=0;i--)
        {
            System.out.print(s[i]);
        }
        System.out.println();
        a=0;
        n1=n;
        while(n1>0)
        {
            int r=n1%8;
            s[a]=r;
            n1=n1/8;
            a++;
        }
        for(i=a-1;i>=0;i--)
        {
            System.out.print(s[i]);
        }
    }
}