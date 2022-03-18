import java.io.*;
class a3
{
    static int s;
    static String n,n1;

    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("<<< ENTER  YOUR NAME >>>");
        n=(buf.readLine());
        System.out.println("<<< ENTER  YOUR NAME >>>");
        n1=(buf.readLine());
        s=n.compareTo(n1);
        if((s*s)>100)
        s=s*s-100;
        System.out.println(s);
    }
}
