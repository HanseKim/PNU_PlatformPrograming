import java.util.Objects;

public class Employee {
    private final String name;
    private final Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        //Your code here
        return this.name;
    }

    public Double getSalary() {
        //Your code here
        return this.salary;
    }

    @Override
    public String toString() {
        //Your code here
        return String.format("%s %.1f",name,salary);
    }

    @Override
    public boolean equals(Object o) {
        //Your code here
        if(this == o) return true;
        if(o ==null) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name,employee.name) && Objects.equals(salary,employee.salary);
    }


    @Override
    public int hashCode() {
        //Your code here
        return Objects.hash(name,salary);
    }

}
