package project;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class EventHandling extends Frame implements ActionListener{

    Button b;Button b1;Button b2;Button b3;
    EventHandling(){
        setLayout(new FlowLayout());
        b = new Button("Click Me");
        b1 = new Button("Click Me");
        b2 = new Button("Click Me");
        b3 = new Button("Click Me");
        setSize(300, 300);
        setVisible(true);
        add(b);
        add(b1);
        add(b2);
        add(b3);

        b.addActionListener(this);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("Press Second Button Second Method");
            }
        });
        
        b2.addActionListener(new Listener());
        b3.addActionListener(new Listener1());
    }
    class Listener1 implements ActionListener{

    public void actionPerformed(ActionEvent i){
    System.out.println("Press Button Method Forth");
}
}

    public void actionPerformed(ActionEvent i){
        System.out.println("Press Button Method First");
    }

    public static void main(String[] args) {
        new EventHandling();
    }
}

class Listener implements ActionListener{

    public void actionPerformed(ActionEvent i){
    System.out.println("Press Button Method Third");
}
}
