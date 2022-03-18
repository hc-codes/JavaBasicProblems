import java.io.*;
class LcmGcD
{static int n,m,lcm,i,gcd,big,sm;
    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" ENTER TWO NUMBER TO FIND LCM AND GCD ");
        n=Integer.parseInt(buf.readLine());
        m=Integer.parseInt(buf.readLine());
        if(n<0)
        n=-n;
        if(m<0)
        m=-m;
        if(n>m)
        big=n;
        else
        big=m;
            for(i=big;i<=n*m;i++)
            {
                if(i%m==0&&i%n==0)
                {
                    lcm=i;
                    break;
                }
            }

            
        System.out.println(" LCM OF "+n+" AND "+m+" IS "+lcm);
        if(n<m)
        sm=n;
        else
        sm=m;
            for(i=1;i<=sm;i++)
            {
                if(m%i==0&&n%i==0)
                    gcd=i;
            }
       
        System.out.println(" GCD OF "+n+" AND "+m+" IS "+gcd);
    }
}
