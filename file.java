import java.io.*;
class file
{
    static String fileName=("names.txt");

    static BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[])
    {
        try
        {
            FileWriter fw= new FileWriter(fileName);
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter outFile=new PrintWriter(bw);
            for(int i=0;i<5;i++)
            {
                System.out.println("Enter Name :");
                String name=stdin.readLine();
                outFile.println(name);
            }
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
