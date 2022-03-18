import java.io.*;
class pattern7
{static int n,j,i,k;
    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A NUMBER FOR THE LIMIT");
        n=Integer.parseInt(buf.readLine());
        char ch=97;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            for(k=j-2,ch=(char)(ch-2);k>=1;k--)
            {
                
                System.out.print(ch+" ");
                ch--;
            }
            ch='a';
            System.out.println();
        }
    }
}