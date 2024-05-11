package learningJava;

public class IntiConstructorObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorStudent s1 = new ConstructorStudent(2, "Srikant", "Automation");
		
		boolean idcheckvalue = s1.idChecker();
		System.out.println("IDChecker Result is "+ idcheckvalue);
		
		s1.display();
		
		ConstructorStudent s2 = new ConstructorStudent(1, "Anslem", "Testing");
		s2.display();
	}

}
