package project;
import java.awt.*;
import java.awt.event.*;

class MyEventDemo_Three extends Frame{
	Button b;
	MyEventDemo_Three(){
	setSize(300,300);
	setLayout(new FlowLayout());
	b=new Button("Click Here");
	add(b);
	b.addActionListener(new MyListener());
	setVisible(true);
	}
class MyListener implements ActionListener{

public void actionPerformed(ActionEvent i){

System.out.println("button pressedddddddd");


}

}
	public static void main(String p[]){

	new MyEventDemo_Three();

	}
}

