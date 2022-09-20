package ocp.bad;

public class ConfortCar extends Car implements accelerate {



    void accelerate() {
        injectNitro();
    }

    // mal uso, seguir agregando funcionalidades concretas:

    private void injectNitro() {
        // do..
    }

}