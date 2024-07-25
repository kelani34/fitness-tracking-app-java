abstract class WearableDevice {
    protected String deviceName;

    public WearableDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    // Method to connect to the device
    public abstract void connect();

    // Method to retrieve activity data from the device
    public abstract Activity retrieveActivityData();
}
