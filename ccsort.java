import java.io.*;
class ccsort
{
    static int c1,c2,r1,r2,i,j,c=0,m,n,k;

    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER SAMEDIMENSIONS OF  ARRAY [M][M]");
        m=Integer.parseInt(buf.readLine());
        n=Integer.parseInt(buf.readLine());
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
                    b[c++]=a[i][j];
                }
            }
            c=0;
            for(j=0;j<=m/2;j++)
            {
                for(i=j;i<n;i++)
                {
                    a[j][i]=b[c];
                    c++;
                }

                for(i=j+1;i<n;i++)
                {
                    a[i][n-1]=b[c];
                    c++;
                }

                for(i=n-2;i>=j;i--)
                {
                    a[n-1][i]=b[c];
                    c++;
                }

                for(i=n-2;i>j;i--)
                {
                    a[i][j]=b[c];
                    c++;
                }
                n--;
            }
            System.out.println("<<<<<<<<CIRCULAR SORTED ARRAY IS>>>>>>>>> .........");
            for(i=0;i<m;i++)
            {
                for(j=m-1;j>=0;j--)
                {
                    System.out.print("["+a[j][i]+"]\t");
                }
                System.out.println();
            }
        }
    }
}