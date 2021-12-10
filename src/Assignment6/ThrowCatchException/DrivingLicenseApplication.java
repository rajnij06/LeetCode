package Assignment6.ThrowCatchException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;
import java.util.Scanner;

public class DrivingLicenseApplication {
    public static void main(String[] args) throws Exception {
        try {
            checkAge();
        }
        catch (Exception e) {
            throw e;
        }
    }
    public static void checkAge() throws Exception {
        Date dateOfBirt = null;
        Scanner input = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.print("Enter your Date of Birth (yyyy-MM-dd): ");
        String age = input.nextLine();
        Date date = format.parse(age);
        Instant instant = date.toInstant();
        ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
        LocalDate givenDate = zone.toLocalDate();
        Period period = Period.between(givenDate, LocalDate.now());

        if (period.getYears() < 16) {
            throw new Exception("The age of the applicant is " + period.getYears() + " which is too early to apply for a driving licence");
        }
        else
            System.out.println("The age of the applicant is " + period.getYears() + " and can apply for a driving licence");
    }
}
