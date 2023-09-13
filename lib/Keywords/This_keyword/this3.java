package Keywords.This_keyword;

// 3rd Use of this
// this() keyword is used to invoke current class Constructor

class ThisDemoclass {
    void display(){
        System.out.println("Correct");
    }
    ThisDemoclass(){
    this(10);
    System.out.println("no argument Constructor");
   }
   ThisDemoclass(int a){
    System.out.println("Parametrized Constructor");
   }
   public static void main(String[] args) {
    ThisDemoclass td = new ThisDemoclass();
    td.display();
   }
}