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
		scnr.nextLine();
		
		String[] student = {"Vickie", "Fionna", "Igor", "Emma", "Nazia", "Irene", "Kyrie", "Morgan", "Carol", "Mary"};
		String[] food = {"Ceasar Salad", "Square Pizza", "Sushi", "Pancakes", "Chicken Nuggets", "Grool", "Ice Cream", "Spaghetti", "Coconut Shrimp", "Mangoes"};
		String[] home = {"Rochester Hills, MI", "Empire, MI", "Pittsburgh, PA", "Miami, FL", "Anchorage, AK", "Hayward, CA", "London, England", "Austin, TX", "Phoenix, AZ", "Cleveland, OH"};
		
		int value = (input - 1);
		
		System.out.print("Student " + input + " is " + student[value] + ". What would you like to know about " + student[value] + "? (enter or “hometown” or “favorite food”): ");
		
		String nextAnswer = scnr.nextLine();
		
		try {
		if (nextAnswer.equalsIgnoreCase("hometown")){
			System.out.println(student[value] + " is from " + home[value]);
		}
		else if (nextAnswer.equalsIgnoreCase("favorite food")){
			System.out.println(student[value] + "'s favorite food is/are " + food[value]);
		}
		else{
			throw new IllegalArgumentException("FOLLOW THE DIRECTIONS");
		}
		}catch(IllegalArgumentException e) {
					System.out.println(e.getMessage());
					main(args);
		}
	
		System.out.print("Would you like to know more? (enter y or n) ");
		
		String repeat = scnr.nextLine();
		
		if (repeat.equalsIgnoreCase("y")) {
			main(args);
		}
		else if (repeat.equalsIgnoreCase("n")) {
			inputStudent = false;
			System.out.println("Thanks!");
		}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.print("That student does not exist.  Please try again. (enter a number 1-10): ");
		}catch(InputMismatchException e) {
		System.out.println("FOLLOW THE DIRECTIONS");
		main(args);
	}
		

}}}
