package interfacesLearning;

import packageLearning.Employee;
import packageLearning.Department;

//import packageLearning.*;

public class PackageLearningMainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("John", 101);
        emp.display();

        Department dept = new Department("HR");
        dept.display();
	}

}
