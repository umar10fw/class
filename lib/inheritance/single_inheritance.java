package inheritance;

// Single Inheritance

class A3 {
    void ShowA(){
        System.out.println("This is A class");
    }
}
class B extends A3 {
    void ShowB(){
        System.out.println("This is B class");
    }
    public static void main(String[] args) {
        A3 obj = new A3();
        obj.ShowA();
        // with A class we can't use B class properties 
        B obj1 = new B();
        obj1.ShowA();
        obj1.ShowB();
        // with B class we can access the A or B class properties 
    }
}
