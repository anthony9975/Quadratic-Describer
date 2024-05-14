/* * Anthony Ma
 * 9/26/2023
 * This code will describe the features of a quadratic function.
 */
import java.util.*;
public class QuadraticClient {
	public static void main (String[] args) {//this is the client code that accepts user input and runs quadratic
		Scanner input = new Scanner (System.in);
		String quit = "B";
		System.out.println("Welcome to the Quadratic Describer");
		System.out.print("Provide values for coefficients a, b, and c\n");
		while (!quit.equals("quit")) {
			System.out.print("\na: ");
			double a = input.nextDouble();
			System.out.print("b: ");
			double b = input.nextDouble();
			System.out.print("c: ");
			double c = input.nextDouble();
			System.out.println(Quadratic.quadrDescriber(a, b, c));
			System.out.println("\nDo you want to keep going? (Type \"quit\" to end)");
			quit = input.next();
			quit = quit.toLowerCase();
		}
		input.close();
	}
}
