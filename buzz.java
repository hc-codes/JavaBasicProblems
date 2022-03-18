import java.io.*;
class buzz
{
    static int n;
    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A NUMBER TO FIND IT IS A BUZZ NUMBER OR NOT");
        n=Integer.parseInt(buf.readLine());
        if(n%10==7||n%7==0)
        System.out.println(n+" IS A BUZZ NUMBER");
        else
        System.out.println(n+" IS NOT A BUZZ NUMBER");
    }
}