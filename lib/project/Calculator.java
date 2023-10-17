package project;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Calculator extends Frame implements ActionListener{
	
    TextField tf;
    Panel p;

    Button b1,clearBtn,b3,b4,b5,b6,b7,divideBtn,
    seven,eight,nine,
    multiplyBtn,
    four,five,six,
    subtractBtn,
    one,two,three,
    addBtn,b21,
    zero,
    b23,
    equalBtn;

    int a , b , resultNum ;
	
    Calculator(){

        setLayout( new BorderLayout());
        tf = new TextField();
        p = new Panel();
        add(tf, BorderLayout.NORTH);
        p.setLayout(new GridLayout(6, 4));
        add(p, BorderLayout.CENTER);
        

        
        b1=new Button("%");
        clearBtn=new Button("CE");
        b3=new Button("C");
        b4=new Button("Back");
        b5=new Button("1/x");
        b6=new Button("x^2");
        b7=new Button("2x");
        divideBtn=new Button("/");

        seven=new Button("7");
        eight=new Button("8");
        nine=new Button("9");

        multiplyBtn=new Button("x");

        four=new Button("4");
        five=new Button("5");
        six=new Button("6");

        subtractBtn=new Button("-");

        one=new Button("1");
        two=new Button("2");
        three=new Button("3");

        addBtn=new Button("+");

        b21=new Button("+/-");
        
        zero=new Button("0");

        b23=new Button(".");
        equalBtn=new Button("=");

        p.add(b1);p.add(clearBtn);p.add(b3);p.add(b4);p.add(b5);p.add(b6);
        p.add(b7);p.add(divideBtn);p.add(seven);p.add(eight);p.add(nine);p.add(multiplyBtn);
        p.add(four);p.add(five);p.add(six);p.add(subtractBtn);p.add(one);p.add(two);
        p.add(three);p.add(addBtn);p.add(b21);p.add(zero);p.add(b23);p.add(equalBtn);
        

        Font myFont = new Font("", Font.BOLD,16);
        b1.setFont(myFont);
        clearBtn.setFont(myFont);
        b3.setFont(myFont);
        b4.setFont(myFont);
        divideBtn.setFont(myFont);
        multiplyBtn.setFont(myFont);
        subtractBtn.setFont(myFont);
        addBtn.setFont(myFont);
        equalBtn.setFont(myFont);
        b23.setFont(myFont);

        
        setTitle("Simple Calculator");
        setSize(300, 500);
        setVisible(true);


		zero.addActionListener((new ActionListener() {
				public void actionPerformed(ActionEvent e){
					tf.setText(tf.getText() + "0");
				}
			})
		);
		one.addActionListener((new ActionListener() {
				public void actionPerformed(ActionEvent e){
					tf.setText(tf.getText() + "1");
				}
			}));
		two.addActionListener((new ActionListener() {
				public void actionPerformed(ActionEvent e){
					tf.setText(tf.getText() + "2");
				}
			}));
		three.addActionListener((new ActionListener() {
				public void actionPerformed(ActionEvent e){
					tf.setText(tf.getText() + "3");
				}
			}));
		four.addActionListener((new ActionListener() {
				public void actionPerformed(ActionEvent e){
					tf.setText(tf.getText() + "4");
				}
			}));
		five.addActionListener((new ActionListener() {
				public void actionPerformed(ActionEvent e){
					tf.setText(tf.getText() + "5");
				}
			}));
		six.addActionListener((new ActionListener() {
				public void actionPerformed(ActionEvent e){
					tf.setText(tf.getText() + "6");
				}
			}));
        seven.addActionListener((new ActionListener() {
				public void actionPerformed(ActionEvent e){
					tf.setText(tf.getText() + "7");
				}
			}));
		eight.addActionListener((new ActionListener() {
				public void actionPerformed(ActionEvent e){
					tf.setText(tf.getText() + "8");
				}
			}));
		nine.addActionListener((new ActionListener() {
				public void actionPerformed(ActionEvent e){
					tf.setText(tf.getText() + "9");
				}
			}));
		
		
		addBtn.addActionListener((new ActionListener() {
				public void actionPerformed(ActionEvent e){
					a = Integer.parseInt(tf.getText());
					b = Integer.parseInt(tf.getText());
					resultNum = a + b;
					tf.setText("");
				}
			}));
			
			subtractBtn.addActionListener((new ActionListener() {
					public void actionPerformed(ActionEvent e){	

						a = Integer.parseInt(tf.getText());						
						b = Integer.parseInt(tf.getText()); 
						
						tf.setText("");
						resultNum = a - b;

						// tf.setText(resultNum + "");
						// a = Integer.parseInt(tf.getText());
						// b = Integer.parseInt(tf.getText());
						// resultNum = a - b;
						// System.out.println(resultNum);
						// tf.setText("");
					}
				}));
		multiplyBtn.addActionListener((new ActionListener() {
				public void actionPerformed(ActionEvent e){
					a = Integer.parseInt(tf.getText());
					b = Integer.parseInt(tf.getText());
					resultNum = a * b;
					tf.setText("");
				}
			}));
		divideBtn.addActionListener((new ActionListener() {
				public void actionPerformed(ActionEvent e){
					a = Integer.parseInt(tf.getText());
					b = Integer.parseInt(tf.getText());
					resultNum = a / b;
					tf.setText("");
				}
			}));
		clearBtn.addActionListener((new ActionListener() {
				public void actionPerformed(ActionEvent e){
					tf.setText("0");
				}
			}));
	
		equalBtn.addActionListener((new ActionListener() {
				public void actionPerformed(ActionEvent event){
					tf.setText(resultNum + "");
				}
			}));
        
    }
	public static void main(String p[]){
        new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
	}
}



