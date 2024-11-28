import java.util.Scanner;

public class Main {

    enum VehicleNames {AIRPLANE, BICYCLE, BOAT, CAR, HELICOPTER, SHIP}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle userVehicle;
        int key = 0;

        while(true) {
            System.out.println("-------------------------------------------");
            System.out.println("What kind of vehicle do you want to create?");
            System.out.println("1. Airplane\n2. Bicycle\n3. Boat\n4. Car\n5. Helicopter\n6. Ship");
            while (key < 1 || key > 6) key = sc.nextInt();
            userVehicle = create(key);
            key = 0;

            System.out.println("What do you want your vehicle to do?");
            System.out.println("1. Move\n2. Stop");
            while (key < 1 || key > 2) key = sc.nextInt();
            switch (key) {
                case 1:
                    userVehicle.move();
                    break;
                case 2:
                    userVehicle.stop();
                    break;
            }
            key = 0;

            System.out.println("Show vehicle info? \n1. Yes\n2. No");
            while (key < 1 || key > 2) key = sc.nextInt();
            if (key == 1) userVehicle.showInfo();
            key = 0;

            System.out.println("Do you want to create another vehicle? \n1. Yes\n2. No");
            if (sc.nextInt() == 2) break;
        }
    }

    public static Vehicle create(int key) {
        Vehicle tmp = null;
        switch(VehicleNames.values()[key - 1]) {
            case AIRPLANE:
                tmp = new Airplane();
                break;
            case BICYCLE:
                tmp = new Bicycle();
                break;
            case BOAT:
                tmp = new Boat();
                break;
            case CAR:
                tmp = new Car();
                break;
            case HELICOPTER:
                tmp = new Helicopter();
                break;
            case SHIP:
                tmp = new Ship();
                break;
        }
        return tmp;
    }
}
