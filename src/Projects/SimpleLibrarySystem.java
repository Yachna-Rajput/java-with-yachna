package Projects;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleLibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> books = new ArrayList<>();

                books.add("Java Programming");
                books.add("Data Structures");
                books.add("Operating System");

                int choice;
                do {
                    System.out.println("\n=== Library Menu ===");
                    System.out.println("1. View Books");
                    System.out.println("2. Add Book");
                    System.out.println("3. Remove Book");
                    System.out.println("4. Exit");
                    System.out.print("Enter your choice: ");
                    choice = sc.nextInt();
                    sc.nextLine(); // consume newline

                    switch (choice) {
                        case 1:
                            System.out.println("Books in library: " + books);
                            break;
                        case 2:
                            System.out.print("Enter book name to add: ");
                            String newBook = sc.nextLine();
                            books.add(newBook);
                            System.out.println(newBook + " added.");
                            break;
                        case 3:
                            System.out.print("Enter book name to remove: ");
                            String removeBook = sc.nextLine();
                            if (books.remove(removeBook)) {
                                System.out.println(removeBook + " removed.");
                            } else {
                                System.out.println("Book not found!");
                            }
                            break;
                        case 4:
                            System.out.println("Exiting Library System...");
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                } while (choice != 4);

                sc.close();
            }
        }
