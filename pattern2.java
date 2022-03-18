import java.io.*;
class pattern2
{static int n;
public static void main(String args[])throws IOException
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("ENTER A NUMBER");
            n=Integer.parseInt(buf.readLine());
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                {System.out.print(i+" ");
                }
                System.out.println();
            }
        }
    }