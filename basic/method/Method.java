public class Method {
    static void myMethod(){
        System.out.println("I just got executed!");
    }

    // method with parameter
    static void parameterMethod(String fname){
        System.out.println(fname + " Refsnes");
    }

    // multiple parameters
    static void multipleParameter(String fname, int age){
        System.out.println(fname + " is " + age);
    }

    // a method with if...else
    static void checkAge(int age){

        if (age < 18){
            System.out.println("Access denied - You are not old enough!");
        }
        else{
            System.out.println("Access granted - You are old enough!");
        }
    }

    // return value (method)
    static  int returnMethod(int x){
        return 5 + x;
    }

    // return the sum of a method's two parameters:
    static int sumMethod(int x, int y){
        return x + y;
    }

    static int subtractMethod(int x, int y){
        return x - y;
    }

    // method overloading:- With method overloading, multiple methods can have the same name with different parameters.
    static  int plusMethod(int x, int y){
        return x + y;
    }

    static double  plusMethod(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        // myMethod();
        // parameterMethod("Dheeraj");
        // multipleParameter("Dheeraj", 22);
        // checkAge(20);
        // System.out.println(returnMethod(3));
        // System.out.println(sumMethod(5, 3));

        // int z = subtractMethod(5, 3);
        // System.out.println(z);

        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: "+ myNum1);
        System.out.println("double: "+ myNum2);
    }
}
