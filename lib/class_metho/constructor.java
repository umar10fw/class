package class_metho;
// Default Constructor
// no argumennt Constructor
// parametrized Constructor

class Test{
    int i;
    int a;
    int b;
    String name;
    Test(int a, String name){
        System.out.println("no argumennt Constructor");
        this.a=a;
        this.name=name;
    }
    public static void main(String[] args) {
        Test t = new Test(
            01,"Umar"
        );
        System.out.println(t.i+"\n"+t.a);
        System.out.println(t.b+"\n"+t.name);
    }
}

 
