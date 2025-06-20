public class Vehicle {
    protected String brand = "Ford"; // Vehicle attribute
    public void honk(){             // Vehicle method
        System.err.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";  // Car attribute
    public static void main(String[] args) {
        
        // Create a myCar object
        Car myCar = new Car();

        // call the honk() method (from the Vehicle class) on the myClass object 
        myCar.honk();

        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
