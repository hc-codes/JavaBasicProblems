import java.io.*;
class division
{
    static int i;
    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" ENTER THE LIMIT OR RANGE ");
        int n=Integer.parseInt(buf.readLine());
        System.out.println(" ENTER A NUMBER  ");
        int m=Integer.parseInt(buf.readLine());
        System.out.println(" THE NUMBERS DIVISIBLE BY "+m+" BETWEEN 1 AND "+n+" ARE---- ");
        for(i=1;i<=n;i++)
        {
            if(i%m==0)
            {
                System.out.print(i);
                if(i%2==0)
                    System.out.println("    EVEN   ");
                else
                    System.out.println("    ODD    ");
            }
        }
    }
}
