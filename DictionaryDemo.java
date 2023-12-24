package class_construcetor;
import java.util.Scanner;
import java.util.TreeMap;

public class DictionaryDemo {
    public static void main(String[] args) {
        TreeMap<String, String> dictionary = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nDictionary Application");
            System.out.println("1. Add word-definition pair");
            System.out.println("2. Retrieve definition of a word");
            System.out.println("3. Display all word-definition pairs");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the word: ");
                    String word = scanner.nextLine();
                    System.out.print("Enter the definition: ");
                    String definition = scanner.nextLine();
                    dictionary.put(word, definition);
                    System.out.println("Word-definition pair added to the dictionary.");
                    break;
                case 2:
                    System.out.print("Enter the word to retrieve its definition: ");
                    String searchWord = scanner.nextLine();
                    if (dictionary.containsKey(searchWord)) {
                        System.out.println("Definition: " + dictionary.get(searchWord));
                    } else {
                        System.out.println("Word not found in the dictionary.");
                    }
                    break;
                case 3:
                    System.out.println("All word-definition pairs in alphabetical order:");
                    for (String key : dictionary.keySet()) {
                        System.out.println(key + " - " + dictionary.get(key));
                    }
                    break;
                case 4:
                    System.out.println("Exiting the dictionary application. Bye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }
}

