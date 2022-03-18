import java.io.*;
class arrmenu
{
    static int i,ch,c1,c2,j,c=0,m,n,k,p,q,s=1;

    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("####### MENU #######");
        System.out.println("1.To Arrange Names ");
        System.out.println("2.To Rotate An Array ");
        System.out.println("3.To Sort Array In Circular Way");
        System.out.println("4.To Sort Arrays Coloumn Wise ");
        System.out.println("5.To Multiply Two Arrays ");
        System.out.println("===== ENTER YOUR CHOICE =====");
        int choice=Integer.parseInt(buf.readLine());
        if(choice==1)
        {
            System.out.println("<<< ENTER NUMBER OF NAMES TO BE ARRANGED >>>");
            n=Integer.parseInt(buf.readLine());
            String name[]=new String[n];
            System.out.println("<<< ENTER  NAMES OF "+n+" PERSONS >>>");
            for(i=0;i<n;i++)
            {
                name[i]=buf.readLine();
            }
            System.out.println("1:ASCENDING ORDER ");
            System.out.println("2:DESCENDING ORDER ");
            System.out.println("ENTER YOUR CHOICE !!!!!!!");
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
                System.out.println("NAMES ARRANGED IN ASCENDING ORDER IS .........");
                for(i=0;i<n;i++)
                {
                    System.out.println((i+1)+":"+name[i]);

                }
            }
            else
            if(ch==2)
            {
                System.out.println("NAMES ARRANGED IN DESCENDING ORDER IS .......");
                for(i=n-1;i>=0;i--)
                {

                    System.out.println(s+":"+name[i]);
                    s++;
                }
            }

            else
                System.out.println("INVALID CHOICE !!!!!!!!!!!!!!");
        }

        else
        if(choice==2)
        {
            System.out.println("ENTER SAME DIMENSIONS OF  ARRAY [M][M]");
            m=Integer.parseInt(buf.readLine());
            n=Integer.parseInt(buf.readLine());
            int A[][]=new int[m][n];
            int a[][]=new int[m][n];
            int b[]=new int[m*n];
            if(m!=n)
                System.out.println("ENTER AN ARRAY WITH SAME DIMENSION [M][M]");
            else
            {
                System.out.println("ENTER ELEMENTS OF ARRAY");
                for(i=0;i<m;i++)
                {
                    for(j=0;j<n;j++)
                    {
                        a[i][j]=Integer.parseInt(buf.readLine());
                    }
                }
                System.out.println("YOUR ARRAY IS .........");
                for(i=0;i<m;i++)
                {
                    for(j=0;j<n;j++)
                    {
                        System.out.print("["+a[i][j]+"]\t");
                    }
                    System.out.println();
                }

                for(i=0;i<m;i++)
                {
                    for(j=0;j<m;j++)
                    {
                        b[c]=a[i][j];
                        c++;
                    }
                }
                c=0;
                for(i=0;i<m;i++)
                {
                    for(j=0;j<m;j++)
                    {
                        A[i][j]=b[c];
                        c++;
                    }
                }
                c1=n-1;
                System.out.println("1.ROTATE FROM LEFT TO RIGHT");
                System.out.println("2.ROTATE FROM RIGHT TO LEFT");
                System.out.println("ENTER YOUR CHOICE");
                ch=Integer.parseInt(buf.readLine());
            }
            if(ch==1)
            { for(i=0;i<n;i++)
                {
                    for(j=0;j<n;j++)
                    {
                        a[j][i]=A[c1][j];

                    }
                    c1--;
                }
                System.out.println("ROTATED ARRAY FROM LEFT TO RIGHT IS.....");
                for(i=0;i<m;i++)
                {
                    for(j=0;j<n;j++)
                    {
                        System.out.print("["+a[i][j]+"]\t");
                    }
                    System.out.println();
                }
            }
            else
            if(ch==2)
            {
                for(i=0;i<n;i++)
                {
                    for(j=0;j<n;j++)
                    {
                        a[i][j]=A[j][c1];

                    }
                    c1--;
                }
                System.out.println("ROTATED ARRAY FROM RIGHT TO LEFT IS .....");
                for(i=0;i<m;i++)
                {
                    for(j=0;j<n;j++)
                    {
                        System.out.print("["+a[i][j]+"]\t");
                    }
                    System.out.println();
                }
            }
            else
                System.out.println("INVALID CHOICE !!!!!!");

        }
        else
        if(choice==3)
        {
            System.out.println("ENTER SAME DIMENSIONS OF  ARRAY [M][M]");
            m=Integer.parseInt(buf.readLine());
            n=Integer.parseInt(buf.readLine());
            int a[][]=new int[m][n];
            int b[]=new int[m*n];
            if(m!=n)
                System.out.println("ENTER AN ARRAY WITH SAME DIMENSION");
            else
            {
                System.out.println("ENTER ELEMENTS OF ARRAY");
                for(i=0;i<m;i++)
                {
                    for(j=0;j<n;j++)
                    {
                        a[i][j]=Integer.parseInt(buf.readLine());
                    }
                }
                System.out.println("YOUR ARRAY IS .........");
                for(i=0;i<m;i++)
                {
                    for(j=0;j<n;j++)
                    {
                        System.out.print("["+a[i][j]+"]\t");
                    }
                    System.out.println();
                }

                for(i=0;i<m;i++)
                {
                    for(j=0;j<m;j++)
                    {
                        b[c]=a[i][j];
                        c++;
                    }
                }
                c=0;
                for(i=0;i<(m*n);i++)
                {
                    for(j=0;j<(m*n)-i-1;j++)
                    {
                        if(b[j]>b[j+1])
                        {
                            int t=b[j];
                            b[j]=b[j+1];
                            b[j+1]=t;
                        }
                    }
                }
                System.out.println("1.CLOCK WISE SORT");
                System.out.println("2.ANTICLOCK WISE SORT");
                System.out.println("ENTER YOUR CHOICE");
                ch=Integer.parseInt(buf.readLine());
            }
            c=0;
            if(ch==1)
            {

                for(j=0;j<=m/2;j++)
                {
                    for(i=j;i<n;i++)
                    {
                        a[j][i]=b[c];
                        c++;
                    }

                    for(i=j+1;i<n;i++)
                    {
                        a[i][n-1]=b[c];
                        c++;
                    }

                    for(i=n-2;i>=j;i--)
                    {
                        a[n-1][i]=b[c];
                        c++;
                    }

                    for(i=n-2;i>j;i--)
                    {
                        a[i][j]=b[c];
                        c++;
                    }
                    n--;
                }
                System.out.println("<<<<<<<< CIRCULAR SORTED ARRAY IS >>>>>>>>> .........");
                for(i=0;i<m;i++)
                {
                    for(j=0;j<m;j++)
                    {
                        System.out.print("["+a[i][j]+"]\t");
                    }
                    System.out.println();
                }
            }
            if(ch==2)
            {
                for(j=0;j<=m/2;j++)
                {
                    for(i=n-1;i>=j;i--)
                    {
                        a[j][i]=b[c];
                        c++;
                    }

                    for(i=j+1;i<n;i++)
                    {
                        a[i][j]=b[c];
                        c++;
                    }

                    for(i=j+1;i<n;i++)
                    {
                        a[n-1][i]=b[c];
                        c++;
                    }

                    for(i=n-2;i>j;i--)
                    {
                        a[i][n-1]=b[c];
                        c++;
                    }
                    n--;
                }
                System.out.println("<<<<<<<<CIRCULAR SORTED ARRAY IS>>>>>>>>> .........");
                for(i=0;i<m;i++)
                {
                    for(j=0;j<m;j++)
                    {
                        System.out.print("["+a[i][j]+"]\t");
                    }
                    System.out.println();
                }
            }
            else
                System.out.println("INVALID CHOICE !!!!!!");
        }
        else
        if(choice==4)
        {
            System.out.println("ENTER SAME DIMENSIONS OF  ARRAY [M][M]");
            m=Integer.parseInt(buf.readLine());
            n=Integer.parseInt(buf.readLine());
            int a[][]=new int[m][n];
            if(m!=n)
                System.out.println("ENTER AN ARRAY WITH SAME DIMENSION !!!!!!");
            else
            {
                System.out.println("ENTER ELEMENTS OF ARRAY");
                for(i=0;i<m;i++)
                {
                    for(j=0;j<n;j++)
                    {
                        a[i][j]=Integer.parseInt(buf.readLine());
                    }
                }
                System.out.println("YOUR ARRAY IS .........");
                for(i=0;i<m;i++)
                {
                    for(j=0;j<n;j++)
                    {
                        System.out.print("["+a[i][j]+"]\t");
                    }
                    System.out.println();
                }
                int b[]=new int[m*n];
                for(i=0;i<m;i++)
                {
                    for(j=0;j<m;j++)
                    {
                        b[c]=a[i][j];
                        c++;
                    }
                }
                c=0;
                for(i=0;i<(m*n);i++)
                {
                    for(j=0;j<(m*n)-i-1;j++)
                    {
                        if(b[j]>b[j+1])
                        {
                            int t=b[j];
                            b[j]=b[j+1];
                            b[j+1]=t;
                        }
                    }
                }

                for(i=0;i<m;i++)
                {
                    for(j=0;j<m;j++)
                    {
                        a[j][i]=b[c];
                        c++;
                    }
                }
                for(int v=0;v<m*n;v++)
                {
                    for(k=0;k<m/2;k++)
                    {
                        for(i=0;i<m;i++)
                        {

                            for(j=0;j<n-i-1;j++)
                            {
                                if(a[i][j]>a[i][j+1])
                                {
                                    int t=a[i][j];
                                    a[i][j]=a[i][j+1];
                                    a[i][j+1]=t;
                                }

                                if(a[k+1][i]>a[k+1][i+1])
                                {
                                    int t=a[k+1][i];
                                    a[k+1][i]=a[k+1][i+1];
                                    a[k+1][i+1]=t;
                                }
                            }
                        }
                    }
                }
                System.out.println("COLOUMN WISE SORTED ARRAY IS .........");
                for(i=0;i<m;i++)
                {
                    for(j=0;j<n;j++)
                    {
                        System.out.print("["+a[i][j]+"]\t");
                    }
                    System.out.println();
                }
            }
        }
        else
        if(choice==5)
        {
            System.out.println("ENTER DIMENSIONS OF 1st ARRAY [M][N]");
            m=Integer.parseInt(buf.readLine());
            n=Integer.parseInt(buf.readLine());
            System.out.println("ENTER DIMENSIONS OF 2nd ARRAY [P][Q]");
            p=Integer.parseInt(buf.readLine());
            q=Integer.parseInt(buf.readLine());
            if(n!=p)
                System.out.println("ARRAY NOT SUITABLE FOR MULTIPLICATION");
            else
            {
                int a[][]=new int[m][n];
                int b[][]=new int[p][q];
                int c[][]=new int[m][q];
                System.out.println("ENTER ELEMENTS OF 1st ARRAY");

                for(i=0;i<m;i++)
                {
                    for(j=0;j<n;j++)
                    {
                        a[i][j]=Integer.parseInt(buf.readLine());
                    }
                }
                System.out.println("YOUR 1st ARRAY IS .........");
                for(i=0;i<m;i++)
                {
                    for(j=0;j<n;j++)
                    {
                        System.out.print("["+a[i][j]+"]\t");
                    }
                    System.out.println();
                }
                System.out.println("ENTER ELEMENTS OF 2nd ARRAY");

                for(i=0;i<p;i++)
                {
                    for(j=0;j<q;j++)
                    {
                        b[i][j]=Integer.parseInt(buf.readLine());
                    }
                }
                System.out.println("YOUR 2nd ARRAY IS .........");
                for(i=0;i<p;i++)
                {
                    for(j=0;j<q;j++)
                    {
                        System.out.print("["+b[i][j]+"]\t");
                    }
                    System.out.println();
                }
                for(i=0;i<m;i++)
                {
                    for(j=0;j<q;j++)
                    {
                        for(k=0;k<n;k++)
                        {
                            c[i][j]+=a[i][k]*b[k][j];
                        }
                    }
                }
                System.out.println("PRODUCT OF ARRAYS");
                for(i=0;i<m;i++)
                {
                    for(j=0;j<q;j++)
                    {
                        System.out.print("["+c[i][j]+"]\t");
                    }
                    System.out.println();
                }
            }
        }

        else
            System.out.println("INVALID CHOICE !!!!!!!!!!!!!!");
    }
}

