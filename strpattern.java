import java.io.*;
import java.util.*;
class strpattern
{
    static int i,j;static char ch;
    static  String str;
    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A WORD");
        str=(buf.readLine());
        for(i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            for(j=0;j<=i;j++)
            System.out.print(ch+"\t");
            System.out.println();
        }
    }
}