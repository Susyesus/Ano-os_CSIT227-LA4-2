package Management_Exc;

public class Manager extends Employee {
    public Manager(String name, int age, double salary) {
        super(name, age, salary);
    }

    /**
     * TODO this implementation
     * @param e the employee to be given raise
     * @param raise the raise
     * @throws IllegalArgumentException when raise is negative
     */
    public void giveRaise(Employee e, double raise) throws IllegalArgumentException{
        if(raise < 0){
            throw new IllegalArgumentException("Raise must be non-negative");
        }
        if(e.equals(this)){
            double increase = e.getSalary()+raise;
            e.setSalary(increase);
            return;
        }
        double increase = e.getSalary() + raise;
        e.setSalary(increase);
        double managerRaise = getSalary() + (raise/2.0);
        this.setSalary(managerRaise);
    }

    @Override
    public String toString() {
        return "Mgr. " +super.toString();
    }
}
