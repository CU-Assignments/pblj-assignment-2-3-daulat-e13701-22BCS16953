import java.util.*;  
class Employee {  
String name;  
int age;  
double salary;  
public Employee(String name, int age, double salary) {  
this.name = name;  
this.age = age;  
this.salary = salary;  
}  
public String toString() {  
return name + " - Age: " + age + ", Salary: " + salary;  
} 
}  
public class EmployeeSort {  
public static void main(String[] args) {  
List<Employee> employees = Arrays.asList(  
new Employee("Shivangi", 20, 90000),  
new Employee("Priya", 22, 60000),  
new Employee("Aman", 18, 850000)  
);  
employees.sort(Comparator.comparingDouble(e -> e.salary));  
employees.forEach(System.out::println);  
} 
}