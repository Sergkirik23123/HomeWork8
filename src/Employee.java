class Employee{
    String name;
    int age;
    private double salary;

    public Employee(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayInfo(){
        System.out.println("Имя - " + name + " Возраст - " + age + " Зарплата - " + salary);
        System.out.println(" ");
    }

    public void increaseSalary(double amount){
        salary += amount;
    }
}
