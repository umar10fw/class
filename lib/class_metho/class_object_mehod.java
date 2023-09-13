package class_metho;

class Animal{
    // by initialization of variable
    String color;
    int age;

    // by Using Method

    void initObj(String c, int a){
        color = c;
        age = a;
    }
    void display(){
        System.out.println(color+"\n"+age);
    }

    void eat(){
        System.out.println("I am Eating");
    }
    void run(){
        System.out.println("I am Runing");
    }
    public static void main(String[] args) {
       Animal buzo = new Animal();
       Animal buzo2 = new Animal();
       
       buzo.eat();
       buzo.run();

       buzo.color = "black";
       buzo.age = 21;
       System.out.println(buzo.color+"\n"+buzo.age);
       
       buzo2.initObj("White", 22);
       buzo2.display();
    }
    
}