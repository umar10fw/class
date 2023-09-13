package Keywords.Super_Keyword;

class A{
    int i = 10;

}

class B extends A{
    int i = 20;
    void Show(int i){
        System.out.println(super.i);
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.Show(10);
    }
}