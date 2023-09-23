package Q1;

        public class Person {     // Attributes
        	String name;
        	int age;
        	
        public Person (String name, int age) { // Constructor
        	this.name = name;
        	this.age = age;
        }  
	public String getName() { // Getter Method
			return name;
		}
	public int getAge() { // Getter Method
			return age;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj = new Person("Kamal", 25);
		String Value = obj.getName();
		int Value1 = obj.getAge();
		System.out.println("Name " + Value);
		System.out.println("Age " + Value1);
	}
}
