import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateGap {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Today's date is " + date);
       
        String someDate = "24/11/2000";
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/mm/yyyy");
        // Date bDate = formatDate.parse("24/11/2000");

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("The current date and time is " + dateTime + "\n");
        // we want to format it
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = dateTime.format(myFormat);
        System.out.println("The formatted date and time is " + formattedDate);

        // calculating a date of birth using period
        LocalDate birthDate = LocalDate.of(2000, 6, 21);
        Period period = Period.between(birthDate, date); // if it isn't up to a month from your birthday, it would calculate the days instead.
        System.out.println("Your date of birth is " + period);
        // Your output will be how many year, month and days you are compared to the current date.

        ZoneId zoneID = ZoneId.of("Europe/Paris");

        LocalDate dates = LocalDate.now(zoneID);
        System.out.println("The date in Europe is " + dates);
        LocalTime time = LocalTime.now();
        System.out.println("Your current time is " + time);

       

    }
}
