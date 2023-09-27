package Aug29.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Monik", 35));
        employeeList.add(new Employee("Krishna", 24));
        employeeList.add(new Employee("Dhruvi", 13));
        employeeList.add(new Employee("Rasik", 88));
        employeeList.add(new Employee("Heena", 75));


        List<Employee> collect1 = employeeList.stream().filter(x -> x.age > 25).collect(Collectors.toList());
        long count = employeeList.stream().count();
        System.out.println(count);



    }
}
