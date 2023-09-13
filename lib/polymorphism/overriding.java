package polymorphism;

class Test3{
    void Show(String a){
        System.out.println("This is 1");
    } 
}

class Test4 extends Test3{
    void Show(String a){
        System.out.println("This is 2");
    }
    public static void main(String[] args) {

       
        Test3 t2 = new Test3();
        t2.Show("Umar");
        Test4 t = new Test4();
        t.Show("Afzal");
        
    }
}
