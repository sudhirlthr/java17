package io.sudhir.log.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamPoc {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Sudhir1", "1000");
        Employee e2 = new Employee(1, "Sudhir2", "2000");
        Employee e3 = new Employee(4, "Sudhir4", "1000");
        Employee e4 = new Employee(1, "Sudhir11", "3000");
        Employee e5 = new Employee(3, "Sudhir3", "1000");
        Employee e6 = new Employee(2, "Sudhir2", "1000");

        List<Employee> employeeList = Arrays.asList(e1, e2,e3,e4,e5,e6);

        //grouptByID
        Map<Integer, List<Employee>> groupEmployeeById = employeeList.stream().collect(Collectors.groupingBy(Employee::getEid));
        //print employee whose id is 1
        System.out.println(groupEmployeeById.get(1));
        //
        groupEmployeeById.values().stream().map(employees -> employees.get(0)).toList().forEach(System.out::println);
    }

}

class Employee {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return Objects.equals(getEid(), employee.getEid()) && Objects.equals(getEname(), employee.getEname()) && Objects.equals(getSalary(), employee.getSalary());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEid(), getEname(), getSalary());
    }

    Integer eid;
    String ename;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    String salary;

    public Employee(Integer eid, String ename, String salary) {
        this.eid = eid;
        this.ename = ename;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
