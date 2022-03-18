import java.io.*;
class concat
{static int m,i,d,n,j=0,ch;

    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("<<< ENTER THE NUMBER OF ELEMENTS OF 1st ARRAY>>>");
        n=Integer.parseInt(buf.readLine());
        int a[]=new int[n];
        System.out.println("<<< ENTER THE NUMBER OF ELEMENTS OF 2nd ARRAY>>>");
        m=Integer.parseInt(buf.readLine());
        int b[]=new int[m];
        int c[]=new int[n+m];
        System.out.println("<<< ENTER THE ELEMENTS OF 1st ARRAY>>>");
        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(buf.readLine());
        }
        System.out.println("<<< ENTER THE ELEMENTS OF 2nd ARRAY>>>");
        for(i=0;i<m;i++)
        {
            b[i]=Integer.parseInt(buf.readLine());
        }
        for(j=0;j<m+n;j++)
        {
            if(j<n)
            {
                c[j]=a[j];
            }
            else
            {
                c[j]=b[d];
                d++;
            }
        }
        System.out.println("<<< CONCATANATED ARRAY IS ... >>>");
        for(i=0;i<m+n;i++)
        {
            System.out.println(c[i]);
        }
    }
}