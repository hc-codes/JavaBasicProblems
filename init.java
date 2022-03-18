import java.io.*;
class init
{static int c,c1,r,n1,s,j,i,n=0;
    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("@@@@@@@@@@@@----------------------@@@@@@@@@@@@");
        System.out.println("                    MENU  ");
        System.out.println("1.To check wheather a number is Prime or not");
        System.out.println("2.To produce n Prime numbers");
        System.out.println("3.To check wheather a number is Palin Prime Eg:11 is a palindrom & prime ");
        System.out.println("ENTER YOUR CHOICE");
        int ch=Integer.parseInt(buf.readLine());
        if(ch==1)
        {
            System.out.println("ENTER A NUMBER");
            n=Integer.parseInt(buf.readLine());
            for(int i=1;i<=n;i++)
            {
                if(n%i==0)
                    c++;
            }
            if(c==2)
                System.out.println(n+" IS A PRIME NUMBER");
                else
                 System.out.println(n+" IS NOT A PRIME NUMBER");
        }else
        if(ch==2)
        {
            System.out.println("ENTER LIMIT NUMBER");
            n=Integer.parseInt(buf.readLine());
            System.out.println("PRIME NUMBERS ARE ......");
            for(i=2;i<=n+1;i++)
            {
                for(j=2;j<=i/2;j++)
                {
                    if(i%j==0)
                        c++;
                }
                if(c==0)
                    System.out.println(i);
                else
                {
                    n++;
                    c=0;
                }
            }
        }else
        if(ch==3)
        {
            System.out.println("ENTER A TWO OR MORE DIGIT NUMBER");
            n=Integer.parseInt(buf.readLine());
            n1=n;
            while(n1>0)
            {
                r=n1%10;
                s=s*10+r;
                n1=n1/10;
            }
            if(s==n)
                c=1;
            for(i=1;i<=n;i++)
            {
                if(n%i==0)
                    c1++;
            }
            if(c1==2&&c==1)
                System.out.println(n+" IS A PALINE PRIME NUMBER");
                else
                 System.out.println(n+" IS NOT A PALINE PRIME NUMBER");
        }
        else
        System.out.println("<<<<<<<<<   SORRY INVALID CHOICE PLEASE CHECK THE CHOICE YOU HAVE ENTERED   >>>>>>>>>>>>");
    }
}

