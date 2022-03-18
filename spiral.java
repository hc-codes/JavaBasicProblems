import java.io.*;
class spiral
{
    static int i,j,c=0,m,n,k;

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
            int m1=m;
            int n1=n;
            c=0;
            for(i=0;i<=m/2;i++)
            {                            //   0  1  2  3
                for(j=i;j<m;j++)        // 0 -1  2  3  4
                {                       // 1- 12 13 14 5
                    b[c]=a[i][j];       // 2- 11 16 15 6
                    c++;                // 3- 10 9  8  7
                }
                for(j=i+1;j<n;j++)
                {
                    b[c]=a[j][n-1];
                    c++;
                }
                 for(j=n-2;j>=i;j--)
                {
                    b[c]=a[n-1][j];
                    c++;
                }
                for(j=n-2;j>i;j--)
                {
                    b[c]=a[j][i];
                    c++;
                }
                n--;
                m--;
            }
            
           
            System.out.println("<<<<<<<<CIRCULAR SORTED ARRAY IS>>>>>>>>> .........");
            for(i=0;i<m1*n1;i++)
            {
                
                    System.out.print(b[i]+"\t");
               
            }
        }
    }
}