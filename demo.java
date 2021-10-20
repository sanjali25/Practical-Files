import java.awt.*;
class Npanel extends Panel
{  Label lb1;
   Npanel()
   { lb1=new Label("BORDER LAYOUT DEMO");
     add(lb1);
      setBackground(new Color(255,255,255));
     }
}
class Cpanel extends Panel
{ Label lnum1, lnum2, lres;
  TextField tnum1, tnum2, tres;
  Cpanel()
   { lnum1=new Label("NUM1");
     lnum2=new Label("NUM3");
     lres=new Label("RESULT");
     tnum1=new TextField("10");
     tnum2=new TextField("20");
     tres=new TextField("30");
     setLayout(new GridLayout(3,2,10,10));
     add(lnum1);
     add(tnum1);
     add(lnum2);
     add(tnum2);
     add(lres);
     add(tres);
     tnum1.setBackground(new Color(255,255,255));
      tnum2.setBackground(new Color(255,255,255));
      tres.setBackground(new Color(255,255,255));
     lnum1.setForeground(new Color(0,0,0));
      lnum2.setForeground(new Color(0,0,0));
      lres.setForeground(new Color(0,0,0));
    }
} 
class Spanel extends Panel
{ Button cmdadd, cmdsub, cmdmul, cmddiv;
  Spanel()
  { cmdadd=new Button("+");
    cmdsub=new Button("-");
    cmdmul=new Button("*");
    cmddiv=new Button("/");
    setLayout(new GridLayout(1,4,5,5));
    add(cmdadd);
    add(cmdsub);
    add(cmdmul);
    add(cmddiv);
}
}
class Calculation extends Frame
{ 
   Npanel np;
   Cpanel cp;
   Spanel sp;
   Calculation(String S)
   { super(S);
     setLayout(new BorderLayout());
     np= new Npanel();
     cp=new Cpanel();
     sp=new Spanel();
     add(np,"North");
     add(cp,"Center");
     add(sp,"South");
      setBackground(new Color(0,0,255));
    np.setBackground(new Color(0,255,0));
     setVisible(true);
   }
}


class Exe
{  public static void main(String arg[])
   { Calculation c=new Calculation("BORDER LAYOUT ");
     c.setBounds(50,50,100,200);
   }
}