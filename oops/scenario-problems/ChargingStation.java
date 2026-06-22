class ChargingStation {

    static int totalStations = 0;
    static double electricityRate = 5.0;

    int stationId;
    double unitsConsumed;

    
    ChargingStation(int stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++; 
    }

    double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    void displayStationDetails() {
        System.out.println("Station ID: " + stationId);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Rate per unit: " + electricityRate);
        System.out.println("Total Bill: " + calculateBill());
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {

        ChargingStation s1 = new ChargingStation(1, 100);
        ChargingStation s2 = new ChargingStation(2, 150);
        ChargingStation s3 = new ChargingStation(3, 200);
        ChargingStation s4 = new ChargingStation(4, 80);
        ChargingStation s5 = new ChargingStation(5, 60);

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        System.out.println("Total Stations: " + ChargingStation.totalStations);

        System.out.println("\n--- Electricity Rate Updated ---\n");
        ChargingStation.electricityRate = 7.5;

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();
    }
}