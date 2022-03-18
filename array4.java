import java.io.*;
class array4
{
    public static void main(String args[])throws IOException
    {
        int i,j,s=0,m,n,s1=0;
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER DIMENSIONS OF 1st ARRAY [][]");
        m=Integer.parseInt(buf.readLine());
        n=Integer.parseInt(buf.readLine());
        int a[][]=new int[m][n];
        System.out.println("ENTER ELEMENTS OF 1st ARRAY");

        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=Integer.parseInt(buf.readLine());
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                s=s+a[i][j];
                
            }
            System.out.println(" SUM OF THE "+(i+1)+"st ROW IS...."+s);
            
        s=0;
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                s1=s1+a[j][i];
            }
            System.out.println(" SUM OF THE "+(i+1)+"st COLOUMN IS...."+s1);
            s1=0;
        
        }
    }
}
