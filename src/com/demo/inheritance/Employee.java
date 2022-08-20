public class Employee {
	private String name, address;
	private int year, salary;

	public Employee(String n, int y, int sal, String add) {
		name = n;
		year = y;
		salary = sal;
		address = add;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public int getSalary() {
		return salary;
	}

	public String getAddress() {
		return address;
	}

	public static void main(String[] args) {
		Employee a1 = new Employee("Robert", 1994, 500000, "64C- WallsStreet");
		Employee a2 = new Employee("Sam", 2000, 740000, "68d- WallsStreet");
		Employee a3 = new Employee("John", 1999, 600000, "26B- WallsStreet");
		System.out.println("Name\tYear of joining\tSalary\tAddress");
		System.out.println(a1.getName() + "\t" + a1.getYear() + "\t\t\t" + a1.getSalary() + "\t" + a1.getAddress()); // printing
																														// details
																														// of
																														// employee
																														// 1
		System.out.println(a2.getName() + "\t\t" + a2.getYear() + "\t\t\t" + a2.getSalary() + "\t" + a2.getAddress()); // printing
																														// details
																														// of
																														// employee
																														// 2
		System.out.println(a3.getName() + "\t" + a3.getYear() + "\t\t\t" + a3.getSalary() + "\t" + a3.getAddress()); // printing
																														// details
																														// of
																														// employee
																														// 3
	}
}