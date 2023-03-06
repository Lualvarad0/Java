public class SmartPhone extends SmartDevice {
    private boolean hasCamera;

    public SmartPhone() {
        // Constructor vacío
    }

    public SmartPhone(String brand, String model, int storageCapacity, boolean hasCamera) {
        super(brand, model, storageCapacity);
        this.hasCamera = hasCamera;
    }

    public boolean getHasCamera() {
        return hasCamera;
    }

    public void setHasCamera(boolean hasCamera) {
        this.hasCamera = hasCamera;
    }
}
