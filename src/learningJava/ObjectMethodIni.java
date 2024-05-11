package learningJava;

public class ObjectMethodIni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.initiateValues(1, "Srikant", "Computer Science");
		s1.initiateValues(3, "Srikant Kumar", "Computer Testing Science");
		s1.display();
		
		s2.initiateValues(2, "Ade", "Automation");
		
		s2.display();
		
	}

}
