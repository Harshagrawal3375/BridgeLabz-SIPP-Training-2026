class Vehicle {

    String vehicleNumber;
    String ownerName;
    String vehicleType;

    // Constructor
    Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    static void displayCars(Vehicle[] vehicles) {
        System.out.println("---- Cars ----");
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i].vehicleType.equalsIgnoreCase("car")) {
                System.out.println(vehicles[i].vehicleNumber + " - " + vehicles[i].ownerName);
            }
        }
    }

    static void displayBikes(Vehicle[] vehicles) {
        System.out.println("---- Bikes ----");
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i].vehicleType.equalsIgnoreCase("bike")) {
                System.out.println(vehicles[i].vehicleNumber + " - " + vehicles[i].ownerName);
            }
        }
    }

    public static void main(String[] args) {

        
        Vehicle[] vehicles = new Vehicle[10];

        vehicles[0] = new Vehicle("UP32AB1234", "Rahul", "car");
        vehicles[1] = new Vehicle("UP32CD5678", "Amit", "bike");
        vehicles[2] = new Vehicle("UP32EF9012", "Neha", "car");
        vehicles[3] = new Vehicle("UP32GH3456", "Riya", "bike");
        vehicles[4] = new Vehicle("UP32IJ7890", "Arjun", "car");
        vehicles[5] = new Vehicle("UP32KL1122", "Priya", "bike");
        vehicles[6] = new Vehicle("UP32MN3344", "Vikas", "car");
        vehicles[7] = new Vehicle("UP32OP5566", "Sneha", "bike");
        vehicles[8] = new Vehicle("UP32QR7788", "Karan", "car");
        vehicles[9] = new Vehicle("UP32ST9900", "Pooja", "bike");

        displayCars(vehicles);
        System.out.println();
        displayBikes(vehicles);
    }
}