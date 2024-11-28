public class Car extends LandVehicle {

    public Car() {
        System.out.println("Car created successfully!");
        this.color = colors[rand.nextInt(7)];
    }

    @Override
    public void showInfo() {
        System.out.println("The color of the car is " + this.color + ".");
    }
}