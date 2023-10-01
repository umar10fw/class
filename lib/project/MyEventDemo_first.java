package project;
import java.awt.*;
import java.awt.event.*;

class MyEventDemo_first extends Frame implements ActionListener{
	Button b;
	MyEventDemo_first(){
	setSize(300,300);
	setLayout(new FlowLayout());
	b=new Button("Click Here");
	add(b);
	b.addActionListener(this);
	setVisible(true);
	}

public void actionPerformed(ActionEvent i){
System.out.println("button pressed");
}

	public static void main(String p[]){

	new MyEventDemo_first();

	}

}