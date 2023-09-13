
package polymorphism;

class Test{
    void Show(int a, String b){
        System.out.println("This is NO 1");
    }

    void Show(){
        System.out.println("This is No 2");
    }
    int add(int a, int b){
        return a+b;
    }
    int mul(int a, int b, int c){
        return a*b*c;
    }
    int ma(int a, int b){
        return a*b;
    }
    void st(String name, String Class){
        System.out.println("String argument");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.Show();
        t.Show(10, "Umar");
        Test addT = new Test();
        Test mult = new Test();
        Test am = new Test();
        Test st = new Test();
        System.out.println(addT.add(10, 20));
        System.out.println(mult.mul(10, 10, 10));
        System.out.println(am.ma(10, 10));
        st.st("Umar", "5th Semester");
    }
}