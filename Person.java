package assignment;

public class Person {

	    String name;
	    int age;
	    String gender;

	    public Person(String name, int age, String gender) {
	        this.name = name;
	        this.age = age;
	        this.gender = gender;
	    }

	    public void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Gender: " + gender);
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        Person person1 = new Person("Anjali", 25, "Female");
	        Person person2 = new Person("Akash", 30, "Male");

	        person1.displayInfo();
	        person2.displayInfo();
	    }
	}