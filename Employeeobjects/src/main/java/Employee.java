public class Employee extends Person{

    private float hoursWorked;


    public Employee(String name, float hoursWorked) {
        super(name);
        this.hoursWorked = hoursWorked;
    }
//    public void calculatePay(){
//        System.out.println(hourlyRate * hoursWorked);
//    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
     public String toString(){
        return getName();
}

}
