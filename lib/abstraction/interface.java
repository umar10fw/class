package abstraction;

interface I1 {
    void Show();
}
interface I2 {
    void display();
}
// Multiple Inheritance is used in Interface

class TestInterface implements I1, I2{
    public void Show(){
        System.out.println("1");
    }
    public void display(){
        System.out.println("2");
    }
    public static void main(String[] args) {
        TestInterface t = new TestInterface();
        t.Show();
        t.display();
    }
}
