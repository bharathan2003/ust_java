import java.util.Scanner;

public class VehicleShowroomApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VehicleManager vehicleManager = new VehicleManager();
        AdminManager adminManager = new AdminManager();

        adminManager.addAdmin(new Admin("A1", "Admin User", "admin@showroom.com", "admin123"));

        System.out.println("Welcome to Vehicle Showroom Management System");
        System.out.print("Enter Admin Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Admin Password: ");
        String password = scanner.nextLine();

        if (adminManager.validateAdmin(email, password)) {
            System.out.println("Login successful.");
            int choice;

            do {
                System.out.println("\n1. Add Vehicle\n2. Update Vehicle\n3. Delete Vehicle\n4. Display All Vehicles\n5. Display Sold Vehicles\n6. Search a vehicle\n7. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine(); 

                switch (choice) {
                    case 1:
                        System.out.print("Enter Vehicle ID: ");
                        String vehicleId = scanner.nextLine();
                        System.out.print("Enter Model: ");
                        String model = scanner.nextLine();
                        System.out.print("Enter Brand: ");
                        String brand = scanner.nextLine();
                        System.out.print("Enter Price: ");
                        double price = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Enter Vehicle Type: ");
                        String vehicleType = scanner.nextLine();
                        System.out.print("Is Available (true/false): ");
                        boolean availability = scanner.nextBoolean();

                        Vehicle vehicle = new Vehicle(vehicleId, model, brand, price, vehicleType, availability);
                        vehicleManager.addVehicle(vehicle);
                        break;

                    case 2:
                        System.out.print("Enter Vehicle ID to update: ");
                        String updateId = scanner.nextLine();
                        System.out.print("Enter Updated Model: ");
                        String updatedModel = scanner.nextLine();
                        System.out.print("Enter Updated Brand: ");
                        String updatedBrand = scanner.nextLine();
                        System.out.print("Enter Updated Price: ");
                        double updatedPrice = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Enter Updated Vehicle Type: ");
                        String updatedType = scanner.nextLine();
                        System.out.print("Is Available (true/false): ");
                        boolean updatedAvailability = scanner.nextBoolean();

                        Vehicle updatedVehicle = new Vehicle(updateId, updatedModel, updatedBrand, updatedPrice, updatedType, updatedAvailability);
                        vehicleManager.updateVehicle(updateId, updatedVehicle);
                        break;

                    case 3:
                        System.out.print("Enter Vehicle ID to delete: ");
                        String deleteId = scanner.nextLine();
                        vehicleManager.deleteVehicle(deleteId);
                        break;
                     

                    case 4:
                        vehicleManager.displayAllVehicles();
                        break;

                    case 5:
                        vehicleManager.displaySoldVehicles();
                        break;

                    case 6:
                        System.out.print("Enter Model to search: ");
                        String searchModel = scanner.nextLine();
                        vehicleManager.searchVehicleByModel(searchModel);
                        break;   

                    case 7:
                        System.out.println("Exiting... Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 6);
        } else {
            System.out.println("Invalid login credentials.");
        }

        scanner.close();
    }
}