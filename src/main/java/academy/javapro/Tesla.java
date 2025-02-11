package academy.javapro;

public class Tesla extends Vehicle implements Electric, Autonomous {
    private boolean autopilotEnabled;
    private boolean charging;

    // TODO: Create constructor that takes model and year
    public Tesla(String model, int year){
        super("Tesla", model, year);
        this.autopilotEnabled = false;
        this.charging = false;
    }
    // TODO: Set make to "Tesla"
    // TODO: Initialize autopilotEnabled and charging to false

    // TODO: Implement all required methods from Vehicle, Electric, and Autonomous
    // Each method should include appropriate print statements
    @Override
public void startEngine() {
    if (!isRunning) {
        isRunning = true;
        System.out.println(getMake() + " " + getModel() + " started");
    } else {
        System.out.println(getMake() + " " + getModel() + " is already running.");
      }
}

    @Override
    public void stopEngine() {
        if (isRunning) {
            isRunning = false;
            System.out.println(model + " engine stopped.");
        } else {
            System.out.println(model + " is already off.");
        }
    }

    @Override
    public void accelerate() {
        if (isRunning) {
            System.out.println(getMake() + " " + getModel() + " is accelerating...");
        } else {
            System.out.println("Start the engine first!");
        }
    }

    @Override
    public void brake() {
        System.out.println(getMake() + " " + getModel() + " is braking...");
    }

    // Implementing Electric methods
    @Override
    public void charge() {
        if (!charging) {
            charging = true;
            System.out.println(getMake() + " " + getModel() + " is now charging.");
        } else {
            System.out.println(getMake() + " " + getModel() + " is already charging.");
        }
    }

    @Override
    public boolean isCharging() {
        return charging;
    }

    // Implementing Autonomous methods
    @Override
    public void enableAutopilot() {
        if (!autopilotEnabled) {
            autopilotEnabled = true;
            System.out.println("Autopilot enabled");
        } else {
            System.out.println(model + " autopilot is already on.");
        }
    }

    @Override
    public void disableAutopilot() {
        if (autopilotEnabled) {
            autopilotEnabled = false;
            System.out.println("Autopilot disabled");
        } else {
            System.out.println(model + "Autopilot is already off.");
        }
    }

    @Override
    public boolean isAutopilotEnabled() {
        return autopilotEnabled;
    }
}
