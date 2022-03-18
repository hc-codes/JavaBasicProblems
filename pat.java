import java.io.*;
class pat
{
    public static void main()throws IOException
    {
        int k;
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A NUMBER FOR THE LIMIT");
        int n=Integer.parseInt(buf.readLine());
        int c=n;
       
        for(int i=1;i<=n;i++)
        {

            for(int j=1;j<=i;j++)
            {
                
                System.out.print("*");   
           
            }
            System.out.println();
        }
    }
}