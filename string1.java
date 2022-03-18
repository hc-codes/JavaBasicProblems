import java.io.*;
import java.util.*;
class string1
{
    static int i,l,c,a;static char ch;
    static  String str="",st="";
    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A WORD");
        str=(buf.readLine());
        int n = Integer.parseInt(buf.readLine());
        st=str;
        for(i=0;i<n;i++)
        {
                if(a<str.length())
                {
                    ch=str.charAt(a);
                    System.out.println(ch);
                    st=st+ch;
                    a++;
                }
                else
                    a=0;
                System.out.println(st);
            
        }
        
        for(i=0;i<st.length();i++)
        {
            ch=st.charAt(i);
            if(ch=='a')
            {
                c++;
            }
        }
        System.out.println(c);
    }
}
