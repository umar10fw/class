package project;
import java.awt.*;
import java.awt.event.*;

class MyEventDemo_Second extends Frame{
	Button b;
	MyEventDemo_Second(){
	setSize(300,300);
	setLayout(new FlowLayout());
	b=new Button("Click Here");
	add(b);
	b.addActionListener(new MyListener());
	setVisible(true);
	}

	public static void main(String p[]){

	MyEventDemo_Second obj=new MyEventDemo_Second();

	}
}

class MyListener implements ActionListener{

public void actionPerformed(ActionEvent i){

System.out.println("button pressedddddddd");


	}
}