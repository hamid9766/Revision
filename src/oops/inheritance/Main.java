package oops.inheritance;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Aman",4,1600000,8);
        System.out.println(e1.toString());

        Manager m1 = new Manager("Hamid",12,8800000);
        System.out.println("\n" + m1.toString());
    }
}
