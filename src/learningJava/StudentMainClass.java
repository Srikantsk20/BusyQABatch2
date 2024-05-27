package learningJava;

public class StudentMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentClass s1 = new StudentClass(111, "Srikant");
		StudentClass s2 = new StudentClass();
		s2.id = 112;
		s2.name = "Rajeshwari";
		s1.displayValue();
		s2.displayValue();
	}

}
