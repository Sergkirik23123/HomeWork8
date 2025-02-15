public class Developer extends Employee{

    String programmingLanguage;

    public Developer(String name, int age, double salary, String programmingLanguage) {
        super(name, age, salary);
        this.programmingLanguage = programmingLanguage;

    }

    @Override
    public void displayInfo(){
        System.out.print("Язык программирования - " + programmingLanguage + " ");
        super.displayInfo();


    }
}
