import java.io.*;
class cccs
{
    static int c1,c2,r1,r2,i,j,c=0,m,n,k,l;

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
                for(j=0;j<m;j++)
                {
                    a[j][i]=b[c];
                    c++;
                }
            }

            for(k=0;k<m/2;k++)
            {
                for(i=0;i<n;i++)
                {

                    for(j=0;j<n-i-1;j++)
                    {
                        if(a[i][j]>a[i][j+1])
                        {
                            int t=a[i][j];
                            a[i][j]=a[i][j+1];
                            a[i][j+1]=t;
                        }
                        if(a[i][n-1]>a[i+1][k])
                        {
                            int t=a[i][n-1];
                            a[i][n-1]=a[i+1][i];
                            a[i+1][k]=t;
                        }
                        for(l=n-2;l>=k;l--)
                        {
                            if(a[n-1][l-1]>a[n-1][l-2])
                            {
                                int t=a[n-1][l-1];
                                a[n-1][l-1]=a[n-1][l-2];
                                a[n-1][l-2]=t;
                            }
                        }
                        if(a[k+1][i]>a[k+1][i+1])
                        {
                            int t=a[k+1][i];
                            a[k+1][i]=a[k+1][i+1];
                            a[k+1][i+1]=t;
                        }
                        n--;
                    }

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
}