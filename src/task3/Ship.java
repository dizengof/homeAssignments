public class Ship extends SeaFaringVehicle {

    public Ship() {
        System.out.println("Ship created successfully!");
        this.color = colors[rand.nextInt(7)];
    }

    @Override
    public void showInfo() {
        System.out.println("The color of the ship is " + this.color + ".");
    }
}
