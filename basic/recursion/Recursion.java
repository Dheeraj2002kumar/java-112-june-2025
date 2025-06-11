public class Recursion {
    public static int sum(int k){
        if (k > 0){
            return k + sum(k - 1);
        }
        else {
            return 0;
        }
    }   
    
    // use recursion to add all of the number between 5 to 10
    public static int sumOfTwoParameter(int start, int end){
        if (end > start){
            return end + sumOfTwoParameter(start, end - 1);
        }
        else{
            return end;
        }
    }

    public static void main(String[] args) {
        // int result = sum(10);
        // System.out.println(result);

        int twoParameter = sumOfTwoParameter(5, 10);
        System.out.println(twoParameter);
    }
}
