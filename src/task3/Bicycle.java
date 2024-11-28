public class Bicycle extends LandVehicle{

    public Bicycle() {
        System.out.println("Bicycle created successfully!");
        this.color = colors[rand.nextInt(7)];
    }

    @Override
    public void showInfo() {
        System.out.println("The color of the bicycle is " + this.color + ".");
    }
}
