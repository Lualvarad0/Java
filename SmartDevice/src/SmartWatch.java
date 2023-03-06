public class SmartWatch extends SmartDevice {
    private boolean hasHeartRateSensor;

    public SmartWatch() {
        // Constructor vacío
    }

    public SmartWatch(String brand, String model, int storageCapacity, boolean hasHeartRateSensor) {
        super(brand, model, storageCapacity);
        this.hasHeartRateSensor = hasHeartRateSensor;
    }

    public boolean getHasHeartRateSensor() {
        return hasHeartRateSensor;
    }

    public void setHasHeartRateSensor(boolean hasHeartRateSensor) {
        this.hasHeartRateSensor = hasHeartRateSensor;
    }
}
