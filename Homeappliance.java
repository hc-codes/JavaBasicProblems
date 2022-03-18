import java.io.*;
class Homeappliance
{
    static int choice=0,chphilips=0,chonida=0,chsamsung=0,chsony,zz=1,sum,gg,k,A=1,B,C=1,D=1;

    String c,choic,chhh,vvv,cod,xx,vv;
    String a[]=new String[100];
    int b[]=new int[100];
    int cb[]=new int[100];
    BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));

    public void run()throws IOException
    {
        System.out.println("##########___________############ ");
        System.out.println("WELCOME TO MKKS HOME APPLIANCES ");
        System.out.println("##########___________############ ");
        System.out.println("WISH YOU NICE SHOPPING EXPERIANCE ");
        System.out.println("WHAT WOULD LIKE TO BUY ??? ");
        System.out.println("............................");
        System.out.println("\n");
        do
        {
            System.out.println("1.TELEVISION");
            System.out.println("2.OVEN");
            System.out.println("3.IF YOU WANT TO ADD OR REMOVE ANY PRODUCTS OR TO PRINT THE BILL PRESS 3");
            System.out.println("ENTER THE CORRESPONDING NUMBER OF THE STORE YOU WANT TO TAKE A VISIT AND SHOP ");
            int ch=Integer.parseInt(buf.readLine());
            if(ch==1)
                tv();
            else
            if(ch==2)
                oven();

            else
                System.out.println("\n Type 'c' to continue buying or press any other key to exit from MAINSHOP \n");
            c=buf.readLine();
            if(c.equalsIgnoreCase("c"))
                k=1;
            else
                break;
        } while(c.equalsIgnoreCase("c"));

        System.out.println("thanks for coming to our shop & we think you got things as your desire");
        for(int ss=1;ss<=zz;ss++)
        {
            sum=sum+b[ss];
        }
        for(int i=0;i<2;i++);
        System.out.println("##########............############ ");
        System.out.println("\n Bill \n");
        System.out.println("S.NO \t ITEM \t  NO.OF ITEM \t         COST ");
        for(int pp=1;pp<=zz;pp++)
        {
            System.out.println(pp +"\t"+ a[pp] +"\t"+ cb[pp] +"\t"+ b[pp] );
        }
        System.out.println("\n");
        System.out.println("TOTAL           "+sum);

        O: do

        {
            System.out.println("\n IF YOU WANT TO REMOVE ANY ITEM FROM THE CHART PRESS 'Y' OTHERWISE PRESS ANY OTHER KEY \n");
            xx=buf.readLine();

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
                System.out.println("\n             Bill \n");
                System.out.println("S.NO \t ITEM \t NO.OF ITEM \t COST ");
                int sss=1;
                for(int pp=1;pp<=zz;pp++)
                {
                    if(pp!=gg)
                    {
                        a[sss]=a[pp];
                        cb[sss]=cb[pp];
                        b[sss]=b[pp];

                        System.out.println(sss +"\t"+a[pp]+ "\t"+ cb[pp] +"\t" +b[pp] );
                        sss++;
                    }

                }
                System.out.println("\n  \n");
                System.out.println("==================================================");
                System.out.println("TOTAL       "+sum);
                zz=zz-1;
            }
            else
                break O;

        }while(xx.equalsIgnoreCase("y"));

        System.out.println(" THANK YOU FOR VISITING OUR SHOP HAVE A NICE DAY ");
        System.out.println(" VISIT OUR SHOP AGAIN............................ ");
        System.out.println("**************************************************");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

    }
    //closing input
    public void tv()throws IOException
    {
        do
        {
            System.out.println("    ############################################    " );
            System.out.println("    CHECK OUT THE NEW PRODUCTS OF TV           " );
            System.out.println("                                                    " );
            System.out.println("    WHICH WOULD YOU LIKE TO BUY                      ");
            System.out.println("    ===========================                     " );
            System.out.println("    PRODUCTS AVAILABLE IN TV ARE .................. " );
            System.out.println("    1.ONIDA  " );
            System.out.println("    2.SAMSUNG" );
            System.out.println("    3.PHILIPS   " );
            System.out.println("                                                      " );
            System.out.println("    ENTER YOUR CHOICE    " );
            choice=Integer.parseInt(buf.readLine());
            switch(choice)
            {
                case 1:
                do
                {
                    onida();
                    {
                        System.out.println(" \n Type ‘c’ TO CONTINUE SHOPPING IN OR PRESS ANY KEY TO EXIT FROM ONIDA" );
                        vvv=buf.readLine();
                    }
                } while(vvv.equalsIgnoreCase("c"));
                break;

                case 2:
                do
                {
                    samsung();
                    {
                        System.out.println(" \n Type ‘c’ TO CONTINUE SHOPPING IN OR PRESS ANY KEY TO EXIT FROM SAMSUNG" );
                        vvv=buf.readLine();
                    }
                }  while(vvv.equalsIgnoreCase("c"));
                break;
                case 3:
                do
                {
                    philips();
                    {
                        System.out.println(" \n Type ‘c’ TO CONTINUE SHOPPING IN OR PRESS ANY KEY TO EXIT FROM PHILIPS   " );
                        vvv=buf.readLine();
                    }
                } while(vvv.equalsIgnoreCase("c"));
                break;
                default:
                System.out.println("INVALID CHOICE.................");
            } 
            System.out.println(" \n Type ‘c’ TO CONTINUE SHOPPING IN OR PRESS ANY KEY TO EXIT FROM TV  " );
            vvv=buf.readLine();
            if(vvv.equalsIgnoreCase("c"))
                tv();
            else
                run();
        } while(vvv.equalsIgnoreCase("c"));

    }

    public void onida()throws IOException
    {
        System.out.println("PRODUCTS AVAILABLE IN ONIDA ARE........................ ");
        System.out.println("                                                          ");
        System.out.println("1.ONIDA CHROME ");
        System.out.println("2.ONIDA CHROMED ");
        System.out.println("3.ONIDA LEO24HRB LED ");
        System.out.println("                            ");
        System.out.println("........ ENTER YOUR CHOICE........");
        chonida=Integer.parseInt(buf.readLine());
        B=1;
        switch(chonida)
        {
            case 1:
            B=1;
            
            System.out.println("                            ");
            System.out.println("ONIDA CHROME ");
            System.out.println("50 Inch");
            System.out.println("LED TV ");
            System.out.println("FULL HD");
            System.out.println("COST =RS : 50000  ");
            System.out.println("Would you like to buy");
            System.out.println("Enter your choice y/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println("Thank you for buying " );
                a[B]= "ONIDA CHROME";
                b[zz]=49999;
                cb[zz]=A;
                A++;
            }
            break;

            case 2:
            B=2;
            System.out.println("                            ");
            System.out.println("ONIDA CHROMED ");
            System.out.println("32 INCH");
            System.out.println("LCD TV");
            System.out.println(" USB CONNECTIVITY");
            System.out.println("COST =RS : 29990");
            System.out.println("Would you like to buy");
            System.out.println("Enter your choice y/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println("Thank you for buying " );
                a[B]= "ONIDA CHROMED";
                b[zz]=29999;
                cb[++zz]=C;
                C++;
            }
            break;
            case 3:
            B=3;
            System.out.println("                            ");
            System.out.println("KLV40BX400  ");
            System.out.println("BRAVIA LED TV ");
            System.out.println("40 Inch");
            System.out.println("FULL HD");
            System.out.println("COST =RS: 42000  ");
            System.out.println("Would you like to buy");
            System.out.println("Enter your choice y/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println("Thank you for buying " );
                a[B]= "KLV40BX400";
                b[zz]=42000;
                cb[++zz]=D;
                D++;
            }
            break;

        }
    }

    public void samsung()throws IOException
    {
        System.out.println("PRODUCTS AVAILABLE IN SAMSUNG ARE........................ ");
        System.out.println("                                                          ");
        System.out.println("1.SAMSUNG46EH4003");
        System.out.println("2.SAMSUNG43EH4254");
        System.out.println("3.SAMSUNG40EH4025");
        System.out.println("                                                    ");
        System.out.println("ENTER YOUR CHOICE");
        chsamsung=Integer.parseInt(buf.readLine());
        switch(chsamsung)
        {
            case 1:
            System.out.println("                            ");
            System.out.println("SAMSUNG46EH4003  ");
            System.out.println("46INCH ");
            System.out.println("LED TV");
            System.out.println("PLASMA PLANEL");
            System.out.println("COST =RS : 85360  ");
            System.out.println("Would you like to buy");
            System.out.println("Enter your choice y/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println("Thank you for buying " );
                a[++zz]= "SAMSUNG46EH4003";
                b[++zz]=85360;
                cb[++zz]++;
            }
            break;
            case 2:
            System.out.println("                            ");
            System.out.println("SAMSUNG43EH4254  ");
            System.out.println("43INCH ");
            System.out.println("LED TV");
            System.out.println("PLASMA PLANEL");
            System.out.println("COST =RS : 33380  ");
            System.out.println("Would you like to buy");
            System.out.println("Enter your choice y/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println("Thank you for buying " );
                a[++zz]= "SAMSUNG43EH4254";
                b[++zz]=33389;
                cb[++zz]++;
            }
            break;
            case 3:
            System.out.println("                            ");
            System.out.println("SAMSUNG40EH4025  ");
            System.out.println("40INCH ");
            System.out.println("LED TV");
            System.out.println("CONNECTIVITIES AVAILABLE");
            System.out.println("COST =RS : 48750  ");
            System.out.println("Would you like to buy");
            System.out.println("Enter your choice y/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println("Thank you for buying " );
                a[++zz]= "SAMSUNG40EH4025";
                b[++zz]=48750;
                cb[++zz]++;
            }
            break;
            default:
            System.out.println("INVALID CHOICE.............. " );
        }
    }

    public void philips()throws IOException
    {
        System.out.println("PRODUCTS AVAILABLE IN PHILIPS ARE........................ ");
        System.out.println("                                                          ");
        System.out.println("1.KDL50W829");
        System.out.println("2.KLV40BX400");
        System.out.println("3.KLV26BX300");
        System.out.println("                            ");
        System.out.println("........ ENTER YOUR CHOICE........");
        chphilips=Integer.parseInt(buf.readLine());
        switch(chphilips)
        {
            case 1:
            System.out.println("                            ");
            System.out.println("KDL50W829  ");
            System.out.println("50 Inch");
            System.out.println("screen type flat ");
            System.out.println("3D led Tv full HD");
            System.out.println("COST =RS : 50000  ");
            System.out.println("Would you like to buy");
            System.out.println("Enter your choice y/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println("Thank you for buying " );
                a[++zz]= "KDL50W829";
                b[++zz]=50000;
                cb[++zz]++;
            }
            break;
            case 2:
            System.out.println("                            ");
            System.out.println("KLV40BX400  ");
            System.out.println("BRAVIA LED TV ");
            System.out.println("40 Inch");
            System.out.println("full HD");
            System.out.println("COST =RS : 42000  ");
            System.out.println("Would you like to buy");
            System.out.println("Enter your choice y/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println("Thank you for buying " );
                a[++zz]= "KLV40BX400";
                b[++zz]=42000;
                cb[++zz]++;
            }
            break;
            case 3:
            System.out.println("                            ");
            System.out.println("KLV26BX300 ");
            System.out.println("26 Inch");
            System.out.println("BRAVIA LED TV ");
            System.out.println("HD");
            System.out.println("COST =RS : 25000  ");
            System.out.println("Would you like to buy");
            System.out.println("Enter your choice y/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println("Thank you for buying " );
                a[++zz]= "KLV26BX300";
                b[++zz]=25000;
                cb[++zz]++;
            }
            break;
            default:
            System.out.println("INVALID CHOICE..................... ");
        }
    }

    public void oven()throws IOException
    {
        do
        {
            System.out.println("    ############################################    " );
            System.out.println("       CHECK OUT THE NEW PRODUCTS OF OVEN           " );
            System.out.println("                                                    " );
            System.out.println("    WHICH WOULD YOU LIKE TO BUY                      ");
            System.out.println("    ===========================                     " );
            System.out.println("  PRODUCTS AVAILABLE IN OVEN ARE .................. " );
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
                        System.out.println(" \n Type ‘c’ TO CONTINUE SHOPPING IN OR PRESS ANY KEY TO EXIT FROM ONIDA   " );
                        vvv=buf.readLine();
                    }
                } while(vvv.equalsIgnoreCase("c"));
                break;

                case 2:
                do
                {
                    samsungo();
                    {
                        System.out.println(" \n Type ‘c’ TO CONTINUE SHOPPING IN OR PRESS ANY KEY TO EXIT FROM SAMSUNG  " );
                        vvv=buf.readLine();
                    }
                }  while(vvv.equalsIgnoreCase("c"));
                break;
                case 3:
                do
                {
                    philips();
                    {
                        System.out.println(" \n Type ‘c’ TO CONTINUE SHOPPING IN OR PRESS ANY KEY TO EXIT FROM PHILIPS  " );
                        vvv=buf.readLine();
                    }
                } while(vvv.equalsIgnoreCase("c"));
                break;

            }
            System.out.println(" \n Type ‘c’ TO CONTINUE SHOPPING IN OR PRESS ANY KEY TO EXIT FROM OVEN " );
            vvv=buf.readLine();
            if(vvv.equalsIgnoreCase("c"))
                oven();
            else
                run();
        } while(vvv.equalsIgnoreCase("c"));

    }

    public void onidao()throws IOException
    {
        System.out.println("  OPTIONS AVAILABLE IN ONIDA OVENS ARE....................... ");
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
            System.out.println("                            ");
            System.out.println(" BLACK BEAUTY PB 28 ");
            System.out.println(" COST =RS :13000");
            System.out.println(" Would you like to buy ");
            System.out.println(" Enter your choice y/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println(" Thank you for buying ");
                a[++zz]="BLACK BEAUTY PB 28";
                b[++zz]=13999;
                cb[++zz]++;
                break;
            }
            case 2:
            System.out.println("                            ");
            System.out.println(" CLASSIC PC 23 ");
            System.out.println(" COST =RS : 10000");
            System.out.println(" Would you like to buy ");
            System.out.println(" Enter your choicey/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println(" Thank you for buying ");
                a[++zz]="CLASSIC PC 23";
                b[++zz]=10000;
                cb[++zz]++;
                break;
            }
            case 3:
            System.out.println("                            ");
            System.out.println(" DIAMOND PC 23 ");
            System.out.println(" COST =RS : 14500");
            System.out.println(" Would you like to buy ");
            System.out.println(" Enter your choicey/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println(" Thank you for buying ");
                a[++zz]="DIAMOND PC 23";
                b[++zz]=14500;
                cb[++zz]++;
                break;

            }
            default:
            System.out.println("invalid case");
        }
    }

    public void samsungo()throws IOException
    {
        System.out.println(" OPTIONS AVAILABE IN SAMSUNG OVENS ARE...................... ");
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
            System.out.println("                            ");
            System.out.println("GRILL GW732KD");
            System.out.println(" COST =RS : 6580");
            System.out.println(" Would you like to buy ");
            System.out.println(" Enter your choicey/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println(" Thank you for buying ");
                a[++zz]=" GRILL GW732KD";
                b[++zz]=6580;
                cb[++zz]++;
                break;
            }
            case 2:
            System.out.println("                            ");
            System.out.println(" ifP20SC2");
            System.out.println(" COST =RS : 8460");
            System.out.println(" Would you like to buy ");
            System.out.println(" Enter your choicey/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println(" Thank you for buying ");
                a[++zz]=" ifP20SC2";
                b[++zz]=8460;
                cb[++zz]++;
                break;
            }
            case 3:
            System.out.println("                            ");
            System.out.println(" CONVENTION GET4JDCR");
            System.out.println(" COST =RS : 10250");
            System.out.println(" Would you like to buy ");
            System.out.println(" Enter your choicey/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println(" Thank you for buying ");
                a[++zz]=" CONVENTION GET4JDCR";
                b[++zz]=10250;
                cb[++zz]++;
            }
            break;
            default:
            System.out.println("INVALID CHOICE");
        }
    }

    public void philipsO()throws IOException
    {
        System.out.println(" OPTIONS AVAILABLE IN PHILIPS OVENS ARE....................... ");
        System.out.println("                                                             ");
        System.out.println(" 1.CONVENTION MC2143CD21L");
        System.out.println(" 2.POWER GRILL MS2021CN");
        System.out.println(" 3.GRILL MH2043DW");
        System.out.println("                                                            ");
        System.out.println(" ENTER YOUR CHOICE ");
        chphilips=Integer.parseInt(buf.readLine());
        switch(chphilips)
        {
            case 1:
            System.out.println("                            ");
            System.out.println(" CONVENTION MC2143CD21L");
            System.out.println(" COST =RS : 9750");
            System.out.println(" Would you like to buy ");
            System.out.println(" Enter your choice y/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println(" Thank you for buying ");
                a[++zz]=" CONVENTION MC2143CD21L";
                b[++zz]=9750;
                cb[++zz]++;

            }
            break;
            case 2:
            System.out.println("                            ");
            System.out.println(" POWER GRILL MS2021CN");
            System.out.println(" COST =RS : 5050");
            System.out.println(" Would you like to buy ");
            System.out.println(" Enter your choicey/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println(" Thank you for buying ");
                a[++zz]=" POWER GRILL MS2021CN";
                b[++zz]=5025;
                cb[++zz]++;

            }
            break;
            case 3:
            System.out.println("                            ");
            System.out.println(" GRILL MH2043DW");
            System.out.println(" COST =RS : 7000");
            System.out.println(" Would you like to buy ");
            System.out.println(" Enter your choicey/n ");
            cod=buf.readLine();
            if(cod.equalsIgnoreCase("y"))
            {
                System.out.println(" Thank you for buying ");
                a[++zz]=" GRILL MH2043DW";
                b[++zz]=7060;
                cb[++zz]++;
            }
            break;
            default:
            System.out.println("invalid case");
        }
    }
}

