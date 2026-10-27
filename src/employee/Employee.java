package employee;

public class Employee {
    private int empNo;
    private double basicPay;

    public Employee(int empNo) {
        this.empNo = empNo;
    }

    public void setBasicPay(double pay) {
        this.basicPay = pay;
    }

    public void display() {
        System.out.println("Employee Number: " + empNo);
        System.out.println("Basic Pay: " + basicPay);
    }
}
