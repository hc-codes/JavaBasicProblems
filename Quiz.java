import java.io.*;

class Quiz 
{
    static int i,j,n,ch,sc,a,c;

    public static void main()throws IOException
    {

        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        A:for(i=0;;i++)
        {
            sc=0;
            System.out.println(" @@@@@@@@@@@@@@@====================@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println(" @@@@@@@@@@@@@@@====================@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println(" @@@@@@@@@@@@@@@====================@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println(" @@@@@@@@@@@@@@@====================@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println("WELCOME TO QUIZ LETS START ");
            System.out.println("---------------------------");
            System.out.println("1.*** COMPUTER ***");
            System.out.println("2.*** SPORTS ***");

            ch=Integer.parseInt(buf.readLine());
            if(ch==1)
            {
                a:System.out.println("WHO IS KNOWN AS THE FATHER OF COMPUTER ?");
                System.out.println("1.ADA LOVELACE ");
                System.out.println("2.CHADSWICK ");
                System.out.println("3.CHARLES BABBAGE");
                System.out.println("ENTER YOUR ANSWER AS 1,2,3");
                n=Integer.parseInt(buf.readLine());
                if(n==3)
                {
                    System.out.println("@@@@@@@@@@@ CORRECT ANSWER !!!");
                    sc=sc+50;
                }
                else
                {
                    System.out.println(" WRONG ANSWER ");
                    sc=sc-20;
                }
                System.out.println();
                System.out.println(" YOUR CURRENT SCORE IS "+sc);

                b:System.out.println("WHERE  WAS THE BIRTH OF FIRST COMPUTER ?");
                System.out.println("1.ENGLAND ");
                System.out.println("2.INDIA");
                System.out.println("3.AMERICA");
                System.out.println("ENTER YOUR ANSWER AS 1,2,3");
                n=Integer.parseInt(buf.readLine());
                if(n==3)
                {
                    System.out.println("@@@@@@@@@@ CORRECT ANSWER !!!");
                    sc=sc+50;
                }
                else
                {
                    System.out.println(" WRONG ANSWER ");
                    sc=sc-20;
                }
                System.out.println();
                System.out.println(" YOUR CURRENT SCORE IS "+sc);
                c:System.out.println("WHAT  WAS THE WEIGHT OF EARLIER COMPUTERS ?");
                System.out.println("1.30 TONNES ");
                System.out.println("2.20 TONNES");
                System.out.println("3.25 TONNES");
                System.out.println("ENTER YOUR ANSWER AS 1,2,3");
                n=Integer.parseInt(buf.readLine());
                if(n==1)
                {
                    System.out.println("@@@@@@@@@ CORRECT ANSWER !!!");
                    sc=sc+50;
                }
                else
                {
                    System.out.println(" WRONG ANSWER ");
                    sc=sc-20;
                }
                System.out.println();
                System.out.println(" YOUR CURRENT SCORE IS "+sc);
                System.out.println("WHAT  WAS THE MICROPROCESSOR USED IN THE MARK 8  ?");
                System.out.println("1.THE INTEL 885 MICROPROCESSOR ");
                System.out.println("2.THE INTEL 4000 MICROPROCESSOR");
                System.out.println("3.THE INTEL 4004 MICROPROCESSOR");
                System.out.println("ENTER YOUR ANSWER AS 1,2,3");
                n=Integer.parseInt(buf.readLine());
                if(n==3)
                {
                    System.out.println("@@@@@@@@@@ CORRECT ANSWER !!!");
                    sc=sc+50;
                }
                else
                {
                    System.out.println(" WRONG ANSWER ");
                    sc=sc-20;
                }
                System.out.println();
                System.out.println(" YOUR CURRENT SCORE IS "+sc);
                System.out.println("WHO INVENTED SUPER COMPUTER ?");
                System.out.println("1.CHARLES BABBAGE ");
                System.out.println("2.ADA LOVELACE");
                System.out.println("3.SEYMOUR CRAY");
                System.out.println("ENTER YOUR CHOICE AS 1,2,3");
                n=Integer.parseInt(buf.readLine());
                if(n==3)
                {
                    System.out.println("@@@@@@@@ CORRECT ANSWER !!!");
                    sc=sc+50;
                }
                else
                {
                    System.out.println(" WRONG ANSWER ");
                    sc=sc-20;
                }
                System.out.println();
                System.out.println("WHAT WAS THE FIRST NAME OF JAVA ?");
                System.out.println("1.MANGO ");
                System.out.println("2.OAK");
                System.out.println("3.APPLE");
                System.out.println("ENTER YOUR CHOICE AS 1,2,3");
                n=Integer.parseInt(buf.readLine());
                if(n==2)
                {
                    System.out.println("@@@@@@@@ CORRECT ANSWER !!!");
                    sc=sc+50;
                }
                else
                {
                    System.out.println(" WRONG ANSWER ");
                    sc=sc-20;
                }
                System.out.println();
                System.out.println("WHICH KEYWORD IS USED TO MAKE A VARIABLE CONSTANT ?");
                System.out.println("1.CONTINUE ");
                System.out.println("2.FINALLY");
                System.out.println("3.FINAL");
                System.out.println("ENTER YOUR CHOICE AS 1,2,3");
                n=Integer.parseInt(buf.readLine());
                if(n==3)
                {
                    System.out.println("@@@@@@@@ CORRECT ANSWER !!!");
                    sc=sc+50;
                }
                else
                {
                    System.out.println(" WRONG ANSWER ");
                    sc=sc-20;
                }
                System.out.println();
                System.out.println("WHICH KEYWORD IS AN UNCONDITIONAL BRANCHING ?");
                System.out.println("1.RETURN ");
                System.out.println("2.VOID");
                System.out.println("3.PUBLIC");
                System.out.println("ENTER YOUR CHOICE AS 1,2,3");
                n=Integer.parseInt(buf.readLine());
                if(n==1)
                {
                    System.out.println("@@@@@@@@ CORRECT ANSWER !!!");
                    sc=sc+50;
                }
                else
                {
                    System.out.println(" WRONG ANSWER ");
                    sc=sc-20;
                }
                System.out.println();
                System.out.println("WHAT IS THE FULL FORM OF JVM ?");
                System.out.println("1.JAVA VOID MACHINE ");
                System.out.println("2.JAVA VIRTUAL MODE");
                System.out.println("3.JAVA VIRTUAL MACHINE");
                System.out.println("ENTER YOUR CHOICE AS 1,2,3");
                n=Integer.parseInt(buf.readLine());
                if(n==3)
                {
                    System.out.println("@@@@@@@@ CORRECT ANSWER !!!");
                    sc=sc+50;
                }
                else
                {
                    System.out.println(" WRONG ANSWER ");
                    sc=sc-20;
                }
                System.out.println();
                System.out.println("WHICH ONE OF THE FOLLOWING IS AN EXIT CONTROLLED LOOP ?");
                System.out.println("1.DO-WHILE ");
                System.out.println("2.WHILE ");
                System.out.println("3.FOR ");
                System.out.println("ENTER YOUR CHOICE AS 1,2,3");
                n=Integer.parseInt(buf.readLine());
                if(n==1)
                {
                    System.out.println("@@@@@@@@ CORRECT ANSWER !!!");
                    sc=sc+50;
                }
                else
                {
                    System.out.println(" WRONG ANSWER ");
                    sc=sc-20;
                }
                System.out.println();
                System.out.println("WHAT IS THE FULL FORM OF JDK ?");
                System.out.println("1.JAVA DOS KIT ");
                System.out.println("2.JAVA DEVELOPMENT KIT ");
                System.out.println("3.JAVA DISK KIT");
                System.out.println("ENTER YOUR CHOICE AS 1,2,3");
                n=Integer.parseInt(buf.readLine());
                if(n==2)
                {
                    System.out.println("@@@@@@@@ CORRECT ANSWER !!!");
                    sc=sc+50;
                }
                else
                {
                    System.out.println(" WRONG ANSWER ");
                    sc=sc-20;
                }
                System.out.println();
            }
            else
            if(ch==2)
            {
                System.out.println("WHO HAS TAKEN MOST RUNS IN ODI CRICKET ?");
                System.out.println("1.SACHIN ");
                System.out.println("2.RICKY PONTING");
                System.out.println("3.BRAIN LARA");
                System.out.println("ENTER YOUR CHOICE AS 1,2,3");
                n=Integer.parseInt(buf.readLine());
                if(n==1)
                {
                    System.out.println("@@@@@@@@ CORRECT ANSWER !!!");
                    sc=sc+50;
                }
                else
                {
                    System.out.println(" WRONG ANSWER ");
                    sc=sc-20;
                }
                System.out.println();
                System.out.println(" YOUR CURRENT SCORE IS "+sc);
                System.out.println("WHO IS THE OWNER OF THE TEAM KERALA IN ISL ?");
                System.out.println("1.SACHIN ");
                System.out.println("2.KHOLI");
                System.out.println("3.DHONI");
                System.out.println("ENTER YOUR CHOICE AS 1,2,3");
                n=Integer.parseInt(buf.readLine());
                if(n==1)
                {
                    System.out.println("@@@@@@@@@ CORRECT ANSWER !!!");
                    sc=sc+50;
                }
                else
                {
                    System.out.println(" WRONG ANSWER ");
                    sc=sc-20;
                }
                System.out.println();
                System.out.println(" YOUR CURRENT SCORE IS "+sc);
                System.out.println("WHO HAS TAKEN THE FIRST 200 RUNS IN ODI CRICKET  ?");
                System.out.println("1.SACHIN ");
                System.out.println("2.KHOLI");
                System.out.println("3.DHONI");
                System.out.println("ENTER YOUR CHOICE AS 1,2,3");
                n=Integer.parseInt(buf.readLine());
                if(n==1)
                {
                    System.out.println("@@@@@@ CORRECT ANSWER !!!");
                    sc=sc+50;
                }
                else
                {
                    System.out.println(" WRONG ANSWER ");
                    sc=sc-20;
                }
                System.out.println();
                System.out.println(" YOUR CURRENT SCORE IS "+sc);
                System.out.println("WHICH TEAM WON THE FIRST IPL CUP ?");
                System.out.println("1.MUMBAI INDIANS ");
                System.out.println("2.CHENNAI SUPER KINGS");
                System.out.println("3.RAJASTHAN ROYALS");
                System.out.println("ENTER YOUR CHOICE AS 1,2,3");
                n=Integer.parseInt(buf.readLine());
                if(n==3)
                {
                    System.out.println(" CORRECT ANSWER !!!");
                    sc=sc+50;
                }
                else
                {
                    System.out.println(" WRONG ANSWER ");
                    sc=sc-20;
                }
                System.out.println();
                System.out.println(" YOUR CURRENT SCORE IS "+sc);
                System.out.println("WHICH PLAYER IS KNOWN AS DADA ?");
                System.out.println("1.SACHIN ");
                System.out.println("2.GANGULY");
                System.out.println("3.DRAVID");
                System.out.println("ENTER YOUR CHOICE AS 1,2,3");
                n=Integer.parseInt(buf.readLine());
                if(n==2)
                {
                    System.out.println("@@@@@@@ CORRECT ANSWER !!!");
                    sc=sc+50;
                }
                else
                {
                    System.out.println(" WRONG ANSWER ");
                    sc=sc-20;
                }
                System.out.println();
                System.out.println(" YOUR CURRENT SCORE IS "+sc);
                System.out.println("WHICH TEAM WON THE FIFA WORLD CUP 2014 ?");
                System.out.println("1.SPAIN ");
                System.out.println("2.ARGENTENA");
                System.out.println("3.GERMANY");
                System.out.println("ENTER YOUR CHOICE AS 1,2,3");
                n=Integer.parseInt(buf.readLine());
                if(n==3)
                {
                    System.out.println("@@@@@@@@@ CORRECT ANSWER !!!");
                    sc=sc+50;
                }
                else
                {
                    System.out.println(" WRONG ANSWER ");
                    sc=sc-20;
                }
                System.out.println();
                System.out.println(" YOUR CURRENT SCORE IS "+sc);
                System.out.println("WHICH  TEAM HAS WON THE ISL 2014 ?");
                System.out.println("1.KOLKOTA ");
                System.out.println("2.KERALA");
                System.out.println("3.CHENNAI");
                System.out.println("ENTER YOUR CHOICE AS 1,2,3");
                n=Integer.parseInt(buf.readLine());
                if(n==1)
                {
                    System.out.println("@@@@@@@@@ CORRECT ANSWER !!!");
                    sc=sc+50;
                }
                else
                {
                    System.out.println(" WRONG ANSWER ");
                    sc=sc-20;
                }
                System.out.println();
                System.out.println(" YOUR CURRENT SCORE IS "+sc);
                System.out.println("AGAINST WHICH TEAM DOES SACHIN SCORED 200 RUNS ?");
                System.out.println("1.SRI LANKA ");
                System.out.println("2.SOUTH AFRICA");
                System.out.println("3.AUSTRALIA");
                System.out.println("ENTER YOUR CHOICE AS 1,2,3");
                n=Integer.parseInt(buf.readLine());
                if(n==2)
                {
                    System.out.println("@@@@@@@@ CORRECT ANSWER !!!");
                    sc=sc+50;
                }
                else
                {
                    System.out.println(" WRONG ANSWER ");
                    sc=sc-20;
                }
                System.out.println();
                System.out.println(" YOUR CURRENT SCORE IS "+sc);
                System.out.println("WHO WROTE THE BOOK I PLAYED IT IN MY WAY ?");
                System.out.println("1.PONTING ");
                System.out.println("2.KHOLI");
                System.out.println("3.SACHIN");
                System.out.println("ENTER YOUR CHOICE AS 1,2,3");
                n=Integer.parseInt(buf.readLine());
                if(n==3)
                {
                    System.out.println("@@@@@@@ CORRECT ANSWER !!!");
                    sc=sc+50;
                }
                else
                {
                    System.out.println(" WRONG ANSWER ");
                    sc=sc-20;
                }
                System.out.println();
                System.out.println(" YOUR CURRENT SCORE IS "+sc);
                System.out.println("HOW MANY TIMES DID BRAZIL WON THE WORLD CUP ?");
                System.out.println("1.2 ");
                System.out.println("2.5");
                System.out.println("3.7");
                System.out.println("ENTER YOUR CHOICE AS 1,2,3");
                n=Integer.parseInt(buf.readLine());
                if(n==2)
                {
                    System.out.println("@@@@@@@@ CORRECT ANSWER !!!");
                    sc=sc+50;
                }
                else
                {
                    System.out.println(" WRONG ANSWER ");
                    sc=sc-20;
                }
                System.out.println();
                System.out.println(" YOUR CURRENT SCORE IS "+sc);
                System.out.println("WHICH TEAM HAS WON THE 2011 CRICKET WORLD CUP ?");
                System.out.println("1.AUSTRALIA ");
                System.out.println("2.SRI LANKA");
                System.out.println("3.INDIA");
                System.out.println("ENTER YOUR CHOICE AS 1,2,3");
                n=Integer.parseInt(buf.readLine());
                if(n==3)
                {
                    System.out.println("@@@@@@@@@@ CORRECT ANSWER !!!");
                    sc=sc+50;
                }
                else
                {
                    System.out.println(" WRONG ANSWER ");
                    sc=sc-20;
                }
                System.out.println();
                System.out.println(" YOUR CURRENT SCORE IS "+sc);
                System.out.println("WHICH PLAYER THE RECORD OF MOST RUNS IN ONE ODI CRICKET ?");
                System.out.println("1.SACHIN ");
                System.out.println("2.ROHIT");
                System.out.println("3.DHONI");
                System.out.println("ENTER YOUR CHOICE AS 1,2,3");
                n=Integer.parseInt(buf.readLine());
                if(n==2)
                {
                    System.out.println("@@@@@@@@@ CORRECT ANSWER !!!");
                    sc=sc+50;
                }
                else
                {
                    System.out.println(" WRONG ANSWER ");
                    sc=sc-20;
                }
                System.out.println();
                System.out.println(" YOUR CURRENT SCORE IS "+sc);
                System.out.println("WHO IS KNOWN AS GOD OF CRICKET ?");
                System.out.println("1.SACHIN ");
                System.out.println("2.POLLACK");
                System.out.println("3.POLLARD");
                System.out.println("ENTER YOUR CHOICE AS 1,2,3");
                n=Integer.parseInt(buf.readLine());
                if(n==1)
                {
                    System.out.println("@@@@@@@@ CORRECT ANSWER !!!");
                    sc=sc+50;
                }
                else
                {
                    System.out.println(" WRONG ANSWER ");
                    sc=sc-20;
                }
                System.out.println();
                System.out.println(" YOUR CURRENT SCORE IS "+sc);
                System.out.println("WHICH TEAM WAS THE  RUNNER UP OF ISL 2014?");
                System.out.println("1.KERALA ");
                System.out.println("2.CHENNAI");
                System.out.println("3.GOA");
                System.out.println("ENTER YOUR CHOICE AS 1,2,3");
                n=Integer.parseInt(buf.readLine());
                if(n==1)
                {
                    System.out.println("@@@@@@@@ CORRECT ANSWER !!!");
                    sc=sc+50;
                }
                else
                {
                    System.out.println(" WRONG ANSWER ");
                    sc=sc-20;
                }
                System.out.println();

                System.out.println(" YOUR CURRENT SCORE IS "+sc);
                System.out.println("WHICH TEAM HAS WON THE MOST WORLD CUPS IN CRICKET ?");
                System.out.println("1.INDIA ");
                System.out.println("2.WEST INDIES");
                System.out.println("3.AUSTRALIA");
                System.out.println("ENTER YOUR CHOICE AS 1,2,3");
                n=Integer.parseInt(buf.readLine());
                if(n==3)
                {
                    System.out.println("@@@@@@@ CORRECT ANSWER !!!");
                    sc=sc+50;
                }
                else
                {
                    System.out.println(" WRONG ANSWER ");
                    sc=sc-20;
                }
                System.out.println();
            }
            else
            {
                System.out.println(" YOU HAVE ENTERED AN INVALID CHOICE ..........");
                System.out.println("<<<<< ENTER 1 IF YOU WANT TO CONTINUE OR ENTER ANY OTHER NUMBERS >>>>>");
                c=Integer.parseInt(buf.readLine());
                if(c==1)
                    continue A;
                else
                    break;
            }
            System.out.println(" @@@@@@@@@@@@@@@====================@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println(" @@@@@@@@@@@@@@@====================@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println(" @@@@@@@@@@@@@@@====================@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println(" @@@@@@@@@@@@@@@====================@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println(" @@@@@@@@@@@@@@@====================@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println(" @@@@@@@@@@@@@@@====================@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println(" @@@@@@@@@@@@@@@====================@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println(" !!!!!!!!!!@@@@@@@@@#########$$$$$$$$%%%%%%%%%%^^^^^^^&&&&****");
            System.out.println(" QUIZ IS OVER::::::::::::::::--------------:::::::::::");
            System.out.println("------------------------------------------------------");
            System.out.println();
            System.out.println(" YOUR FINAL SCORE IS "+sc);
            System.out.println();
            System.out.println();
            System.out.println(" @@@@@@@@@@@@@@@====================@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println(" @@@@@@@@@@@@@@@====================@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println(" @@@@@@@@@@@@@@@====================@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println(" @@@@@@@@@@@@@@@====================@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println(" @@@@@@@@@@@@@@@====================@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println(" @@@@@@@@@@@@@@@====================@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println(" @@@@@@@@@@@@@@@====================@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println(" !!!!!!!!!!@@@@@@@@@#########$$$$$$$$%%%%%%%%%%^^^^^^^&&&&****");
            System.out.println();
            System.out.println(" THANKS FOR PLAYING ......PLAY AGIAN............");
            System.out.println("<<<<< ENTER 1 IF YOU WANT TO CONTINUE OR ENTER ANY OTHER NUMBERS >>>>>");
            c=Integer.parseInt(buf.readLine());
            if(c==1)
                continue;
            else
                break;
        }
    }
}