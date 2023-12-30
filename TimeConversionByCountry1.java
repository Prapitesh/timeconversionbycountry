import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class TimeConversionByCountry1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for local time zone
        System.out.print("Enter your local time zone \n(e.g. Asia/Kolkata, Asia/Tashkent, Asia/Kuwait): ");
        String localTimeZoneStr = sc.nextLine();
        TimeZone localTimeZone = TimeZone.getTimeZone(localTimeZoneStr);

        // Taking user input for country time zone
        System.out.print("Enter the country time zone \n(e.g. America/New_York, Europe/London, Asia/Tokyo): ");
        String countryTimeZoneStr = sc.nextLine();
        TimeZone countryTimeZone = TimeZone.getTimeZone(countryTimeZoneStr);

        // Convert local time to country time
        Date localTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        formatter.setTimeZone(localTimeZone);
        String localTimeString = formatter.format(localTime);

        formatter.setTimeZone(countryTimeZone);
        String countryTimeString = formatter.format(localTime);

        // Showing output
        System.out.println("Local time (" + localTimeZone.getID() + "): " + localTimeString);
        System.out.println("Country time (" + countryTimeZone.getID() + "): " + countryTimeString);
    }
}
