package switches;
import java.util.Scanner;
public class switchDayofWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a day during the week for your schedule >>> ");
		day = input.nextLine();
		switch(day)
		{
		case "Monday":
			System.out.print("Reserve room for Friday meeting");
			break;
		case "Tuesday":
		case "tuesday":
			System.out.print("Swim practice and basketball game");
			break;
		case "Wednesday":
			System.out.print("Pitching lesson");
			break;
		case "Thursday":
			System.out.print("Swim practice");
			break;
		case "Friday":
			System.out.print("Swim practice and basketball game");
			break; 
		case "Saturday":
			System.out.print("Regionals");
			break;
		case "Sunday":
			System.out.print("Regionals, going away party, celebrate Valentine's Day, family game day");
		}

	}

}
