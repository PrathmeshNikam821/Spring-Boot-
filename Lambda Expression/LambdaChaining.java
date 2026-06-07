import java.util.*;
import java.util.function.Predicate;
import java.util.function.*;

public class LambdaChaining {

  public static void main(String[] args) {

    List<Employee> employees = new ArrayList<>();

    employees.add(new Employee("Alice", 50000));
    employees.add(new Employee("Bbb", 60000));
    employees.add(new Employee("Charlie", 55000));
    employees.add(new Employee("Diana", 48000));
    employees.add(new Employee("Eve", 75000));

    // predicate --> Filter salary > 50000
    Predicate<Employee> highestSalaryFilter = e -> e.getSalary() > 50000;

    // Function --> Exrtact Name
    Function<Employee, String> nameExtractor = e -> e.getName();

    // Consumer --> Print each name
    Consumer<String> namePrinter = name -> System.out.println(name);

    // Chain them together --> manual Iteration
    for (Employee emp : employees) {
      // Filter step
      if (highestSalaryFilter.test(emp)) {
        // Map step
        String name = nameExtractor.apply(emp);
        // Consumer step --> Print
        namePrinter.accept(name);
      }
    }
  }

}
