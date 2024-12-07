/*
 * David Doughty
 * CSCE 145 001
 */

public class Coffee {
    private String name;
    private int caffeineContent;

    // default constructor
    public Coffee() {
        this.name = "none";
        this.caffeineContent = 50;
    }

    // param constructor
    public Coffee(String name, int caffeineContent) {
        this.name = name;
        setCaffeineContent(caffeineContent); 
    }

    // accessors
    public String getName() {
        return name;
    }

    // 
    public int getCaffeineContent() {
        return caffeineContent;
    }

    // mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setCaffeineContent(int caffeineContent) {
        if (caffeineContent >= 50 && caffeineContent <= 300) {
            this.caffeineContent = caffeineContent;
        } else {
            System.out.println("Invalid caffeine content! It must be between 50 and 300.");
        }
    }

    // method for risky caffeine amount
    public double riskyAmount() {
        return 180.0 / ((caffeineContent / 100.0) * 6);
    }

    // equals method
    public boolean equals(Coffee otherCoffee) {
        return this.name.equals(otherCoffee.name) && this.caffeineContent == otherCoffee.caffeineContent;
    }

    // toString method 
    public String toString() {
        return "Name: " + name + "\nCaffeine Amount: " + caffeineContent;
    }
}
