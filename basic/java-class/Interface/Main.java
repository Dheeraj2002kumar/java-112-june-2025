// Interface 
interface Animal {
    public void animalSound();  // interface method(does not have a body)
    public void sleep();   // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Animal{
    public void animalSound(){

        // The body of animalSound() is provided here
        System.out.println("The pip sys: wee wee");
    }

    public void sleep(){
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}

public class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig();  // create a pig object 
        myPig.animalSound();
        myPig.sleep();
    }    
}
