package Keywords.This_keyword;

// 4th use
// this keyword is used to pass argument in the method call


class demo {
    void m1 (demo d){
        System.out.println(" I ma in m1 method");
    }
    void m2 (){
        m1(this);
    }
    public static void main(String[] args) {
        demo d = new demo();
        d.m2();
    }
}
