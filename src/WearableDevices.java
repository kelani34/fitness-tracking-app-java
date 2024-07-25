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

class Fitbit extends WearableDevice {
    public Fitbit() {
        super("Fitbit");
    }

    @Override
    public void connect() {
        System.out.println("Connecting to Fitbit...");
    }

    @Override
    public Activity retrieveActivityData() {
        // Dummy data
        return new Running(1.0, 5.0, 300);
    }
}

class AppleWatch extends WearableDevice {
    public AppleWatch() {
        super("Apple Watch");
    }

    @Override
    public void connect() {
        System.out.println("Connecting to Apple Watch...");
    }

    @Override
    public Activity retrieveActivityData() {
        // Dummy data
        return new Swimming(1.0, 2.0, 250);
    }
}
