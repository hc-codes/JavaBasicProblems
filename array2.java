import java.io.*;
class array2
{
    static int i,j,n,ch;

    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("<<< ENTER NUMBER OF NAMES TO BE ARRANGED");
        n=Integer.parseInt(buf.readLine());
        String name[]=new String[n];
        System.out.println("<<< ENTER  NAMES OF "+n+" PERSONS");
        for(i=0;i<n;i++)
        {
            name[i]=buf.readLine();
        }
        System.out.println("1:ASCENDING ORDER ");
        System.out.println("2:DESCENDING ORDER ");
        System.out.println("ENTER A CHOICE");
        ch=Integer.parseInt(buf.readLine());
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(name[j].compareTo(name[j+1])>=0)
                {
                    String s=name[j];
                    name[j]=name[j+1];
                    name[j+1]=s;
                }
            }
        }
        
        if(ch==1)
        {
            System.out.println("NAMES ARRANGED IN ASCENDING ORDER IS");
            for(i=0;i<n;i++)
            {
                System.out.println(name[i]);

            }
        }
        else
        if(ch==2)
        {
            System.out.println("NAMES ARRANGED IN DESCENDING ORDER IS");
            for(i=n-1;i>=0;i--)
            {
                System.out.println(name[i]);

            }
        }
        else
            System.out.println("INVALID CHOICE !!!!!!!!!!!!!!");
    }
}