public class Manager extends Employee{

    int bonus;

    public Manager(String name, int age, double salary, int bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    @Override
    public void displayInfo(){
        System.out.print("Бонус - " + bonus + " ");
        super.displayInfo();


    }

}
