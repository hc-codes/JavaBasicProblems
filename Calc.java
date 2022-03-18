import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Calc extends Applet implements ActionListener
{
    String cmd[]={"+","-","*","/","=","C","x^2",".","sin","cos","tan","log","cot","sec","cosec"};
    double pv=0;
    String op="";
    Button b[]=new Button[25];
    TextField t1=new TextField(10);
    public void init()
    {
        setLayout(new BorderLayout());
        add(t1,"North");
        t1.setText("0");
        Panel p=new Panel();
        p.setLayout(new GridLayout(5,5));
        for(int i=0;i<25;i++)
        {
            if(i<10)
            b[i]=new Button(String.valueOf(i));
            else
            if(i<20)
            b[i]=new Button(cmd[i%10]);
            else
            b[i]=new Button(cmd[i%10+10]);
            b[i].setFont(new Font("Arial",Font.BOLD,25));
            p.add(b[i]);
            add(p,"Center");
            b[i].addActionListener(this);
        }
    }
    public void actionPerformed(ActionEvent ae)
    {
        double res=0;
        String cap=ae.getActionCommand();
        double cv=Double.parseDouble(t1.getText());
        if(cap.equals("C"))
        {
            t1.setText("0");
            pv=0;
            cv=0;
            res=0;
            op="";
        }
        else
        if(cap.equals("="))
        {
            res=cv;
            if(op=="+")
            res=pv+cv;
            else 
            if(op=="-")
            res=pv-cv;
            else
            if(op=="*")
            res=pv*cv;
            else
            if(op=="/")
            res=pv/cv;
            else
            if(op=="x^2")
            res=pv*pv;
             else
            if(op==".")
            res=(pv+cv/10);
            else
            if(op=="sin")
            res=Math.sin(pv);
            else
            if(op=="cos")
            res=Math.cos(pv);
            else
            if(op=="tan")
            res=Math.tan(pv);
             else
            if(op=="log")
            res=Math.log(pv);
             else
            if(op=="cot")
            res=1/(Math.tan(pv));
             else
            if(op=="sec")
            res=1/(Math.cos(pv));
             else
            if(op=="cosec")
            res=1/(Math.sin(pv));
            t1.setText(String.valueOf(res));
        }
        else 
        if(cap.equals("+")||cap.equals("-")||cap.equals("*")||cap.equals("/")||cap.equals("x^2")||cap.equals("x^3")||cap.equals("sin")||cap.equals("cos")||cap.equals("tan")||cap.equals("cot")||cap.equals("sec")||cap.equals("cosec"))
        {
            pv=cv;op=cap;t1.setText("0");
        }
        else{
            double v=cv*10+Double.parseDouble(cap);
            t1.setText(String.valueOf(v));
        }
    }
}