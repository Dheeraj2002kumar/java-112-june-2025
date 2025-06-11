public class Attributes {
    int x = 5;
    int y;

    // if you don't want the ability to override existing values, declare the attribute as final
    final int z = 10;

    public static void main(String[] args) {
        Attributes myObj = new Attributes();
        // System.out.println(myObj.x);

        // modify the attributes
        // myObj.y = 40;
        // System.out.println(myObj.y);

        
        // override existing values
        // myObj.x = 25;
        // System.out.println(myObj.x);

        myObj.z = 25;  // the will generate error
        System.out.println(myObj.z);
    }
}
