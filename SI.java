import java.io.*;
class SI
{static float p,t,r;
    static double a;
    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" SCHEME ");
        System.out.println("  DEPOSIT   TIME    RATE  ");
        System.out.println("  < 2000    >=2      5    ");
        System.out.println("  < 6000    >=2      7    ");
        System.out.println("  > 6000    >=1      8    ");
        System.out.println("    ANY     >=5     10    ");
        System.out.println("    ANY     ANY      3    ");
        System.out.println();
        System.out.println("  ENTER THE DEPOSIT, TIME  ");
        p=Float.parseFloat(buf.readLine());
        t=Float.parseFloat(buf.readLine());
        
        if(p<2000&&t>=2)
            r=5;
        else
        if(p<6000&&t>=2)
            r=7;
        else
        if(p>6000&&t>=1)
            r=8;
        else
        if(t>=5)
            r=10;
        else
        r=3;
            a=p*Math.pow((1+r/100.0),t);
            
        System.out.println("THE AMOUNT FOR DEPOSIT "+p+" FOR TIME "+t+" AT RATE "+r+" IS "+a);
        
    }
}
