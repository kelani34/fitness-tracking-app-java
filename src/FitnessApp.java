import java.util.Scanner;

public class FitnessApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WearableDevice device = selectWearableDevice(scanner);
        device.connect();

        Activity activity = device.retrieveActivityData();
        activity.displayActivityDetails();

        DataAnalysis analysis = selectDataAnalysis(activity);
        analysis.calculateAverages();
        analysis.detectTrends();
        analysis.generateCharts();
    }

    private static WearableDevice selectWearableDevice(Scanner scanner) {
        System.out.println("Select a wearable device:");
        System.out.println("1. Fitbit");
        System.out.println("2. Apple Watch");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: return new Fitbit();
            case 2: return new AppleWatch();
            default: throw new IllegalArgumentException("Invalid choice");
        }
    }

    private static DataAnalysis selectDataAnalysis(Activity activity) {
        if (activity instanceof Running) {
            return new RunningDataAnalysis(activity);
        } else if (activity instanceof Swimming) {
            return new SwimmingDataAnalysis(activity);
        } else if (activity instanceof Cycling) {
//             return new CyclingDataAnalysis(activity);
        }
        throw new IllegalArgumentException("Unsupported activity type");
    }
}
