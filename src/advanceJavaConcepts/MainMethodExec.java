package advanceJavaConcepts;

public class MainMethodExec {
	
	public static void main(String[] args) {
		System.out.println("I am in main with string args");
		main();
		main("srikant");
	}
	
	public static void main() {
		System.out.println("I am in main now");
		System.out.println("Ade exp");
	}
	
	public static void main(String args) {
		System.out.println("I am with Srikant");
		main();
	}
}
