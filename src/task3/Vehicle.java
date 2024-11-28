import java.util.Random;

sealed abstract class Vehicle permits SeaFaringVehicle, LandVehicle, FlyingVehicle {
    String[] colors = {"red", "orange", "yellow", "green", "blue", "purple", "pink"};
    Random rand = new Random();
    String color;

    abstract void move();
    abstract void stop();
    abstract void showInfo();
}

non-sealed abstract class SeaFaringVehicle extends Vehicle {
    @Override
    void move() {
        System.out.println("It swims!");
    }

    @Override
    void stop() {
        System.out.println("It stopped swimming.");
    }
}

non-sealed abstract class LandVehicle extends Vehicle {
    @Override
    void move() {
        System.out.println("It rides!");
    }

    @Override
    void stop() {
        System.out.println("It stopped riding.");
    }
}

non-sealed abstract class FlyingVehicle extends Vehicle {

    @Override
    void move() {
        System.out.println("It flies!");
    }

    @Override
    void stop() {
        System.out.println("It stopped flying.");
    }
}
