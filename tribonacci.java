import java.io.*;
class tribonacci
{
    static int n,a,b,c,i,s;
    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A NUMBER FOR LIMIT OF THE SERIES TO BE PRODUCED");
        n=Integer.parseInt(buf.readLine());
        System.out.println("TRIBONACCI SERIES............");
        a=0;
        b=1;
        c=2;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        for(i=3;i<=n;i++)
        {
            s=a+b+c;
            System.out.println(s);
            a=b;
            b=c;
            c=s;
        }
    }
}