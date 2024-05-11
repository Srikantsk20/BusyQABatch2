package accessModifier;

class DefaultMyClass {
	int defaultVariable; // Default (package-private) member variable

    // Default (package-private) method
    void defaultMethod() {
        System.out.println("This is a default method.");
        System.out.println("This is a default method."+ defaultVariable);
    }
}
