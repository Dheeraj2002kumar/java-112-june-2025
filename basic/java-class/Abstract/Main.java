// abstract class
abstract class Animal {

    // Abstract method (does not have a body)
    public abstract void animalSound();

    // regular method
    public void sleep(){
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
class Pig extends Animal{
    public void animalSound(){

        // The body of animalSound() is provided here
        System.out.println("The piig says: wee wee");
    }
}


public class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig();  // create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}
