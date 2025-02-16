import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Manager("Anton2.0",25, 4000, 110));
        employees.add(new Manager("Ilya",18, 2000, 500));
        employees.add(new Manager("Maksim",18, 1000, 1200));
        employees.add(new Developer("Nikita",32, 6000, "Java"));
        employees.add(new Developer("Anton",29, 7040, "C#"));
        employees.add(new Developer("Andrey",26, 5400, "C++"));


        employees.forEach(Employee::displayInfo);

        employees.get(2).increaseSalary(5000);

        employees.forEach(Employee::displayInfo);



    }
}

