import java.io.*;
class rotate90
{
    static int c1,c2,r1,r2,i,j,c=0,m,n,k;

    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER SAMEDIMENSIONS OF  ARRAY [M][M]");
        m=Integer.parseInt(buf.readLine());
        n=Integer.parseInt(buf.readLine());
        int A[][]=new int[m][n];
        int a[][]=new int[m][n];
        if(m!=n)
            System.out.println("ENTER AN ARRAY WITH SAME DIMENSION");
        else
        {
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
                for(j=0;j<m;j++)
                {
                    b[c]=a[i][j];
                    c++;
                }
            }
            c=0;
            for(i=0;i<m;i++)
            {
                for(j=0;j<m;j++)
                {
                    A[i][j]=b[c];
                    c++;
                }
            }
            c1=n-1;
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    a[i][j]=A[j][c1];

                }
                c1--;
            }
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
}