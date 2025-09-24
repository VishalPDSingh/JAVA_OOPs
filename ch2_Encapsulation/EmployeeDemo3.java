package ch2_Encapsulation;

class Employee {
    private String emp_id;
    private String emp_name;
    private float emp_salary;

    // setter
    public void setEmpId(String emp_id) {
        this.emp_id = emp_id;
    }

    public void setEmpName(String emp_name) {
        this.emp_name = emp_name;
    }

    public void setEmpSalary(float emp_salary) {
        this.emp_salary = emp_salary;
    }

    // getter
    public String getEmpID() {
        return emp_id;
    }

    public String getEmpName() {
        return emp_name;
    }

    public float getEmpSalary() {
        return emp_salary;
    }
}

public class EmployeeDemo3 {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setEmpId("123VIS");
        e1.setEmpName("Vishal Singh");
        e1.setEmpSalary(40000.55f);

        System.out.println(e1.getEmpID());
        System.out.println(e1.getEmpName());
        System.out.println(e1.getEmpSalary());

        Employee e2 = new Employee();
        e2.setEmpId("123MUS");
        e2.setEmpName("ABCD");
        e2.setEmpSalary(320000);

        System.out.println(e2.getEmpID());
        System.out.println(e2.getEmpName());
        System.out.println(e2.getEmpSalary());
    }
}
