import java.io.*;
class factorial
{static int f=1,n;
public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("ENTER A NUMBER TO FIND IT'S FACTORIAL");
            n=Integer.parseInt(buf.readLine());
        
        
        for(int i=1;i<=n;i++)
        {
            f*=i;
        }
        System.out.println(f);
    }
}
        