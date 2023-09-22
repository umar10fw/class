package project;
import java.awt.*;

class SimpleCalculatorGUI extends Frame {
    TextField tf;

    SimpleCalculatorGUI() {
        setLayout(new BorderLayout());

        tf = new TextField();
        tf.setEditable(false);
        add(tf, BorderLayout.NORTH);

        Panel p = new Panel();
        p.setLayout(new GridLayout(4, 4));

        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            Button b = new Button(label);
            p.add(b);
        }

        add(p, BorderLayout.CENTER);

        setTitle("Simple Calculator");
        setSize(300, 400);
        setVisible(true);

    }

    public static void main(String[] args) {
        new SimpleCalculatorGUI();
    }
}
