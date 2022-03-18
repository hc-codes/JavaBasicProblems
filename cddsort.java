import java.io.*;
class cddsort
{
    static int c1,c2,r1,r2,i,j,c=0,m,n,k;

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
        }for(int v=0;v<m*n;v++)
            for(k=0;k<m/2;k++)
            {
                for(i=0;i<m;i++)
                {

                    for(j=0;j<n-i-1;j++)
                    {
                        if(a[i][j]>a[i][j+1])
                        {
                            int t=a[i][j];
                            a[i][j]=a[i][j+1];
                            a[i][j+1]=t;
                        }
                        if(a[k][n-1]>a[i+1][k])
                        {
                            int t=a[k][n-1];
                            a[k][n-1]=a[i+1][k];
                            a[i+1][k]=t;
                        }
                        if(a[k+1][i]>a[k+1][i+1])
                        {
                            int t=a[k+1][i];
                            a[k+1][i]=a[k+1][i+1];
                            a[k+1][i+1]=t;
                        }
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