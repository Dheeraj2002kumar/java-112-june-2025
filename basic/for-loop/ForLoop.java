public class ForLoop{
    public static void main(String[] args) {
        
        // for loop

        // for(int i = 1; i <= 10; i++){
        //     System.out.println(i);
        // }

        
        
        // for-each loop

        // String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        // for (String i : cars){
        //     System.out.println(i);
        // }


        // create a program that counts to 100 by tens.

        // for(int i = 0; i <= 100; i += 10){
        //     System.out.println(i);
        // }


        // create a program that only print even values between 0 and 10.
        // for (int i = 0; i <= 10; i = i + 2){
        //     System.out.println(i);
        // }



        // create a program that prints the multiplication table for a specified number.

        int number = 2; 

        // print the multiplication table for the number 2
        for (int i = 1; i <= 10; i++){
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}