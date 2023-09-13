package inheritance;

class A1 {
    void ShowA(){
        System.out.println("This is A Class");
    }
}
class B1 extends A1 {
    void ShowB(){
        System.out.println("This is B Class");
    }
}
class C1 extends A1 {
    void ShowC(){
        System.out.println("This is C Class");
    }

    public static void main(String[] args) {

        A1 obj1 = new A1();
        obj1.ShowA();
        System.out.println("-------------");

        B1 obj2 = new B1();
        obj2.ShowA();
        obj2.ShowB();
        System.out.println("-------------");

        C1 obj3 = new C1();
        obj3.ShowA();
        obj3.ShowC();
    }
}

