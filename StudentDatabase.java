import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentDatabase {

	public static void main(String[] args) {
		System.out.print("Which student would you like to learn more about? (Enter a number 1-10): ");
		Scanner scnr = new Scanner(System.in);
		boolean inputStudent = true;
		
		while (inputStudent) {
		try {
		int input = scnr.nextInt();
		
		String[] student = {"Vickie", "Fionna", "Igor", "Emma", "Nazia", "Irene", "Kyrie", "Morgan", "Carol", "Mary"};
		String[] height = {"5'11", "5'6", "6'2", "4'11", "5'9", "5'5", "6'4", "5'1", "6'6", "5'7"};
		String[] home = {"Rochester Hills, MI", "Empire, MI", "Pittsburgh, PA", "Miami, FL", "Anchorage, AK", "Hayward, CA", "London, England", "Austin, TX", "Phoenix, AZ", "Cleveland, OH"};
		
		int value = (input - 1);
		
		System.out.print("Student " + input + " is " + student[value] + ". What would you like to know about " + student[value] + "? (enter or “hometown” or “height”): ");
		
		String nextAnswer = scnr.next();
		
		//try {
		if (nextAnswer.equalsIgnoreCase("hometown")){
			System.out.println(student[value] + " is from " + home[value]);
		}
		else if (nextAnswer.equalsIgnoreCase("height")){
			System.out.println(student[value] + " is " + height[value]);
		}
		else {
			throw new IllegalAccessException ("Follow the directions");
		}
		
		System.out.print("Would you like to know more? (enter y or n) ");
		
		String repeat = scnr.next();
		
		if (repeat.equalsIgnoreCase("y")) {
			main(args);
		}
		else if (repeat.equalsIgnoreCase("n")) {
			inputStudent = false;
			System.out.println("Thanks!");
		}
			
		//
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.print("That student does not exist.  Please try again. (enter a number 1-10): ");
	}catch(IllegalAccessException e) {
		System.out.println(e.getMessage());
		break;
	}

}}}
