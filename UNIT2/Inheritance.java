class Vehicle {
    protected String brand = "Ford";

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    public String modelName = "Mustang";
}

public class Inheritance {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        Car myCar = new Car();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        // Call the honk() method from the Vehicle class
        myVehicle.honk();

        // Display the value of the brand attribute (from the Vehicle class) and the
        // value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}

// Output:-
// Tuut,tuut!
// Tuut,tuut!
// Ford Mustang
