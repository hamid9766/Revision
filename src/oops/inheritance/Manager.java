package oops.inheritance;

public class Manager {
    String name;
    int experience ;
    int salary;

    Manager(String name, int experience, int salary){
        this.name = name;
        this.experience = experience;
        this.salary = salary;
    }
    public String toString(){
        return ("Name of the person:- " + name + "\nYear of Experience:- " + experience + "\nSalary of Person:- " + salary);
    }
}
