package project;

// Button, TextArea,TextField
/// ATOMIc, MIDDELWARE, ROOT COMP 1: no layout,only add ,can not add other
// 2: can be adeded, can add others as well

import java.awt.*;

class GuiDemo_Gid extends Frame{
	
	Button b1,b2,b3,b4,b5,b6;
	

	GuiDemo_Gid(){
	setSize(300,300);
	setLayout(new GridLayout(2,3));
	b1=new Button("1");b2=new Button("2");b3=new Button("3");b4=new Button("4");
	b5=new Button("5");b6=new Button("6");
	add(b1);
add(b2);add(b3);add(b4);add(b5);add(b6);
	setVisible(true);
	}

	public static void main(String p[]){
		
		new GuiDemo_Gid();
	}




}