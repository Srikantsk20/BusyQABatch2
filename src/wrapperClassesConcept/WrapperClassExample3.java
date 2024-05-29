package wrapperClassesConcept;

class Person {
    private Integer age;

    public Person(Integer age) {
        this.age = age;
    }

    public void displayAge() {
        System.out.println("Age: " + age);
    }
}


class PersonWithPrimitive {
    private int age;

    public PersonWithPrimitive(int age) {
        this.age = age;
    }

    public void displayAge() {
        System.out.println("Age: " + age);
    }
}

public class WrapperClassExample3 {
    public static void main(String[] args) {
        // Using wrapper class
    	//Integer ageWrapper = 30;
        Integer ageWrapper = null;
        Person person = new Person(ageWrapper);
        person.displayAge();

        // Using primitive type
        int agePrimitive = 8 ;
        PersonWithPrimitive personWithPrimitive = new PersonWithPrimitive(agePrimitive);
        personWithPrimitive.displayAge();
    }
}

