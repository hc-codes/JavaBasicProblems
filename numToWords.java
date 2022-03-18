import java.io.*;
public class numToWords
{
   static int r,s;
    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER  A NUMBER");
        int n=Integer.parseInt(buf.readLine());
        while(n>0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        r=0;
        while(s>0)
        {
            r=s%10;
            s=s/10;
            switch(r)
            {
                case 1:
                System.out.print(" ONE  ");
                break;
                case 2:
                System.out.print(" TWO  ");
                break;
                case 3:
                System.out.print(" THREE ");
                break;
                case 4:
                System.out.print(" FOUR ");
                break;
                case 5:
                System.out.print(" FIVE  ");
                break;
                case 6:
                System.out.print(" SIX  ");
                break;
                case 7:
                System.out.print(" SEVEN  ");
                break;
                case 8:
                System.out.print(" EIGHT  ");
                break;
                case 9:
                System.out.print(" NINE  ");
                break;
                case 0:
                System.out.print(" ZERO  ");
                break;
                

            }
        }
    }
}