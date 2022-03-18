import java.io.*;
class array3
{
    static int i,s,n;

    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("<<< ENTER  THE TOTAL NUMBER OF  ELEMENTS >>>");
        n=Integer.parseInt(buf.readLine());
        int a[]=new int[n];
        System.out.println("<<< ENTER  THE ELEMENTS OF THE ARRAY >>>");
        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(buf.readLine());
        }
        System.out.println(" THE ARRAY IS ");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+"  ");
        }
         System.out.println();
        System.out.println(" THE ARRAY IN REVERSED ORDER IS ");
        for(i=n-1;i>=0;i--)
        {
            s=s+a[i];
            System.out.print(a[i]+"  ");
        }
        System.out.println(" THE SUM OF THE ARRAY IS ....."+s);
    }
}
