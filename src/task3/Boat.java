public class Boat extends SeaFaringVehicle {

    public Boat() {
        System.out.println("Boat created successfully!");
        this.color = colors[rand.nextInt(7)];
    }

    @Override
    public void showInfo() {
        System.out.println("The color of the boat is " + this.color + ".");
    }
}
