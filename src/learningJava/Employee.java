package learningJava;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeOne emp1 = new EmployeeOne();  // creating an instance of the class
		emp1.eid = 1234;
		emp1.ename = "Srikant";
		emp1.salary = 10000.00f;
		emp1.job = "Instructor";
		
	    emp1.display();
		emp1.bonus();
		
		emp1.eid= 1354;
		
		EmployeeOne emp2 = new EmployeeOne();
		emp2.eid = 1235;
		emp2.ename = "Cheryl";
		emp2.salary = 10440.00f;
		emp2.job = "Student";
		
		emp2.eid= 1394;
		
//		emp2.display();
//		emp2.bonus();
	}

}
