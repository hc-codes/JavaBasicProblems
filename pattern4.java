import java.io.*;
class pattern4
{static int n,a;
public static void main(String args[])throws IOException
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("ENTER A NUMBER");
            n=Integer.parseInt(buf.readLine());
            a=1;
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                {System.out.print(a+"\t");
                    a++;
                }
                System.out.println();
            }
        }
    }