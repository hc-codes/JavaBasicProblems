import java.io.*;
import java.util.*;

public class countStr
{
    String str;
    int l;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String ");
        str=sc.next();
        l=str.length();
        System.out.println(l);
    }
}
 