import java.io.*;
import java.util.*;
class st
{
    static int i,l;static char ch;
    static  String str="",st="";
    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A WORD");
        str=(buf.readLine());
        str=str+(" ");
        for(i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch!=' ')
            {
                st=st+ch;
                l=st.length();
            }
            else
            {

                System.out.println(st+" WITH LENGTH "+l);
                st="";
            }
        }
    }
}
