package Q6;

public class Tea{
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Tea Tea = new Tea();
		Tea.boilwater();   
		Tea.preparetea();
		Tea.addMilk();
		Tea.addSugar();

		System.out.println("Your cup of tea is ready!");
	}

	public static void boilwater() {
		System.out.println("Boil two glasses of water");
	}

	public static void preparetea() {
		System.out.println("Add tea powder");

	}

	public static void addMilk() {
		System.out.println("Add boiled milk");
	}

	public static void addSugar() {
		System.out.println("Add one spoon of sugar");
	}
}	

