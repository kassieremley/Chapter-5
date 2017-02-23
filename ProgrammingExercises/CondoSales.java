package ProgrammingExercises;
import javax.swing.JOptionPane;
public class CondoSales {
public static void main(String[] args) 
{ 
	int user;
	int user2;
	int totalPrice;
	int parkPrice = 150000;
	int golfPrice = 170000;
	int lakePrice = 210000;
	int parkingGarage = 5000;
	
	user = Integer.parseInt(JOptionPane.showInputDialog(null, "Would you like \n(1) Park view \n(2) Golf Course view \n(3) Lake view?"));
	
	if (user == 1)
	{
		JOptionPane.showMessageDialog(null, "You want a Park view. That will be $" + parkPrice);
		user2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Would you like a \n(1) Parking space \n(2) Parking garage?"));
		if (user2 == 1) 
		{
			totalPrice = parkPrice; 
			JOptionPane.showMessageDialog(null,  "You want a park view with a parking space. Your total will be $" + totalPrice);
		}
		else
		{
			totalPrice = parkPrice + parkingGarage;
			JOptionPane.showMessageDialog(null,  "You want a park view with a parking garage. Your total will be $" + totalPrice);
		}
	}
	if (user == 2)
	{
		JOptionPane.showMessageDialog(null, "You want a Golf Course view. That will be $" + parkPrice);
		user2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Would you like a \n(1) Parking space \n(2) Parking garage?"));
		if (user2 == 1)
		{
			totalPrice = golfPrice;
			JOptionPane.showMessageDialog(null,  "You want a Golf Course view with a parking garage. Your total will be $" + totalPrice);
		}
		else
		{
			totalPrice = golfPrice;
			JOptionPane.showMessageDialog(null,  "You want a Golf Course view with a parking space. Your total will be $" + totalPrice);
		}
	if (user == 3)	
	{
		JOptionPane.showMessageDialog(null, "You want a Lake view. That will be $" + parkPrice);
		user2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Would you like a \n(1) Parking space \n(2) Parking garage?"));
		if (user2 == 1)
		{
			totalPrice = lakePrice;
			JOptionPane.showMessageDialog(null,  "You want a Lake view with a parking garage. Your total will be $" + totalPrice);
		}
		else
		{
			totalPrice = lakePrice;
			JOptionPane.showMessageDialog(null,  "You want a Lake view with a parking space. Your total will be $" + totalPrice);
		}
	}
		
		
		
	}
	
	}

}
