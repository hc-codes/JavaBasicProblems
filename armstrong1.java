import java.io.*;
class armstrong1
{static int r,s,n,n1;
    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A NUMBER");
        n=Integer.parseInt(buf.readLine());
        n1=n;
        while(n1>0)
        {
            r=n1%10;
            s+=r*r*r;
            n1=n1/10;
        }
        if(s==n)
         System.out.println(n+" IS A ARMSTRONG");
        else
        System.out.println(n+" IS NOT A ARMSTRONG");
    }
}
