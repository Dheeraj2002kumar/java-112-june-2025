// public class ClassMethods {
//     static void printMethod(){
//         System.out.println("Hello world!");
//     }

//     // demonstrate the differences between static and public methods:
//     // static method
//     static void myStaticMethod(){
//         System.out.println("Static method can be called without creating objects");
//     }

//     // public method
//     public void myPublicMethod(){
//         System.out.println("Public methods must be called by creating objects");
//     }

//     public static void main(String[] args) {
//         // printMethod();

//         myStaticMethod();  // call the static method
//         // myPublicMethod();  // This would compile an error

//         ClassMethods myObj = new ClassMethods();  // create an object of ClassMethods
//         // myObj.myPublicMethod();  // call the public method on the object 
//     }
// }



// ---------- Access methods with an object----------------------

public class ClassMethods{

    // create a fullThrottle() method
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
    }

    // create a speed() method and add a parameter
    public void speed(int maxSpeed){
        System.out.println("Max speed is: " + maxSpeed);
    }

    // inside main, call the methods on the myCar object
    public static void main(String[] args) {
        ClassMethods myCar = new ClassMethods();  // create a myCar object
        myCar.fullThrottle();                   // call the fullTrottle() method
        myCar.speed(200);
    }
}
