package staff;

public class Employee {
    protected double salary;
    private String name;
    private String nINumber;

    public Employee(String name, String nINumber, double salary) {
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name){
        String newName = this.name;
        if(name != null){
            this.name = name;
        } else{
            this.name = newName;
        }
    }

    public String getNINumber() {
        return this.nINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double raise) {
        if (raise > 0) {
            salary += raise;
        } else {
            getSalary();
        }
    }

    public double payBonus(){
        return salary * 0.01;
    }

}
