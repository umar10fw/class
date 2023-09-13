package Keywords.This_keyword;

// First Use of This
// Invoke Current class Instance Variable.

class ThisDemo{
    int i;
    void SetValue(int i){
        this.i = i;
    }
    void Show(){
        System.out.println(i);
    }
    public static void main(String[] args) {
        ThisDemo td = new ThisDemo();
        td.SetValue(100);
        td.Show();
    }
}