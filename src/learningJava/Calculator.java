package learningJava;

public class Calculator {
int a, b;
void add (int a, int b) {
	a = a;
	b = b;
}

void display() {
	System.out.println(a);
	System.out.println(b);
}

public static void main (String[] args) {
	Calculator cal = new Calculator();
	cal.add(5, 5);
	cal.display();
}
}
