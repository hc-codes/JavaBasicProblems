import java.io.*;
import java.util.*;
class palin
{
    static int i;static char k;
    static  String st,s;
    static  String str;
    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A WORD");
        str=(buf.readLine());
        s=str;
        for(i=str.length()-1;i>=0;i--)
        {
            k=str.charAt(i);
            st+=k;
        }

        if(str.equals(st))
            System.out.println(str+"is palindrome");
        else
            System.out.println(str+"is not palindrome");
    }
}