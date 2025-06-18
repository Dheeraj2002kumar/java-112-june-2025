public class CustomTime {
	// set the time to the time specified by the parameters
	final int MAX_HOURS = 23;
	final int MAX_MIN_SECS = 59;

	int hour;    // current hour in military time
	int minute;  // current minute in military time
	int second;  // current second in military time

    // Add an appropriate constroctor to the time class.
    CustomTime(){
        hour = 0;
        minute = 0;
        second = 0;
    }

    CustomTime(int hourValue, int minuteValue, int secondValue){
        setTime(hourValue, minuteValue, secondValue);
    }

	// // set the time to the time specified by the parameters
	// void setTime (int newHour, int newMinute, int newSecond) {
	// 	hour = newHour;
	// 	minute = newMinute;
	// 	second = newSecond;
	// }

    // set the time to the specified by the parameters
    void setTime( int newHour, int newMinute, int newSecond){
        if (newHour >= 0 && newHour <= MAX_HOURS){
            hour = newHour;
        }
        else {
            System.out.println("Error: hour must be between 0 and 23");
            hour = 0;
        }

        if (newMinute >= 0 && newMinute <= MAX_MIN_SECS){
            minute = newMinute;
        }
        else {
            System.out.println("Error: minute must be between 0 and 59 inclusive");
            minute = 0;
        }

        if (newSecond >= 0 && newSecond <= MAX_MIN_SECS){
            second = newSecond;
        }
        else{
            System.out.println("Error: second must be between 0 and 59 inclusive");
            second = 0;
        }
    }

	// return the time to the calling method in a three-membered array
	int[] getTime() {
		return new int[] {hour, minute, second};
	}

	// increment the current time by one second
	// void incrementTime() {
	// 	++second;
	// }

	// increment the current time by one second
	void incrementTime() {
        // 23:59:59 --> 0:0:0
        // 59 --> 60%60 = 0
        // 59 --> 60%60 = 0
        // 23 --> 23%23 = 0

        // 20:15:43 --> 20:15:44
        // 43 --> 44%60 = 44

        second = ++second % (MAX_MIN_SECS + 1);
        
        if (second == 0){
            minute = ++minute % (MAX_MIN_SECS + 1);
        }

        if (second == 0 && minute == 0){
            hour = ++hour % (MAX_HOURS + 1);
        }
	}
}