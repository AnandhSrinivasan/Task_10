package Q6;

	public class GreenTea extends BlackTea {
	    public static void main(String[] args) {
	    	@SuppressWarnings("unused")
			GreenTea Tea = new GreenTea();
	    	GreenTea.boilWater();
	    	GreenTea.addGreenTeaLeaves();
	    	GreenTea.addHotWater();
	    	GreenTea.steepTea();
	    	GreenTea.removeTeaLeaves();
	    	GreenTea.addLemon();
	    }

	    public static void boilWater() {
	        System.out.println("Boil water");
	    }

	    public static void addGreenTeaLeaves() {
	        System.out.println("Adding green tea leaves to the teapot");
	    }

	    public static void addHotWater() {
	        System.out.println("Adding hot water into the teapot");
	    }

	    public static void steepTea() {
	        System.out.println("Steeping the tea");
	    }

	    public static void removeTeaLeaves() {
	        System.out.println("Removing the tea leaves from the teapot");
	    }
	    public static void addLemon() {
	        System.out.println("Adding Lemon and Drink");
	}
}