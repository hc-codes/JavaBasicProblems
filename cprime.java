import java.io.*;
class cprime
{
    static int c,i,n=0,j,k,f,flag,n1,n2;
    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A NUMBER TO CHECK WHETHER IT IS CIRCUAR PRIME OR NOT");
        n=Integer.parseInt(buf.readLine());
       
            n1=n;
            n2=n;
            do
            {
                c=0;
                k=1;
                for(int i=1;i<=n2;i++)
                {
                    if(n2%i==0)
                        c++;
                }
                if(c==2)
                    flag=1;
                else
                    flag=0;
                n1=n2;
                while(n1>9)
                {
                    if(n1%10==0)
                        f=1;
                    n1=n1/10;
                    k=k*10;
                }
                n2=((n2%k)*10)+n1;
            }while(n2!=n&&f==0);
            if(flag==1)
                System.out.println(n+" IS CIRCUALR PRIME.......");
            else
                System.out.print(n+" IS NOT A CIRCUALR PRIME.......");
        
    }
}
