package inheritance;

// Simple Inheritance

class Animal{

    void eat(){
        System.out.println("I am eating");
    }
    void run(){
        System.out.println("I am Runing");
    }
}

class Dog extends Animal{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.run();
    }
}
class cat extends Animal{
    public static void main(String[] args) {
        cat c = new cat();
        c.eat();
    }
}
