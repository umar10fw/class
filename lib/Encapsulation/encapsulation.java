package Encapsulation;

class Employee{
    // Create a getter and setter method for Encapsulation
    private int EmpId;
    public void SetEmpId(int eid){
        EmpId = eid;
    }
    public int GetEmpId(){
        return EmpId;
    }
}


class Company{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.SetEmpId(101);
        System.out.println(e.GetEmpId());
    }
}
