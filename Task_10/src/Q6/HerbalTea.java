package Q6;

public class HerbalTea extends GreenTea {
    public static void main(String[] args) {
    	@SuppressWarnings("unused")
		HerbalTea Tea = new HerbalTea();
    	HerbalTea.boilWater();
    	HerbalTea.addHerbalTeaBag();
    	HerbalTea.pourHotWater();
    	HerbalTea.steepTea();
    	HerbalTea.removeTeaBag();
    	HerbalTea.addSugar();
    }

    public static void boilWater() {
        System.out.println("Boiling water");
    }

    public static void addHerbalTeaBag() {
        System.out.println("Adding herbal tea bag to the teapot");
    }

    public static void pourHotWater() {
        System.out.println("Pouring hot water into the teapot");
    }

    public static void steepTea() {
        System.out.println("Steeping the herbal tea");
    }

    public static void removeTeaBag() {
        System.out.println("Removing the herbal tea bag from the teapot");
    }
    public static void addSugar() {
		System.out.println("Adding Two spoon Sugar to the tea...");
    }
}

