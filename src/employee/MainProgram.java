package employee;

public class MainProgram {
	public static void main(String[] args) {
		Employee emp1 = new Employee(101);
		emp1.setBasicPay(50000);
		emp1.setBasicPay(50000.75);
		emp1.display();
    }
}
