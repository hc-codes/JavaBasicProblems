import java.io.*;
import java.util.*;
class s
{
    static int i,lb,ls;static char ch;
    static  String str="",sm="",big="";
    public static void main(String args[])throws IOException
    {
        String n[]=new String[5];
        String a[]=new String[5];
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER 10 WORDS");
        for(i=0;i<5;i++)
        {
            n[i]=buf.readLine();
            a[i]="";
            a[i]=n[i];
        }
        ls=n[0].length();
        sm=n[0];
        for(i=0;i<4;i++)
        {     

            if(ls<n[i+1].length())
            {
                ls=n[i+1].length();
                sm=n[i+1];
            }
        }
        lb=a[0].length();
        big=a[0];
        for(i=0;i<4;i++)
        { 

            
            if(lb>a[i+1].length())
            {
                
                lb=a[i+1].length();
                big=a[i+1];
            }
        }
        System.out.println("SMALLEST WORD IS "+big+" WITH "+lb+" WORDS");
        System.out.println("BIGGEST WORD IS "+sm+" WITH "+ls+" WORDS");
    }
}
