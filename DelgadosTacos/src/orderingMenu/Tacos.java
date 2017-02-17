package orderingMenu;
import java.util.Scanner;

public class Tacos
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		tacoTruck();
		menu();
		orderingMenu();
	}
	public static void orderingMenu()
	{
		
		String tacoString;
		double tacoPrice = .50;
		double burritoPrice = 1.99;
		double tacoOrdered;
		double burritoOrdered;
		double totalPrice;
		double totalPriceWithTax;
		
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.println("How many tacos do you want? >>>");
	    tacoOrdered = inputDevice.nextDouble(); 
	    inputDevice.nextLine();
	    
	    System.out.println("How many burritos do you want? >>>");
	    burritoOrdered = inputDevice.nextDouble();
	    inputDevice.nextLine();
	    
	    totalPrice = (tacoPrice * tacoOrdered) + (burritoOrdered * burritoPrice);
	    
	    System.out.println("How you ordered " + tacoOrdered + " Tacos, " + burritoOrdered +" burritos, for a total price of " + totalPrice);
	    
	    totalPriceWithTax = totalPrice * 1.075;
	    System.out.println("Total with tax is " + totalPriceWithTax);
	
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
