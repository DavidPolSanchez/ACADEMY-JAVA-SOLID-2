package ocp.bad;

public class SportCar extends Car implements accelerate {



    void accelerate() {
        startConfort();
    }

    // mal uso, seguir agregando funcionalidades concretas:

    private void startConfort() {
        // do..
    }

}