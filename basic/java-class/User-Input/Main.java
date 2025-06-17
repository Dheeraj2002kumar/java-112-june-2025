
// import java.util.Scanner;


// public class Main {
//     public static void main(String[] args) {
        
//         Scanner myObj = new Scanner(System.in); // create a Scanner object
//         System.out.println("Enter username");

//         String userName = myObj.nextLine();  // Read user input (string)
//         System.out.println("Username is: " + userName);
//     }
    
// }




// ------------------------------------------
// we use different methods to read data of various types:


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in); // create a Scanner object
        System.out.println("Enter name, age and salary:");

        // String input 
        String name = myObj.nextLine();

        // Numerical input
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }    
}
