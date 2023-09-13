package Keywords.static_keyword;

class Employee{

    int empId;
    String name;
    static String company = "Object oriented Programing |";
    Employee(int empId, String name){
        this.empId = empId;
        this.name = name;
    }
    void display(){
        System.out.println("|"+empId+"|"+name+"|"+ company);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee(001, "Umar");
        e1.display();
        Employee e2 = new Employee(002, "Afzal");
        e2.display();
        Employee e3 = new Employee(001, "Ahmad");
        e3.display();
        Employee e4 = new Employee(002, "Hassain");
        e4.display();
    }
}