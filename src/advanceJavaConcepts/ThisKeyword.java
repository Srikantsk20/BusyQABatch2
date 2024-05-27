package advanceJavaConcepts;

public class ThisKeyword {
	int a, b;
	
	int add (int a, int b) {// a=5 and b=5
		this.a = a;
		this.b = 6;
		return b;
//		this.a = a;
//		this.b = b;
	}

	void display() {
		System.out.println(a);
		System.out.println(b);
	}
}
