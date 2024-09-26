import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declare variables
        Scanner in = new Scanner(System.in);
        String affiliation = "";

        // Prompt user for party affiliation
        System.out.print("Please enter your party affiliation: ");

        // Check for input
        if (in.hasNextLine())
        {
            affiliation = in.nextLine();

            // Use cascaded if to process inputs
            if (affiliation.equalsIgnoreCase("D"))
            {
                System.out.println("You get a Democratic Donkey.");
            } else if (affiliation.equalsIgnoreCase("R")) {
                System.out.println("You get a Republican Elephant.");
            } else if (affiliation.equalsIgnoreCase("I")) {
                System.out.println("You get a Independent Person.");
            } else {
                System.out.println("You get other.");
            }
        } else {
            System.out.println("Invalid party affiliation.");
        }
    }
}