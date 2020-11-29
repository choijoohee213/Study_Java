package abstractEx;

public class Main {

    public static void main(String[] args) {
        Car myCar = new AICar();
        myCar.run();

        Car yourCar = new ManualCar();
        yourCar.run();

    }
}