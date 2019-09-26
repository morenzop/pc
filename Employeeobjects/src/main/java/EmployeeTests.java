import driver.Car;

import java.time.LocalDate;

public class EmployeeTests {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Bob", 4.9f);
        SalariedEmployee salariedEmployee=new SalariedEmployee("mike", 25.0f, 30, LocalDate.of(2001, 11, 5 ),
                new Personality("left","Lavender"), new Car("4", "4","alot"));



        System.out.println(salariedEmployee);
    }
}
