package io.sudhir.log.map;

import org.javatuples.Pair;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapAndCollectors {
    public static void main(String[] args) {
        List<Person> persons = getPersonList();
        // Grouping by department
        Map<Department, List<Person>> PersonByDepartment = persons.stream().collect(Collectors.groupingBy(Person::department));
        System.out.println("Person by Department: " + PersonByDepartment);
        // Grouping by department with person name
        System.out.println("\nPerson by Department with name: " +
                persons.stream().collect(Collectors.groupingBy(Person::department, Collectors.mapping(Person::name, Collectors.toList()))));

        // get a list of persons who have the same department and the same salary
        System.out.println("\nPerson by Department and Salary: " +
                persons
                        .stream()
                        .collect(Collectors.groupingBy( person -> new Pair<>(person.department(), person.salary()), Collectors.mapping(Person::name, Collectors.toList()))));

        // counting all the persons in a department.
        System.out.println("\n Count of persons by their department: " +
                persons.stream()
                        .collect(Collectors.groupingBy(Person::department,Collectors.counting()))
        );

        // finding the average salary in each department
        System.out.println("\n Average Salary of department: \n"+
            persons.stream()
                    .collect(Collectors.groupingBy(Person::department, Collectors.averagingDouble(Person::salary)))
        );
        // finding the max salaried person in each department
        System.out.println("\n Max Salary of department: \n" +
                persons
                        .stream()
                        .collect(Collectors.groupingBy(Person::department, Collectors.maxBy(Comparator.comparingDouble(Person::salary))))
        );

        // grouping all persons by the department; whose salary is greater than 300.
        System.out.println("\n Person by Department with salary greater than 300: \n" +
                persons
                        .stream()
                        .filter(person -> person.salary() > 300)
                        .collect(Collectors.groupingBy(Person::department, Collectors.counting()))
        );
    }


    private static List<Person> getPersonList() {
        return List.of(
                new Person(1, "Sudhir", 1000.0, new Department(1, "IT")),
                new Person(2, "John", 2000.0, new Department(2, "HR")),
                new Person(3, "Jane", 3000.0, new Department(1, "IT")),
                new Person(4, "Doe", 4000.0, new Department(3, "Finance")),
                        new Person(1, "Alex", 100d, new Department(1, "HR")),
                        new Person(2, "Brian", 200d, new Department(1, "HR")),
                        new Person(3, "Charles", 900d, new Department(2, "Finance")),
                        new Person(4, "David", 200d, new Department(2, "Finance")),
                        new Person(5, "Edward", 200d, new Department(2, "Finance")),
                        new Person(6, "Frank", 800d, new Department(3, "ADMIN")),
                        new Person(7, "George", 900d, new Department(3, "ADMIN"))
        );
    }

}

record Person(int id, String name, double salary, Department department) {}
record Department(int id, String name) {}