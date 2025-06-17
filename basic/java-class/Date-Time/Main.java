
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();  // create a date object
        LocalTime myTime = LocalTime.now(); 
        LocalDateTime myDateTime = LocalDateTime.now();

        System.out.println(myDate);
        System.out.println(myTime);
        System.out.println(myDateTime);

        System.out.println("==================================");

        // formatting date time
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);

        DateTimeFormatter myFormatterObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formatterDate = myDateObj.format(myFormatterObj);
        System.out.println("After formatting: " + formatterDate);
    }
}
