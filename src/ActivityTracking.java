abstract class Activity {
    protected double duration; // in hours
    protected double distance; // in kilometers
    protected double caloriesBurned; // in calories

    public Activity(double duration, double distance, double caloriesBurned) {
        this.duration = duration;
        this.distance = distance;
        this.caloriesBurned = caloriesBurned;
    }

    // Getters
    public double getDuration() { return duration; }
    public double getDistance() { return distance; }
    public double getCaloriesBurned() { return caloriesBurned; }

    // Abstract method to be implemented by subclasses
    public abstract void displayActivityDetails();
}
