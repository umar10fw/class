package inheritance;

// Single Inheritance

class A {
    void ShowA(){
        System.out.println("This is A class");
    }
}
class B extends A {
    void ShowB(){
        System.out.println("This is B class");
    }
    public static void main(String[] args) {
        A obj = new A();
        obj.ShowA();
        // with A class we can't use B class properties 
        B obj1 = new B();
        obj1.ShowA();
        obj1.ShowB();
        // with B class we can access the A or B class properties 
    }
}
