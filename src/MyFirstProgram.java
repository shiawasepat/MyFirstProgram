import java.util.Scanner;
import java.util.Random;

public class MyFirstProgram {
    public static void main(String[] args) {
        System.out.println("\u001b[2J\u001b[34mHello, World!");
        
        // Ask the user for their name
        try (
        Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            
            // Read the user's name and prints it
            String name = scanner.nextLine();
            System.out.println("\u001b[2J\u001b[34;1mHello, " + name + "!\u001b[0m");
            System.out.println("\u001b[31mWelcome to Java!");
        }

        // Get user's current java version
        String version = System.getProperty("java.version");
        
        /* ^^^
        source:
        https://stackoverflow.com/questions/2591083/getting-java-version-at-runtime
         */

        // Give me a fun fact (randomize it)
        final String[] facts = {
            "The name \"Java\" was inspired by a type of coffee grown on the Indonesian island of Java.",
            "The language was first introduced in 1995, under the name \"Oak\" (named after an oak tree outside Gosling's office), but was later renamed Java due to trademark issues.",
            "The Java programming language originated as part of a research project to develop advanced software for a wide variety of network devices and embedded systems",
            "Java was designed with a strong emphasis on reliability and security. Its syntax is clean and strongly typed, reducing common programming errors.",
            "Sun took Microsoft to court because they were calling the MJVM \"Java\" but had failed certification. They didn't have the right to use \"Java\" in their name.",
            "One of the earliest Java contributors and evangelists, Peter Van Der Linden Hated C++, to the point he mocked C++ every chance he could.",
            "Over 56 billion devices run on Java, making it the most popular programming language in the world.",
            "Every single Blu-ray player contains a Java runtime environment, and the vast majority of SIM cards and ATM cards in the world contain Java byte code.",
            "Java limits the number of enum values in a single enum definition to ~32,000 and the number of member variables per class to ~66,000",

        };

        // Randomize facts
        Random random = new Random();
        int index = random.nextInt(facts.length); // Get any variable available from facts 
        /*
        source function:
        https://stackoverflow.com/questions/21726033/picking-a-random-item-from-an-array-of-strings-in-java#comment32854840_21726033
         */

        
        // Print facts and user's java version
        System.out.println("\n\u001b[35mDid you know, " + facts[index]);
        System.out.println("\n\u001b[31mAlso your current java version is " + "\u001b[31;1m" + version + "\u001b[0m");
        System.out.println("\u001b[32mYou're Java version is up to date!\u001b[0m\n");
    }
}