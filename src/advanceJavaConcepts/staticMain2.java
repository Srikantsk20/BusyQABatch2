package advanceJavaConcepts;

public class staticMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticKeywordP2 emp1 = new StaticKeywordP2();
		emp1.assignVal(1, "Srikant");
		
		emp1.displayVal();
		
		StaticKeywordP2 emp2 = new StaticKeywordP2();
		emp2.assignVal(2, "Kajal");
		
//		emp1.displayVal();
		emp2.displayVal();
		
		StaticKeywordP2.deptno=5;
		System.out.println("--------------Value after changing the depNum-------------------------");
		//uncomment the below for showing static variable update
		emp1.displayVal();
		emp2.displayVal();
		
		
		StaticKeywordP2.increment();
		System.out.println("--------------Value after changing the depNum-------------------------");
		//uncomment the below for showing static variable update
		emp1.displayVal();
		emp2.displayVal();
	}

}
