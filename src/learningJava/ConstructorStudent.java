package learningJava;

public class ConstructorStudent {
	 int id;
	 String name;
	 String course;
	 
ConstructorStudent(int s_id, String s_name, String s_course) {
		 id = s_id;
		 name = s_name;
		 course = s_course;
}
	 
	 boolean idChecker() {
		 if (id > 1) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	 
	 void display() {
		 System.out.println("name: "+ name);
		 System.out.println("id : "+ id);
		 System.out.println("Course : "+ course);
	 }
}
