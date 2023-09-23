package Q5;

    	  public class Tea {            //Attributes
    		    boolean isPrepared;
    		    boolean hasMilk;
    		    boolean hasSugar;

    		    public Tea() {         //no Argument Constructor
    		        isPrepared = false;
    		        hasMilk = false;
    		        hasSugar = false;
    		    }
    		    
    		    public void prepareTea() {
    		        if (!isPrepared) {
    		            System.out.println("Boiling water and Putting tea leaves to prepare basic tea.");
    		            isPrepared = true;
    		        } else {
    		            System.out.println("Tea is already prepared.");
    		        }
    		    }

    		    // Method to add milk to the tea
    		    public void addMilk() {
    		        if (isPrepared && !hasMilk) {
    		            System.out.println("Adding milk to the tea.");
    		            hasMilk = true;
    		        } else if (!isPrepared) {
    		            System.out.println("You need to prepare tea first.");
    		        } else {
    		            System.out.println("Milk is already added.");
    		        }
    		    }

    		    public void addSugar() {
    		        if (isPrepared && !hasSugar) {
    		            System.out.println("Adding sugar to the tea.");
    		            hasSugar = true;
    		        } else if (!isPrepared) {
    		            System.out.println("You need to prepare tea first.");
    		        } else {
    		            System.out.println("Sugar is already added.");
    		        }
    		    }

    		    public static void main(String[] args) {
    		        Tea tea = new Tea();
    		        tea.prepareTea();
    		        tea.addMilk();
    		        tea.addSugar();
    		       
    		    }
    	  }

