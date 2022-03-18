import java.io.*;
class log
{
    static int n;
    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A NUMBER TO FIND IT'S LOGRITHM");
        n=Integer.parseInt(buf.readLine());
        System.out.println("LOGRITHM OF "+n+" IS "+(Math.log(n)));
    }
}