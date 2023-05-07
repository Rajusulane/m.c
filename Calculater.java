import java.awt.*;
import java.awt.event.*;

class Calculater
{
    public static void main(String ags[])
    {

        Raju Robj=new Raju(400,500,"Raju");

    }
}

class Raju extends WindowAdapter implements ActionListener
{

    public Frame fobj;
    public Button add,sub,mul,div;
    public TextField t1,t2;
    public Label lobj;
    public Integer no1,no2;

    public Raju (int width,int height,String title)
    {

        fobj=new Frame(title);
        fobj.setSize(width,height);

        fobj.addWindowListener(this);

        add=new Button("ADD");
        sub=new Button("SUB");
        mul=new Button("MUL");
        div=new Button("DIV");

        t1=new TextField();
        t2=new TextField();

        add.setBounds(10,280,80,40);//x,y,w,h
        sub.setBounds(100,280,80,40);//X,Y,W,H
        mul.setBounds(190,280,80,40);
        div.setBounds(290,280,80,50);//X,y,W,H

        t1.setBounds(70,100,100,40);
        t2.setBounds(200,100,100,50);

        fobj.add(add);
        fobj.add(sub);
        fobj.add(mul);
        fobj.add(div);

        fobj.add(t1);
        fobj.add(t2);

        lobj=new Label();
        lobj.setBounds(200,25,250,100);

        fobj.add(lobj);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

       fobj.setLayout(null);
       fobj.setVisible(true);
    }
public void windowClosing(WindowEvent obj)//event handler for frame

{

    System.exit(0);
}

public void actionPerformed(ActionEvent aobj)
{
try
{
no1=Integer.parseInt(t1.getText()); 
no2=Integer.parseInt(t2.getText());

if(aobj.getSource()==add)
{

    lobj.setText("Addition is "+(no1+no2));

}
 else if(aobj.getSource()==sub)
{

    lobj.setText("Substaction is "+(no1-no2));
}
else if(aobj.getSource()==mul)
{
lobj.setText("Multiplication is "+(no1*no2));

}
else if(aobj .getSource()==div)
{
    lobj.setText("Divison is "+(no1/no2));
}
}
catch(Exception eobj)
{

}
}
}
    

    
