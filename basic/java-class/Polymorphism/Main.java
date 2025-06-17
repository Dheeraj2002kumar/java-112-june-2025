class Animal {
    public void animalSound(){
        System.out.println("This animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound(){
        System.out.println("The dog says: bow wow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myPig = new Pig();  // Create a Pig object
        Animal myDog = new Dog();   // create a Dog object

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}



/* 

------------ output ------------------

PS C:\Users\hp\Desktop\java\java-112-june-2025\basic\java-class\Polymorphism> javac Main.java
PS C:\Users\hp\Desktop\java\java-112-june-2025\basic\java-class\Polymorphism> java Main
This animal makes a sound
The pig says: wee wee
The dog says: bow wow


 */