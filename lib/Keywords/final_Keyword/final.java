package Keywords.final_Keyword;

class demo{
    public static void main(String[] args) {
        final int i = 10;
        System.out.println(i);
    }
}

class Test {
    void m1(){
        System.out.println("I am in Test class");
    }
}
class Second extends Test{
    void m1(){
        System.out.println("I am in Second class");
    }
    public static void main(String[] args) {
        Second s = new Second();
        s.m1();
    }
}