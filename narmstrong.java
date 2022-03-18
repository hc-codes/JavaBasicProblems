import java.io.*;
class narmstrong
{static long n,a,r,s,a1,i;
    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A THE LIMIT");
        n=Integer.parseInt(buf.readLine());
        a=100;
        for(i=1;i<=n;)
        {
            a1=a;
            while(a1>0)
            {
                r=a1%10;
                s+=r*r*r;
                a1=a1/10;
            }
            if(s==a)
            {
                System.out.println(a);
                i++;
            }
            a++;
            s=0;
        }
    }
}