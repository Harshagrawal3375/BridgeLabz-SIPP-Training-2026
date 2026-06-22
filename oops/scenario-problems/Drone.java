
public class Drone {
    int droneId;
    int batteryPercentage;
    private static String companyName;

    
   
    public Drone(int droneId, int batteryPercentage, String companyName){
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
        this.companyName = companyName;
    }
    public void startDelivery(){
        if(batteryPercentage < 20){
            System.out.println("Battery Low can't start delivery");
        }else{
            batteryPercentage = batteryPercentage-20;
            System.out.println("Drone started delivery");
        }
    }
    public void displayStatus(){
        System.out.println("Drone id: " + droneId);
        System.out.println("Battery Percentage : " + batteryPercentage);
        System.out.println("Company name : " + companyName);
    }

    public static void main(String[] args) {
        Drone d1 = new Drone(1,87,"Alpha");
        Drone d2 = new Drone(2,47,"Alpha");
        Drone d3 = new Drone(3,75,"Alpha");
        
        d1.startDelivery();
        d2.startDelivery();
        d3.startDelivery();

        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();
    }    
}
