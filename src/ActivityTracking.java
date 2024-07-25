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

class Running extends Activity {
    public Running(double duration, double distance, double caloriesBurned) {
        super(duration, distance, caloriesBurned);
    }

    @Override
    public void displayActivityDetails() {
        System.out.println("Running Activity: Duration = " + duration + " hours, Distance = " + distance + " km, Calories Burned = " + caloriesBurned);
    }
}

class Swimming extends Activity {
    public Swimming(double duration, double distance, double caloriesBurned) {
        super(duration, distance, caloriesBurned);
    }

    @Override
    public void displayActivityDetails() {
        System.out.println("Swimming Activity: Duration = " + duration + " hours, Distance = " + distance + " km, Calories Burned = " + caloriesBurned);
    }
}

class Cycling extends Activity {
    public Cycling(double duration, double distance, double caloriesBurned) {
        super(duration, distance, caloriesBurned);
    }

    @Override
    public void displayActivityDetails() {
        System.out.println("Cycling Activity: Duration = " + duration + " hours, Distance = " + distance + " km, Calories Burned = " + caloriesBurned);
    }
}
