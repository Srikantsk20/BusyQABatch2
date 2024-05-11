package advanceJavaConcepts;

public class MethodOverloadingP1 {
	// Method to add two integers
	
    int add(int x, int y) {
        return x + y;
    }

    // Method to add three integers
    int add(int x, int y, int z) {
        return x + y + z;
    }

    // Method to add two doubles
    double add(double x, double y) {
        return x + y;
    }

    // Method to add three doubles
    double add(double x, double y, double z) {
        return x + y + z;
    }

    // Method to add an integer and a double
    double add(int x, double y) {
        return x + y;
    }

    // Method to add a double and an integer
    double add(double y, int x) {
        return x + y;
    }
}
