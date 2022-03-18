import java.io.*;
class ascending
{static int i,n,j,ch;

    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        int a[]=new int[3];
        System.out.println("<<<   ENTER THREE NUMBERS....   >>>");
        for(i=0;i<3;i++)
        {
            a[i]=Integer.parseInt(buf.readLine());
        }
        for(i=0;i<3;i++)
            for(j=0;j<3-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        System.out.println("Smallest Number="+a[0]);
        System.out.println("Next Higher Number="+a[1]);
        System.out.println("Highest Number="+a[2]);
    }
}
