public abstract class Device {
    private boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println(getClass().getSimpleName() + " is now ON.");
        showStatus();
    }

    public void turnOff() {
        isOn = false;
        System.out.println(getClass().getSimpleName() + " is now OFF.");
    }

    public boolean isOn() {
        return isOn;
    }

    public abstract void showStatus();

    public static void toggleDevices(java.util.List<Device> devices, boolean power) {
        for (Device d : devices) {
            if (power) d.turnOn();
            else d.turnOff();
        }
    }

    public static int countPoweredOn(java.util.List<Device> devices) {
        int count = 0;
        for (Device d : devices) {
            if (d.isOn()) count++;
        }
        return count;
    }
}
