class Vehicle {
    private String vehicleId;
    private String model;
    private String brand;
    private double price;
    private String vehicleType;
    private boolean availabilityStatus;

    public Vehicle(String vehicleId, String model, String brand, double price, String vehicleType, boolean availabilityStatus) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.vehicleType = vehicleType;
        this.availabilityStatus = availabilityStatus;
    }

    public String getVehicleId() { return vehicleId; }
    public void setVehicleId(String vehicleId) { this.vehicleId = vehicleId; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getVehicleType() { return vehicleType; }
    public void setVehicleType(String vehicleType) { this.vehicleType = vehicleType; }

    public boolean isAvailable() { return availabilityStatus; }
    public void setAvailabilityStatus(boolean availabilityStatus) { this.availabilityStatus = availabilityStatus; }

    @Override
    public String toString() {
        return "VehicleId: " + vehicleId + ", Model: " + model + ", Brand: " + brand + ", Price: " + price +
                ", Type: " + vehicleType + ", Available: " + (availabilityStatus ? "Yes" : "No");
    }
}
