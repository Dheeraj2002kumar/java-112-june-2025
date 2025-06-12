// public class Constructor {
//     int x;  // class attribute
    
//     // create a class constructor for the Constructor class
//     public Constructor(){
//         x = 5;   // set the initial value for the class atrribute x
//     }

//     public static void main(String[] args) {
//         Constructor myObj = new Constructor();  // create an object of class Constructor (This will call the constructor)
//         System.out.println(myObj.x);  // print the value of x
//     }
// }




// -------- Constructor Parameters ----------------------

// public class Constructor{
//     int x;

//     public Constructor(int y){
//         x = y;
//     }

//     public static void main(String[] args) {
//         Constructor myObj = new Constructor(5);
//         System.out.println(myObj.x);
//     }
// }





// you can have as many parameters as you want:

public class Constructor{
    int modelYear;
    String modelName;

    public Constructor(int year, String name){
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args){
        Constructor myCar = new Constructor(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}