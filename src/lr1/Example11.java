package lr1;

import java.time.Year;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = in.nextLine();

        System.out.println("Enter your year of birth: ");
        int dateOfBirth = in.nextInt();

        int thisYear = Year.now().getValue();
        int numberOfYears = thisYear - dateOfBirth;
        System.out.printf("Your name is %s you are %d years old", name, numberOfYears);
        in.close();
    }
}
