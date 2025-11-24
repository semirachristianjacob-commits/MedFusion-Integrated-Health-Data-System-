import java.util.Scanner;

public class Main {
    private static Patient[] patients = new Patient[50];
    private static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== PATIENT MANAGEMENT SYSTEM ===");
            System.out.println("1. Add Inpatient");
            System.out.println("2. Add Outpatient");
            System.out.println("3. View All Patients");
            System.out.println("4. Search Patient by ID");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addInpatient(sc);
                case 2 -> addOutpatient(sc);
                case 3 -> viewAll();
                case 4 -> searchById(sc);
                case 5 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }
