import java.util.*;
class VehicleManager {
    private List<Vehicle> vehicles;

    public VehicleManager() {
        vehicles = new ArrayList<>();
        addSampleVehicles();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println("Vehicle added successfully.");
    }

    public void updateVehicle(String vehicleId, Vehicle updatedVehicle) {
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getVehicleId().equals(vehicleId)) {
                vehicles.set(i, updatedVehicle);
                System.out.println("Vehicle updated successfully.");
                return;
            }
        }
        System.out.println("Vehicle not found.");
    }

    public void deleteVehicle(String vehicleId) {
        vehicles.removeIf(vehicle -> vehicle.getVehicleId().equals(vehicleId));
        System.out.println("Vehicle deleted successfully.");
    }

    public void displayAllVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles available.");
        } else {
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle);
            }
        }
    }

    public void displaySoldVehicles() {
        boolean soldExists = false;
        for (Vehicle vehicle : vehicles) {
            if (!vehicle.isAvailable()) {
                System.out.println(vehicle);
                soldExists = true;
            }
        }
        if (!soldExists) {
            System.out.println("No vehicles have been sold.");
        }
    }

    public void searchVehicleByModel(String model) {
        boolean found = false;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getModel().equalsIgnoreCase(model)) {
                System.out.println(vehicle);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No vehicle found with model: " + model);
        }
    }

    private void addSampleVehicles() {
        vehicles.add(new Vehicle("V001", "Model S", "Tesla", 79999.99, "Sedan", true));
        vehicles.add(new Vehicle("V002", "Mustang", "Ford", 55999.99, "Sports", true));
        vehicles.add(new Vehicle("V003", "Civic", "Honda", 24999.99, "Sedan", true));
        vehicles.add(new Vehicle("V004", "Corolla", "Toyota", 22999.99, "Sedan", false));
        vehicles.add(new Vehicle("V005", "X5", "BMW", 60999.99, "SUV", true));
        vehicles.add(new Vehicle("V006", "Q7", "Audi", 68999.99, "SUV", true));
        vehicles.add(new Vehicle("V007", "Accord", "Honda", 29999.99, "Sedan", false));
        vehicles.add(new Vehicle("V008", "Camry", "Toyota", 27999.99, "Sedan", true));
        vehicles.add(new Vehicle("V009", "Explorer", "Ford", 39999.99, "SUV", true));
        vehicles.add(new Vehicle("V010", "Model X", "Tesla", 89999.99, "SUV", true));
        vehicles.add(new Vehicle("V011", "Wrangler", "Jeep", 35999.99, "Off-Road", true));
        vehicles.add(new Vehicle("V012", "Cherokee", "Jeep", 34999.99, "SUV", true));
        vehicles.add(new Vehicle("V013", "F150", "Ford", 45999.99, "Truck", true));
        vehicles.add(new Vehicle("V014", "Ranger", "Ford", 35999.99, "Truck", false));
        vehicles.add(new Vehicle("V015", "CX-5", "Mazda", 28999.99, "SUV", true));
        vehicles.add(new Vehicle("V016", "Mazda3", "Mazda", 20999.99, "Sedan", true));
        vehicles.add(new Vehicle("V017", "Tundra", "Toyota", 47999.99, "Truck", true));
        vehicles.add(new Vehicle("V018", "Silverado", "Chevrolet", 46999.99, "Truck", true));
        vehicles.add(new Vehicle("V019", "Trailblazer", "Chevrolet", 22999.99, "SUV", false));
        vehicles.add(new Vehicle("V020", "Impala", "Chevrolet", 31999.99, "Sedan", true));
    }
}