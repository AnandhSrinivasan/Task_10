package Q6;

public class BlackTea extends Tea{
	public static void main(String[] args) {

		@SuppressWarnings("unused")
		BlackTea Tea = new BlackTea();
		BlackTea.boilWater();
		BlackTea.steepTea();
		BlackTea.pourInCup();
		BlackTea.addLemon();
		BlackTea.addSugar();
	}

	public static void boilWater() {
		System.out.println("Boiling water");
	}

	public static void steepTea() {
		System.out.println("Steeping the tea");
	}

	public static void pourInCup() {
		System.out.println("Pouring the tea into a cup");
	}

	public static void addLemon() {
		System.out.println("Adding lemon to the tea");
	}
	public static void addSugar() {
		System.out.println("Adding Two spoon Sugar to the tea");
	}
}

