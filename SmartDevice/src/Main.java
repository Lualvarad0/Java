public class Main {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("Apple", "iPhone 12", 128, true);
        SmartWatch watch = new SmartWatch("Samsung", "Galaxy Watch 3", 8, true);

        System.out.println("SmartPhone:");
        System.out.println("Brand: " + phone.getBrand());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Storage capacity: " + phone.getStorageCapacity() + "GB");
        System.out.println("Has camera: " + phone.getHasCamera());

        System.out.println("\nSmartWatch:");
        System.out.println("Brand: " + watch.getBrand());
        System.out.println("Model: " + watch.getModel());
        System.out.println("Storage capacity: " + watch.getStorageCapacity() + "GB");
        System.out.println("Has heart rate sensor: " + watch.getHasHeartRateSensor());
    }
}
