package oops.inheritance;

class Employee extends Manager {
    public int workingHours;

    Employee(String name, int experience, int salary, int workingHours) {
        super(name, experience, salary);
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return (super.toString() + "\nWorking Hours:- " + workingHours);

    }


}

