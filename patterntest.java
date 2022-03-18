import java.io.*;
class patterntest
{static int n,j;
    public static void main(String args[])throws IOException
    {
        int a=1;
        int b=1;
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A NUMBER FOR THE LIMIT");
        n=Integer.parseInt(buf.readLine());
        
        for(int i=1;i<=n;i++)
        {
            if(i%2==1){
            for(j=1;j<=i;j++)
            {
                System.out.print(a);
                a++;
                if(i>1 && j<i)
                    System.out.print(" * ");
            }
            b=a;
        }
        else{
            for(int k=i+a-1;k>=a;k--)
            {
                System.out.print(k);
                b++;
                if(k>a)
                    System.out.print(" * ");
            }
            a=b;
        }
            System.out.println();
        }
    }
}