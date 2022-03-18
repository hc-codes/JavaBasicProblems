import java.io.*;
class Homeappliances
{
    static int choice=0,chsony=0,chonida=0,chsamsung=0,zz,sum,gg;

    static String c="",choic="",chhh="",vvv="",cod="",xx="";
    String a[]=new String[100];
    int b[]=new int[100];
    int cb[]=new int[100];
    BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
    public void run()throws IOException
    {

        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("WELCOME TO MKKS HOMEAPPLIANCES");
        System.out.println("WISH YOU NICE SHOPPING EXPERIANCE");
        System.out.println("What would you like to buy??? ");
        System.out.println("............................");
        System.out.println("(\n\n");
        o:do
        {
            System.out.println("1.Television");
            System.out.println("2.Oven");
            System.out.println("Enter the corresponding number of the store you want to take a visit and shop ");
            int ch=Integer.parseInt(buf.readLine());
            if(ch==1)
                tv();
            else
            if(ch==2)
                oven();

            else
                c="";
            break o;
        } while(c.equalsIgnoreCase("c"));

        System.out.println("thanks for coming to our shop & we think you got things as your desire");
        bill();
    }

    void bill()throws IOException
    {
        s: for(int i=1;;i++)
        {
            
                
            for(int ss=1;ss<=zz;ss++)
            {
                sum=sum+b[ss];
            }
            System.out.println("\n Bill \n");
            System.out.println("S.NO \t ITEM \t\t NO.OF ITEM \t COST ");
            for(int pp=1;pp<=zz;pp++)
            {
                System.out.println(pp +"\t"+ a[pp] +"\t\t"+ cb[pp] +"\t"+ b[pp] );
            }
            System.out.println("==============================================");
            System.out.println("TOTAL                                    "+sum);
            break s;
            
        }
        change();
    }

    void change()throws IOException
    {
        System.out.println("\n if YOU WANT TO REMOVE ANY ITEM FROM THE CHART PRESS 'Y' OTHERWISE PRESS ANY OTHER KEY \n");
        xx=buf.readLine();
        if(xx.equalsIgnoreCase("y"))
        {
            k:do
            {

                System.out.println(xx);
                if(xx.equalsIgnoreCase("y"))
                {
                    gg=0;
                    System.out.println("SELECT ANY S.NO FROM THE CHART FOR WHICH ITEM YOU WANT TO REMOVE ");
                    gg=Integer.parseInt(buf.readLine());
                    sum=0;
                    for(int ss=1;ss<=zz;ss++)
                    {
                        if(ss!=gg)
                            sum=sum=b[ss];
                    }
                    System.out.println("\n Bill \n");
                    System.out.println("S.NO \t ITEM \t NO.OF ITEM \t COST ");
                    int sss=1;
                    for(int pp=1;pp<=zz;pp++)
                    {
                        if(pp!=gg)
                        {
                            a[sss]=a[pp];
                            cb[sss]=cb[pp];
                            b[sss]=b[pp];
                            System.out.println("\n Bill \n");
                            System.out.println(sss +"\t"+a[pp]+ "\t"+ cb[pp] +"\t" +b[pp] );
                            sss++;
                        }

                    }
                    System.out.println("\n  \n");

                    System.out.println("TOTAL       "+sum);
                    zz=zz-1;
                }
                else
                    break k;
            }while(xx.equalsIgnoreCase("y"));
        }
        else
            exit();
    }

    //closing input
    void tv()throws IOException

    {
        do

        {
            System.out.println("               ");
            System.out.println("check out the new products ");
            System.out.println("               ");
            System.out.println("WHICH WOULD YOU LIKE TO BUY ");
            System.out.println("               ");
            System.out.println("OPTIONS ARE:");
            System.out.println("1.SONY");
            System.out.println("2.ONIDA");
            System.out.println("3.SAMSUNG");
            System.out.println("                            ");
            System.out.println("........ ENTER YOUR CHOICE........");
            choice=Integer.parseInt(buf.readLine());
            switch(choice)

            {

                case 1:

                do

                {

                    sony();

                    System.out.println("\n Type 'c' to continue shopping in OR PRESS ANY KEY TO EXIT from sony ");

                    vvv=buf.readLine();

                }

                while(vvv.equalsIgnoreCase("c"));
                break;

                case 2:
                do

                {
                    onida();

                    System.out.println("\n Type 'c' to continue shopping in OR PRESS ANY KEY TO EXIT from onida ");
                    vvv=buf.readLine();

                }while(vvv.equalsIgnoreCase("c"));
                break;
                case 3:
                do

                {
                    samsung();
                    System.out.println("\n Type 'c' to continue shopping in OR PRESS ANY KEY TO EXIT from Samsung");
                    vvv=buf.readLine();

                }while(vvv.equalsIgnoreCase("c"));
                break;

            }
            System.out.println("\n Type ' c ' to continue shopping in OR PRESS ANY KEY TO EXIT from TV ");
            vvv=buf.readLine();
            if(vvv.equalsIgnoreCase("c"))
                tv();
            else
                run();

        }while(vvv.equalsIgnoreCase("c"));

    }

    public void sony()throws IOException
    {
        System.out.println("options available in sony ");
        System.out.println("                                               ");
        System.out.println("1.KDL50W829");
        System.out.println("2.KLV40BX400");
        System.out.println("3.KLV26BX300");
        System.out.println("                            ");
        System.out.println("........ ENTER YOUR CHOICE........");
        chsony=Integer.parseInt(buf.readLine());
        switch(chsony)
        {
            case 1:
            System.out.println("KDL50W829  ");
            System.out.println("50 Inch");
            System.out.println("screen type flat ");
            System.out.println("3D led tv full HD");
            System.out.println("COST-50000  ");
            System.out.println("Would you like to buy");
            System.out.println("Enter your choice y/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println("Thank you for buying " );
                a[++zz]= "KDL50W829";
                b[zz]=50000;
                cb[zz]=1;
            }
            break;
            case 2:
            System.out.println("KLV40BX400  ");
            System.out.println("BRAVIA LED TV ");
            System.out.println("40 Inch");
            System.out.println(" full HD");
            System.out.println("COST-42000  ");
            System.out.println("Would you like to buy");
            System.out.println("Enter your choice y/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println("Thank you for buying " );
                a[++zz]= "KLV40BX400";
                b[zz]=42000;
                cb[zz]=1;
            }
            break;
            case 3:
            System.out.println("KLV26BX300 ");
            System.out.println("26 Inch");
            System.out.println("BRAVIA LED TV ");
            System.out.println(" HD");
            System.out.println("COST-25000  ");
            System.out.println("Would you like to buy");
            System.out.println("Enter your choice y/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println("Thank you for buying " );
                a[++zz]= "KLV26BX300";
                b[zz]=25000;
                cb[zz]=1;
            }
            break;

        }
    }

    public void onida()throws IOException
    {
        System.out.println("1.ONIDA CHROME ");

        System.out.println("2.ONIDA CHROMED ");
        System.out.println("3.ONIDALEO24HRBLED ");
        System.out.println("                            ");
        System.out.println("........ ENTER YOUR CHOICE........");
        chonida=Integer.parseInt(buf.readLine());

        switch(chonida)
        {
            case 1:
            System.out.println("ONIDA CHROME ");
            System.out.println("50 Inch");
            System.out.println(" LED TV ");
            System.out.println("FULL HD");
            System.out.println("COST-49999  ");
            System.out.println("Would you like to buy");
            System.out.println("Enter your choice y/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println("Thank you for buying " );
                a[++zz]= "ONIDA CHROME";
                b[zz]=49999;
                cb[zz]=1;
            }
            break;

            case 2:

            System.out.println("ONIDA CHROMED ");
            System.out.println("32 INCH");
            System.out.println("LCD TV");
            System.out.println(" USB CONNECTIVITY");
            System.out.println("COST-29999");
            System.out.println("Would you like to buy");
            System.out.println("Enter your choice y/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println("Thank you for buying " );
                a[++zz]= "ONIDA CHROMED";
                b[zz]=29999;
                cb[zz]=1;
            }
            break;
            case 3:
            System.out.println("KLV40BX400  ");
            System.out.println("BRAVIA LED TV ");
            System.out.println("40 Inch");
            System.out.println(" full HD");
            System.out.println("COST-42000  ");
            System.out.println("Would you like to buy");
            System.out.println("Enter your choice y/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println("Thank you for buying " );
                a[++zz]= "KLV40BX400";
                b[zz]=42000;
                cb[zz]=1;
            }
            break;
            case 4:
            System.out.println("KLV40BX400  ");
            System.out.println("BRAVIA LED TV ");
            System.out.println("40 Inch");
            System.out.println(" full HD");
            System.out.println("COST-42000  ");
            System.out.println("Would you like to buy");
            System.out.println("Enter your choice y/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println("Thank you for buying " );
                a[++zz]= "KLV40BX400";
                b[zz]=42000;
                cb[zz]=1;
            }
            break;
            case 5:
            System.out.println("ONIDALEO24HRBLED  ");
            System.out.println("24INCH ");
            System.out.println("LED TV");
            System.out.println(" FLAT SCREEN");
            System.out.println("COST-12127  ");
            System.out.println("Would you like to buy");
            System.out.println("Enter your choice y/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println("Thank you for buying " );
                a[++zz]= "ONIDALEO24HRBLED";
                b[zz]=12127;
                cb[zz]=1;
            }
            break;
        }
    }

    public void samsung()throws IOException
    {
        System.out.println("options available in Samsung ");
        System.out.println("                                                          ");
        System.out.println("1.SAMSUNG46EH4003");
        System.out.println("2.SAMSUNG43EH4254");
        System.out.println("3SAMSUNG40EH4025");
        System.out.println("                                                    ");
        System.out.println("ENTER YOUR CHOICE");
        chsamsung=Integer.parseInt(buf.readLine());
        switch(chsamsung)
        {
            case 1:
            System.out.println("SAMSUNG46EH4003  ");
            System.out.println("46INCH ");
            System.out.println("LED TV");
            System.out.println(" PLASMA PLANEL");
            System.out.println("COST-85360  ");
            System.out.println("Would you like to buy");
            System.out.println("Enter your choice y/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println("Thank you for buying " );
                a[++zz]= "SAMSUNG46EH4003";
                b[zz]=85360;
                cb[zz]=1;
            }
            break;
            case 2:
            System.out.println("SAMSUNG43EH4254  ");
            System.out.println("43INCH ");
            System.out.println("LED TV");
            System.out.println(" PLASMA PLANEL");
            System.out.println("COST-33389  ");
            System.out.println("Would you like to buy");
            System.out.println("Enter your choice y/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println("Thank you for buying " );
                a[++zz]= "SAMSUNG43EH4254";
                b[zz]=33389;
                cb[zz]=1;
            }
            break;
            case 3:
            System.out.println("SAMSUNG40EH4025  ");
            System.out.println("40INCH ");
            System.out.println("LED TV");
            System.out.println(" CONNECTIVITIES AVAILABLE");
            System.out.println("COST-48750  ");
            System.out.println("Would you like to buy");
            System.out.println("Enter your choice y/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println("Thank you for buying " );
                a[++zz]= "SAMSUNG40EH4025";
                b[zz]=48750;
                cb[zz]=1;
            }
            break;

        }
    }

    void oven()throws IOException
    {
        do
        {
            System.out.println("                                           " );
            System.out.println("       check out the new products         " );
            System.out.println("                                           " );
            System.out.println("    WHICH WOULD YOU LIKE TO BUY   ");
            System.out.println("                                           " );
            System.out.println("  OPTIONS  ARE  " );
            System.out.println("  1.ONIDA  " );
            System.out.println("  2.SAMSUNG" );
            System.out.println("  3.PHILIP   " );
            System.out.println("                                                      " );
            System.out.println("      ENTER YOUR CHOICE    " );
            choice=Integer.parseInt(buf.readLine());
            switch(choice)
            {
                case 1:
                do
                {
                    onida();
                    {
                        System.out.println(" \n Type 'c' to continue shopping in OR PRESS ANY KEY TO EXIT from onida   " );
                        vvv=buf.readLine();
                    }
                } while(vvv.equalsIgnoreCase("c"));
                break;

                case 2:
                do
                {
                    samsungo();
                    {
                        System.out.println(" \n Type 'c' to continue shopping in OR PRESS ANY KEY TO EXIT from samsung  " );
                        vvv=buf.readLine();
                    }
                }  while(vvv.equalsIgnoreCase("c"));
                break;
                case 3:
                do
                {
                    philips();
                    {
                        System.out.println(" \n Type 'c' to continue shopping in OR PRESS ANY KEY TO EXIT from onida   " );
                        vvv=buf.readLine();
                    }
                } while(vvv.equalsIgnoreCase("c"));
                break;
                default:
                System.out.println("invalid choice");
            }
            System.out.println(" \n Type 'c' to continue shopping in OR PRESS ANY KEY TO EXIT from oven   " );
            vvv=buf.readLine();
            if(vvv.equalsIgnoreCase("c"))
                oven();
            else
                run();
        } while(vvv.equalsIgnoreCase("c"));

    }

    public void onidao()throws IOException
    {
        System.out.println(" options available in onida ");
        System.out.println("                                                             ");
        System.out.println(" 1.BLACK BEAUTY PB 28");
        System.out.println(" 2.CLASSIC PC 23");
        System.out.println(" 3.DIAMOND PC 23");
        System.out.println("                                                            ");
        System.out.println(" ENTER YOUR CHOICE ");
        chsony=Integer.parseInt(buf.readLine());
        switch(chsony)
        {
            case 1:
            System.out.println(" BLACK BEAUTY PB 28 ");
            System.out.println(" COST-13000");
            System.out.println(" Would you like to buy ");
            System.out.println(" Enter your choicey/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println(" Thank you for buying ");
                a[++zz]="BLACK BEAUTY PB 28";
                b[zz]=13999;
                cb[zz]=1;
                break;
            }
            case 2:
            System.out.println(" CLASSIC PC 23 ");
            System.out.println(" COST-10000");
            System.out.println(" Would you like to buy ");
            System.out.println(" Enter your choicey/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println(" Thank you for buying ");
                a[++zz]="CLASSIC PC 23";
                b[zz]=10000;
                cb[zz]=1;
                break;
            }
            case 3:
            System.out.println(" DIAMOND PC 23 ");
            System.out.println(" COST-14500");
            System.out.println(" Would you like to buy ");
            System.out.println(" Enter your choicey/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println(" Thank you for buying ");
                a[++zz]="DIAMOND PC 23";
                b[zz]=14500;
                cb[zz]=1;
                break;

            }
            default:
            System.out.println("invalid case");
        }
    }

    public void samsungo()throws IOException
    {
        System.out.println(" options available in samsung ");
        System.out.println("                                                             ");
        System.out.println(" 1.GRILL GW732KD");
        System.out.println(" 2.ifP20SC2");
        System.out.println(" 3.CONVENTION GET4JDCR");
        System.out.println("                                                            ");
        System.out.println(" ENTER YOUR CHOICE ");
        chsony=Integer.parseInt(buf.readLine());

        switch(chsony)
        {
            case 1:
            System.out.println("GRILL GW732KD");
            System.out.println(" COST-6580");
            System.out.println(" Would you like to buy ");
            System.out.println(" Enter your choicey/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println(" Thank you for buying ");
                a[++zz]=" GRILL GW732KD";
                b[zz]=6580;
                cb[zz]=1;
                break;
            }
            case 2:
            System.out.println(" ifP20SC2");
            System.out.println(" COST-8460");
            System.out.println(" Would you like to buy ");
            System.out.println(" Enter your choicey/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println(" Thank you for buying ");
                a[++zz]=" ifP20SC2";
                b[zz]=8460;
                cb[zz]=1;
                break;
            }
            case 3:
            System.out.println(" CONVENTION GET4JDCR");
            System.out.println(" COST-10250");
            System.out.println(" Would you like to buy ");
            System.out.println(" Enter your choicey/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println(" Thank you for buying ");
                a[++zz]=" CONVENTION GET4JDCR";
                b[zz]=10250;
                cb[zz]=1;
            }
            break;
            default:
            System.out.println("invalid case");
        }
    }

    public void philips()throws IOException
    {
        System.out.println(" options available in philips ");
        System.out.println("                                                             ");
        System.out.println(" 1.CONVENTION MC2143CD21L");
        System.out.println(" 2.POWER GRILL MS2021CN");
        System.out.println(" 3.GRILL MH2043DW");
        System.out.println("                                                            ");
        System.out.println(" ENTER YOUR CHOICE ");
        chsony=Integer.parseInt(buf.readLine());
        switch(chsony)
        {
            case 1:
            System.out.println("CONVENTION MC2143CD21L");
            System.out.println(" COST-9750");
            System.out.println(" Would you like to buy ");
            System.out.println(" Enter your choicey/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println(" Thank you for buying ");
                a[++zz]=" CONVENTION MC2143CD21L";
                b[zz]=9750;
                cb[zz]=1;
                break;
            }
            case 2:
            System.out.println(" POWER GRILL MS2021CN");
            System.out.println(" COST-5025");
            System.out.println(" Would you like to buy ");
            System.out.println(" Enter your choicey/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println(" Thank you for buying ");
                a[++zz]=" POWER GRILL MS2021CN";
                b[zz]=5025;
                cb[zz]=1;
                break;
            }
            case 3:
            System.out.println(" GRILL MH2043DW");
            System.out.println(" COST-7060");
            System.out.println(" Would you like to buy ");
            System.out.println(" Enter your choicey/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println(" Thank you for buying ");
                a[++zz]=" GRILL MH2043DW";
                b[zz]=7060;
                cb[zz]=1;
            }
            break;
            default:
            System.out.println("invalid case");
        }
    }

    public void main(String args[])throws IOException
    {
        run();
    }

    public void exit()
    {
        System.out.println(" thanks for coming have a good day ");
    }
}

