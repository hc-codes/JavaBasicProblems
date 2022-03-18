

 import java.io.*;
public class big
{
    static int a,b,c,big,small,mid; 
    public static void main(String args[]) throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THREE NUMBER");
        a=Integer.parseInt(buf.readLine());
        b=Integer.parseInt(buf.readLine());
        c=Integer.parseInt(buf.readLine());
        big=(a>b)?(a>c)?a:c:(b>c)?b:c;
        small=(a<b)?(a<c)?a:c:(b<c)?b:c;
        if(a!=big&&a!=small)
        mid=a;
        else
        if(b!=big&&b!=small)
        mid=b;
        if(c!=big&&c!=small)
        mid=c;
        System.out.println("SMALLEST NUMBER ="+small);
        System.out.println("NEXT HIGHER NUMBER = "+mid);
        System.out.println("HIGHEST NUMBER = "+big);
    }
}