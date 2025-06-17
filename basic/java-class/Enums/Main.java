public class Main {
    enum Level {
        LOW,
        MEDIUM,
        HIGH 
    }    

    public static void main(String[] args) {
        // Level myVar = Level.MEDIUM;
        // System.out.println(myVar);


        // Enum in a Switch statement
        // switch(myVar){
        //     case LOW:
        //         System.out.println("Low level");
        //         break;
        //     case MEDIUM:
        //         System.out.println("Medium level");
        //         break;
        //     case HIGH:
        //         System.out.println("High level");
        //         break;
        // }


        // Loop Through an Enum
        for(Level myVar : Level.values()){
            System.out.println(myVar);
        }
    }
}
