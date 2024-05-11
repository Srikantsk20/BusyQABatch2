package interfacesLearning;

public class DuckMultipleInheritance implements Swimming, Flying {
	 @Override
	    public void swim() {
	        System.out.println("Duck can swim");
	    }

	 @Override
	  public void fly() {
	       System.out.println("Duck can fly");
	   }
}
