package exercise7;

public class Employee extends Person {
	private String designation;

	public Employee() {
		System.out.println("def con");
	}

	public Employee(String fn, String ln, String des) {
		super(fn, ln);
		designation = des;
		
	}

	public static void main(String[] args) {
		Employee e = new Employee("Gagan", "Sunhare", "developer");
		System.out.println(e.fName + " " + e.lName + " as a" + e.designation);
	
	
	}
}
