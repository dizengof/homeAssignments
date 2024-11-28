public class Helicopter extends FlyingVehicle {

    public Helicopter() {
        System.out.println("Helicopter created successfully!");
        this.color = colors[rand.nextInt(7)];
    }

    @Override
    public void showInfo() {
        System.out.println("The color of the helicopter is " + this.color + ".");
    }
}
