import java.io.*;
class reverse
{
    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A NUMBER");
        StringBuffer s=new StringBuffer(buf.readLine());
        System.out.println("REVERSED NUMBER IS "+s.reverse());
    }
}