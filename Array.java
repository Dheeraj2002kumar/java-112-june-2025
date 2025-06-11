public class Array {
    public static void main(String[] args) {
        
        // accesses the value of the first element in cars
        // String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // System.out.println(cars[0]);


        // changing an array element
        // String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // cars[0] = "Opel";
        // System.out.println(cars[0]);



        // Array Length
        // String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // System.out.println(cars.length);


        // Loop through an array
        // String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // for (int i = 0; i < cars.length; i++){
        //     System.out.println(cars[i]);
        // }



        // loop through for-each loop
        // String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // for(String i : cars){
        //     System.out.println(i);
        // }




        // create a program that calculate the average of different ages:
        // int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
        // float avg, sum = 0;

        // int length = ages.length;

        // for (int age : ages){
        //     sum += age;
        // }

        // avg = sum / length;

        // System.out.println("The average age is: " + avg);



        // create a program that finds the lowest age among different ages:
        // int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        // int lowestAge = ages[0];

        // for(int age : ages){

        //     if (lowestAge > age){
        //         lowestAge = age;
        //     }
        // }

        // System.out.println("The lowest age in the array is: " + lowestAge);




        // 2D Array
        int[][] myNumber = {
            {1, 2, 3, 4},
            {5, 6, 7}
        };


        // System.out.println(myNumber[1][2]);

        // loop through a multidimentional array
        // for (int i = 0; i < myNumber.length; ++i){
        //     for (int j = 0; j < myNumber[i].length; ++j){
        //         System.out.println(myNumber[i][j]);
        //     }
        // }


        // for-each loop
        for (int[] row : myNumber){
            for(int i : row){
                System.out.println(i);
            }
        }

    }
}
