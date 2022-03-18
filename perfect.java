import java.io.*;
class perfect
{static int f=0,n;
public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("ENTER A NUMBER TO FIND IT'S FACTORIAL");
            n=Integer.parseInt(buf.readLine());
       
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            f+=i;
        }
        if(n==f)
        System.out.println(n+" IS A PERFECT NUMBER");
        else
    System.out.println(n+" IS NOT A PERFECT NUMBER");
    }
}
        