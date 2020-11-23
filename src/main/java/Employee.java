public abstract class Employee {

    private String name;
    private String nationalInsuranceNumber;
    private Double salary;

    public Employee (String name, String nationalInsuranceNumber, Double salary){
        this.name = name;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
        this.salary = salary;
    }
}
