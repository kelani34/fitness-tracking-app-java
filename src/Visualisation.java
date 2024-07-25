abstract class DataAnalysis {
    protected Activity activity;

    public DataAnalysis(Activity activity) {
        this.activity = activity;
    }

    // Method to calculate average metrics
    public abstract void calculateAverages();

    // Method to detect trends
    public abstract void detectTrends();

    // Method to generate charts
    public abstract void generateCharts();
}

class RunningDataAnalysis extends DataAnalysis {
    public RunningDataAnalysis(Activity activity) {
        super(activity);
    }

    @Override
    public void calculateAverages() {
        System.out.println("Calculating averages for Running...");
    }

    @Override
    public void detectTrends() {
        System.out.println("Detecting trends for Running...");
    }

    @Override
    public void generateCharts() {
        System.out.println("Generating charts for Running...");
    }
}

class SwimmingDataAnalysis extends DataAnalysis {
    public SwimmingDataAnalysis(Activity activity) {
        super(activity);
    }

    @Override
    public void calculateAverages() {
        System.out.println("Calculating averages for Swimming...");
    }

    @Override
    public void detectTrends() {
        System.out.println("Detecting trends for Swimming...");
    }

    @Override
    public void generateCharts() {
        System.out.println("Generating charts for Swimming...");
    }
}
