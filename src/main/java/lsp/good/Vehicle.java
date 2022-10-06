package lsp.bad;

public sealed class Vehicle  permits ElectricCar,CombustionCar{

    void accelerate();

    void stop();
}
