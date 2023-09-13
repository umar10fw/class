package inheritance;

class A {
    void ShowA(){
        System.out.println("This is A Class");
    }
}
class B extends A {
    void ShowB(){
        System.out.println("This is B Class");
    }
}
class C extends B {
    void ShowC(){
        System.out.println("This is C Class");
    }

    public static void main(String[] args) {

        A obj1 = new A();
        obj1.ShowA();
        System.out.println("-------------");

        B obj2 = new B();
        obj2.ShowA();
        obj2.ShowB();
        System.out.println("-------------");

        C obj3 = new C();
        obj3.ShowA();
        obj3.ShowB();
        obj3.ShowC();
    }
}

