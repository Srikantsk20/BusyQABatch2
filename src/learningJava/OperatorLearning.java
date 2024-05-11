package learningJava;

public class OperatorLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 11;
		int b = 5;
		int sum = a+b;
		System.out.println("Addition of A and B equals: "+ sum);
		
		// understand ++ (increment operator) it will increment value of variable by 1
		
	    System.out.println("incremented value of A equals: "+ ++a); // 11 + 1 = 12
		System.out.println("incremented value of A equals: "+ a++); //11 to display and then increment it to 12
		System.out.println("incremented value of A equals: "+ a);
		
		// display a-b, a*b, a/b, a%b, --a, a--
		System.out.println("subtraction value equals: "+ (a-b));
		System.out.println("multiplication value equals: "+ a*b);
		System.out.println("division value equals: "+ a/b);
		System.out.println("modulus value equals: "+ a%b);
		System.out.println("decremented value equals: "+ --a);
		System.out.println("decremented value equals: "+ a--);
		
		
		//Logical Operators:
		a = 5;
		b = 6;
		int c = 5;
		boolean conIsEqualNeg = (a==b);
		boolean conIsEqual = (a==c);
		System.out.println("condition value equals check: conIsEqualNeg :" + conIsEqualNeg);
		System.out.println("condition value equals check: conIsEqual :" + conIsEqual);
		
		// Relational operators
        boolean isEqual = (a == b);
        boolean isNotEqual = (a != b);
        boolean isGreaterThan = (a > b);
        boolean isLessThan = (a < b);
        boolean isGreaterOrEqual = (a >= b);
        boolean isLessOrEqual = (a <= b);
        
        System.out.println("condition value equals check: isEqual :" + isEqual);
        System.out.println("condition value equals check: isNotEqual :" + isNotEqual);
        System.out.println("condition value equals check: isGreaterThan :" + isGreaterThan);
        System.out.println("condition value equals check: isLessThan :" + isLessThan);
        System.out.println("condition value equals check: isGreaterOrEqual :" + isGreaterOrEqual);
        System.out.println("condition value equals check: isLessOrEqual :" + isLessOrEqual);
        
		boolean logAnd = ((a==c) && (a<b));
		boolean logAndfalse = ((a!=c) && (a<b));
		boolean logicalOr = ((a==c) || (a<b));
		boolean logicalOrfasle = ((a!=c) || (a>b));
		boolean logicalnot = (!(a==c));
		
		System.out.println("condition value equals check: logAnd :" + logAnd);
		System.out.println("condition value equals check: logAndfalse :" + logAndfalse);
		System.out.println("condition value equals check: logicalOr :" + logicalOr);
		System.out.println("condition value equals check: logicalOrfasle :" + logicalOrfasle);
		System.out.println("condition value equals check: logicalnot :" + logicalnot);
	}

}
