public class BreakContinue {
    public static void main(String[] args) {
        // break statement
        // for (int i = 0; i < 10; i++){
            
        //     if ( i == 4){
        //         break;
        //     }

        //     System.out.println(i);

        // }


        // continue
        // for (int i = 0; i < 10; i++){

        //     if (i == 4){
        //         continue;
        //     }

        //     System.out.println(i);
        // }


        // break with while loop
        // int i = 0;
        // while (i < 10){
        //     System.out.println(i);
        //     i++;

        //     if (i == 4){
        //         break;
        //     }
        // }


        // continue with while loop
        int i = 0;
        while (i < 10){
            if (i == 4){
                i++;
                continue;
            }

            System.out.println(i);
            i++;
        }

    }    
}
