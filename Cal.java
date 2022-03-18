import java.io.DataInputStream;  
class Cal {
    public static void main(String args[])
    {       DataInputStream pt=new DataInputStream(System.in);    
        int x,y,z,ch;          
        try         {          
            System.out.println("Enter Value of X:");     
            x = Integer.parseInt(pt.readLine());          
            System.out.println("Enter Value of Y:");      
            y = Integer.parseInt(pt.readLine());
            System.out.println("1.Addition\n2.Subtraction \n3.Multiplication\n4.Division"); 
            System.out.println("Enter ur choice:"); 
            ch = Integer.parseInt(pt.readLine());       
            switch(ch)        
            {             
                case 1:      
                z = x + y;    
                System.out.println("The Addition is:"+z);    
                break;  
                case 2:    
                z = x - y;     
                System.out.println("The Subtraction  is:"+z);         
                break; 

                case 3:
                z = x * y;   
                System.out.println("The Multiplication  is:"+z); 
                break;
                case 4:    
                z = x / y;   
                System.out.println("The Division is:"+z);   
                break;   
                default: 
                System.out.println("Sorry Try  Again........."); 
                break;    
            } 
        }   
        catch(Exception e) 
        {    System.out.println("x.getmessage()");   
        }
    }
} 