package studentrentals;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class StudentRentalsApp {

    private UserService userService = new UserService();
    private PropertyService propertyService = new PropertyService();
    private BookingService bookingService = new BookingService();
    private ReviewService reviewService = new ReviewService();
    private SearchService searchService = new SearchService(propertyService);

    private User currentUser;
    private Scanner scanner = new Scanner(System.in);

    // ENTRY POINT
    public static void main(String[] args) {
        new StudentRentalsApp().run();
    }

    // MAIN LOOP
    public void run() {
        boolean exit = false;

        while (!exit) {
            if (currentUser == null) {
                // When no one is logged in, show welcome menu.
                exit = showWelcomeMenu();
            } else {
                // When someone is logged in, route to their menu.
                switch (currentUser.getRole()) {
                    case "STUDENT" -> showStudentMenu();
                    case "HOMEOWNER" -> showHomeOwnerMenu();
                    case "ADMIN" -> showAdminMenu();
                }
            }
        }

        System.out.println("Goodbye.");
    }

    /**
     * Shows the welcome menu and returns true if the user chose to exit,
     * false if they want to continue (e.g. after register or login).
     */
    private boolean showWelcomeMenu() {
        System.out.println("\n====== Student Rentals ======");
        System.out.println(" 1. Register as a Student");
        System.out.println(" 2. Register as a Home owner");
        System.out.println(" 3. Login");
        System.out.println(" 4. Exit");
        System.out.print("\nChoice = ");

        String choice = scanner.nextLine();

        switch (choice) {
            case "1" -> {
                // TODO: implement registerStudent();
                // registerStudent();
                System.out.println("Register student (not implemented yet).");
                return false;
            }
            case "2" -> {
                // TODO: implement registerHomeowner();
                // registerHomeowner();
                System.out.println("Register homeowner (not implemented yet).");
                return false;
            }
            case "3" -> {
                // TODO: implement login();
                // currentUser = login();
                System.out.println("Login (not implemented yet).");
                return false;
            }
            case "4" -> {
                // User chose Exit
                return true;
            }
            default -> {
                System.out.println("Invalid choice. Please try again.");
                return false;
            }
        }
    }

    // Stub methods so the switch on role compiles.
    // You can fill these with the real menus later.

    private void showStudentMenu() {
        System.out.println("Student menu (not implemented yet).");
    }

    private void showHomeOwnerMenu() {
        System.out.println("Homeowner menu (not implemented yet).");
    }

    private void showAdminMenu() {
        System.out.println("Admin menu (not implemented yet).");
    }
}
