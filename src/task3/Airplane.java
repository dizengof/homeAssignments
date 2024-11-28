public class Airplane extends FlyingVehicle{

    public Airplane() {
        System.out.println("Airplane created successfully!");
        this.color = colors[rand.nextInt(7)];
    }

    @Override
    public void showInfo() {
        System.out.println("The color of the airplane is " + this.color + ".");
    }
}
