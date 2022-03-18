import java.io.*;
class ddsort
{
    static int i,j,c=0,m,n;

    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER DIMENSIONS OF 1st ARRAY [][]");
        m=Integer.parseInt(buf.readLine());
        n=Integer.parseInt(buf.readLine());
        int a[][]=new int[m][n];
        System.out.println("ENTER ELEMENTS OF ARRAY");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=Integer.parseInt(buf.readLine());
            }
        }
        System.out.println("YOUR ARRAY IS .........");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        int b[]=new int[m*n];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                b[c]=a[i][j];
                c++;
            }
        }
        c=0;
        for(i=0;i<(m*n);i++)
        {
            for(j=0;j<(m*n)-i-1;j++)
            {
                if(b[j]>b[j+1])
                {
                    int t=b[j];
                    b[j]=b[j+1];
                    b[j+1]=t;
                }
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=b[c];
                c++;
            }
        }
        System.out.println("SORTED ARRAY IS .........");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}