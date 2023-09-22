package project;
import java.awt.*;

class Calculator extends Frame{
	
    TextField tf;
    Panel p;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24;

    Calculator(){

        setLayout( new BorderLayout());
        tf = new TextField();
        p = new Panel();
        add(tf, BorderLayout.NORTH);
        p.setLayout(new GridLayout(6, 4));
        add(p, BorderLayout.CENTER);

        b1=new Button("%");
        b2=new Button("CE");
        b3=new Button("C");
        b4=new Button("Back");
        b5=new Button("1/x");
        b6=new Button("x^2");
        b7=new Button("2x");
        b8=new Button("/");
        b9=new Button("7");
        b10=new Button("8");
        b11=new Button("9");
        b12=new Button("x");
        b13=new Button("4");
        b14=new Button("5");
        b15=new Button("6");
        b16=new Button("-");
        b17=new Button("1");
        b18=new Button("2");
        b19=new Button("3");
        b20=new Button("+");
        b21=new Button("+/-");
        b22=new Button("0");
        b23=new Button(".");
        b24=new Button("=");

        p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);p.add(b6);
        p.add(b7);p.add(b8);p.add(b9);p.add(b10);p.add(b11);p.add(b12);
        p.add(b13);p.add(b14);p.add(b15);p.add(b16);p.add(b17);p.add(b18);
        p.add(b19);p.add(b20);p.add(b21);p.add(b22);p.add(b23);p.add(b24);


        Font myFont = new Font("", Font.BOLD,16);
        b1.setFont(myFont);
        b2.setFont(myFont);
        b3.setFont(myFont);
        b4.setFont(myFont);
        b8.setFont(myFont);
        b12.setFont(myFont);
        b16.setFont(myFont);
        b20.setFont(myFont);
        b24.setFont(myFont);
        b23.setFont(myFont);

        
        setTitle("Simple Calculator");
        setSize(300, 500);
        setVisible(true);
    }
    

	public static void main(String p[]){
        new Calculator();
	}

    
}



