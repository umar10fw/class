package project;
import java.awt.*;
import java.awt.event.*;

class MyEventDemo_Four extends Frame{
	Button b;
	MyEventDemo_Four(){
	setSize(300,300);
	setLayout(new FlowLayout());
	b=new Button("Click Here");
	add(b);
	b.addActionListener(new ActionListener(){

	public void actionPerformed(ActionEvent e){

		System.out.println("pressed anonymous demo");

	}


	});

	addWindowListener(new WindowAdapter(){

	public void windowClosing(WindowEvent e){
	System.exit(0);

	}


	});
	setVisible(true);
	}

	public static void main(String p[]){

	new MyEventDemo_Four();

	}
}

