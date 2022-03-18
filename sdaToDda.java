import java.io.*;
class sdaToDda
{
    static int i,f,j,c,m,n,s;

    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER DIMENSION OF 1st ARRAY []");
        n=Integer.parseInt(buf.readLine());
        int a[]=new int[n];
        System.out.println("ENTER ELEMENTS OF 1st ARRAY []");
        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(buf.readLine());
        }
        for(i=1;i<=n;i++)
        {
            
            if((i*i)==n)
            {
                m=i;
                break;
            }
              else
              f=1;
        }
        if(f==1)
System.out.println("ENTER DIMENSION WITH A SQUARE NUMBER[]");
        int b[][]=new int[m][m];
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                b[i][j]=a[c];
                c++;
            }
        }

        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }

    }
}