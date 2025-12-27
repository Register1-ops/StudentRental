package studentrentals;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class StudentRentalsApp{
    
    private UserService userService = new UserService();
    private PropertyService propertyService = new PropertyService();
    private BookingService bookingService = new BookingService();
    private ReviewService reviewService = new ReviewService();
    private SearchService searchService = new SearchService(propertyService);

    private User currentUser;
    private Scanner scanner = new Scanner(System.in);

    public static void(String[] args){
        new StudentRentalsApp().run()
    }

    public void run(){
        boolean exit = false;
        while (!exit){
            if (currentUser == null){
                exit = showWelcomeMenu();
            }
            else{
                switch (currentUser.getRole()){
                    case "STUDENT" -> showStudentMenu();
                    case "HOMEOWNER" -> showHomeOwnerMenu();
                    case "ADMIN" -> showAdminMenu();
                }
                
            }
        }
        System.out.println("Goodbye.")


        private boolean showWelcomeMenu(){
            System.out.println("\n======Student Rentals====");
            System.out.println(" 1. Register as a Student");
            System.out.println(" 2. Register as a Home owner");
            System.out.println(" 3. Login");
            System.out.println(" 4. Exit");
            System.out.print("\nChoice  = ");
            String choice = scanner.nextLine();

            switch choice();
        }


    }













}