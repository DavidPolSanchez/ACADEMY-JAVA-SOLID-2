package lsp.bad;

public class CombustionCar extends Vehicle{

    @Override
    public void accelerate() {
        System.out.println("accelerating the car");
    }

    @Override
    public void stop() {
        System.out.println("stopping the car");
    }
}
