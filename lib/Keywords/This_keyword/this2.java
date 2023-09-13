package Keywords.This_keyword;

// Second use of this
// invoke Current class method

class ThisDemo1 {
    void display(){
        System.out.println("Hello world");
    }
    void Show(){
        this.display();
    }
    public static void main(String[] args) {
        ThisDemo1 td = new ThisDemo1();
        td.Show();
    }
}