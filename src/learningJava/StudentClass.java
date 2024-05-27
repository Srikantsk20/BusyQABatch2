package learningJava;

public class StudentClass {
	int id;
	String name;
	
	StudentClass(int i, String SName) {
		id = i;
		name = SName;
	}
	
	StudentClass(){}
	
	void displayValue() {
		System.out.println("Printing the name "+name);
	}
}
