package learningJava;

public class EmployeeOne {
	int eid;
	String ename;
	float salary;
	String job;
	
	void display() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(salary);
		System.out.println(job);
	}
	
	void bonus() {
		System.out.println(salary*10);
	}
	
}
