package DelgadosChoice;
import java.util.Scanner;
public class delgadosChoice {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int order;
		double orderNumber;
		double tacoPrice = 0.99;
		double burritoPrice = 1.99;
		double chipsAndQuesoPrice = 1.99;
		double tacoSaladPrice = 3.00;
		double fajitaPrice = 1.99;
		double walkingTacoPrice = 1.99;
		double lemonadePrice = 1.00;
		double waterPrice = 1.00;
		double sodaPrice = 2.00;
		double beerPrice = 3.00;
		double tacoOrdered;
		double burritoOrdered;
		double chipsAndQuesoOrdered;
		double tacoSaladOrdered;
		double fajitaOrdered;
		double walkingTacoOrdered;
		double lemonadeOrdered;
		double waterOrdered;
		double sodaOrdered;
		double beerOrdered;
		double totalPrice;
	    double totalPriceWithTax;
	
	    tacoTruck();
	    menu();
	    
	    System.out.println("Welcome to Delgados Tacos, what would you like to order? Please select a menu number.");
	    orderNumber = input.nextInt();
	    input.nextLine();
	    
	    
	    if (orderNumber == 1)
	    {
	    	System.out.println("I see you like tacos, how many would you like?>>>");
	    	tacoOrdered = input.nextDouble();
	    	input.nextLine();
	    	totalPrice = (tacoPrice + tacoOrdered);
	    	System.out.println("You ordered " + tacoOrdered + " Tacos, $ " + totalPrice);
	    }
	    if (orderNumber == 2)
	    {
	    	System.out.println("I see you like burritos, how many would you like?>>>");
	    	burritoOrdered = input.nextDouble();
	    	input.nextLine();
	    	totalPrice = (burritoPrice +burritoOrdered);
	    	System.out.println("You ordered " + burritoOrdered + " Burrito, $ " + totalPrice);
	    }
	    if (orderNumber == 3)
	    {
	    	System.out.println("I see you like Chips and Queso, how many would you like?>>>");
	    	chipsAndQuesoOrdered = input.nextDouble();
	    	input.nextLine();
	    	totalPrice = (chipsAndQuesoPrice + chipsAndQuesoOrdered);
	    	System.out.println("You ordered " + chipsAndQuesoOrdered + " Chips and Queso, $ " + totalPrice);
	    }
	    if (orderNumber == 4)
	    {
	    	System.out.println("I see you like Taco Salad, how many would you like?>>>");
	    	tacoSaladOrdered = input.nextDouble();
	    	input.nextLine();
	    	totalPrice = (tacoSaladPrice + tacoSaladOrdered);
	    	System.out.println("You ordered " + tacoSaladOrdered + " Taco Salad, $ " + totalPrice);
	    }
	    if (orderNumber == 5)
	    {
	    	System.out.println("I see you like Fajitas, how many would you like?>>>");
	    	fajitaOrdered = input.nextDouble();
	    	input.nextLine();
	    	totalPrice = (fajitaPrice + fajitaOrdered);
	    	System.out.println("You ordered " + fajitaOrdered + " Fajita, $ " + totalPrice);
	    }
	    if (orderNumber == 6)
	    {
	    	System.out.println("I see you like Walking Tacos, how many would you like?>>>");
	    	walkingTacoOrdered = input.nextDouble();
	    	input.nextLine();
	    	totalPrice = (walkingTacoPrice + walkingTacoOrdered);
	    	System.out.println("You ordered " + walkingTacoOrdered + " Walking Tacos, $ " + totalPrice);
	    }
	    if (orderNumber == 7)
	    {
	    	System.out.println("I see you like Lemonade, how many would you like?>>>");
	    	lemonadeOrdered = input.nextDouble();
	    	input.nextLine();
	    	totalPrice = (lemonadePrice + lemonadeOrdered);
	    	System.out.println("You ordered " + lemonadeOrdered + " Lemonade, $ " + totalPrice);
	    }
	    if (orderNumber == 8)
	    {
	    	System.out.println("I see you like Water, how many would you like?>>>");
	    	waterOrdered = input.nextDouble();
	    	input.nextLine();
	    	totalPrice = (waterPrice + waterOrdered);
	    	System.out.println("You ordered " + waterOrdered + " water, $ " + totalPrice);
	    }
	    if (orderNumber == 9)
	    {
	    	System.out.println("I see you like Soda, how many would you like?>>>");
	    	sodaOrdered = input.nextDouble();
	    	input.nextLine();
	    	totalPrice = (sodaPrice + sodaOrdered);
	    	System.out.println("You ordered " + sodaOrdered + " Soda, $ " + totalPrice);
	    }
	    if (orderNumber == 10)
	    {
	    	System.out.println("I see you like Beer, how many would you like?>>>");
	    	beerOrdered = input.nextDouble();
	    	input.nextLine();
	    	totalPrice = (beerPrice + beerOrdered);
	    	System.out.println("You ordered " + beerOrdered + " Beer, $" + totalPrice);
	    }
	}
	   
	    public static void menu()
	    {
	 System.out.println();
	 System.out.println();
	 System.out.println();
	 System.out.println();
	 System.out.println("***************************************************");
	 System.out.println("                Tacos price 0.99");
	 System.out.println("                Burrito price 1.99");
	 System.out.println("                Chips and Queso price 1.99");
	 System.out.println("                Taco Salad price 3.00");
	 System.out.println("                Fajita price 1.99");
	 System.out.println("                Walking Taco price 1.99");
	 System.out.println("                Lemonade price 1.00");
	 System.out.println("                Water price 1.00");
	 System.out.println("                Soda price 2.00");
	 System.out.println("                Beer price 3.00");
	 System.out.println("***************************************************");
	 System.out.println();
	}
	 public static void tacoTruck()
	 {
		 System.out.println();
		 System.out.println();
		 System.out.println();
		 System.out.println("*********************************************");
		 System.out.println("*                                           *");
		 System.out.println("*                                           *");
		 System.out.println("*                                           *");
		 System.out.println("*              Taco truck                   *");
		 System.out.println("*                                             *");
		 System.out.println("*                                              *");
		 System.out.println("*                                               *");
		 System.out.println("*                                              *");
		 System.out.println("*                                             *");
		 System.out.println("*                                            *");
		 System.out.println("**********************************************");
		 System.out.println("**                                          **");
		 System.out.println("**                                          **");
	
	 }

}