import java.io.*;
class pattern3
{ static String n;
static int l,i,j;
    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A WORD");
        n=buf.readLine();
        l=n.length();

        for(i=0;i<l;i++)
        {
            for(j=0;j<=i;j++)
            {System.out.print(n.charAt(j));
            }
            System.out.println();
        }
    }
}