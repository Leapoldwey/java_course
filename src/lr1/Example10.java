package lr1;

import java.time.Year;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        int dateOfBirth = in.nextInt();

        int thisYear = Year.now().getValue();
        int numberOfYears = thisYear - dateOfBirth;
        System.out.printf("You are %d years old", numberOfYears);
        in.close();
    }
}
