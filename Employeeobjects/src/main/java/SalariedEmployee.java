import driver.Car;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    public double yearlySalary;
    public LocalDate hireDate;
    public Personality personality;
    public Car car;

    public SalariedEmployee(String name, float hoursWorked, double yearlySalary, LocalDate hireDate, Personality personality, Car car) {
        super(name, hoursWorked);
        this.yearlySalary = yearlySalary;
        this.hireDate = hireDate;
        this.personality=personality;
        this.car=car;

    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "yearlySalary=" + yearlySalary +
                ", hireDate=" + hireDate +
                ", personality=" + personality +
                ", car=" + car +
                ", sex=" + sex +
                '}';
    }
}


