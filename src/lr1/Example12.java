package lr1;

import java.time.Year;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How old are you? ");
        int yearsOld = in.nextInt();
        int thisYear = Year.now().getValue();
        int numberOfYears = thisYear - yearsOld;
        System.out.println("Your year of birth is " + numberOfYears);
        in.close();
    }
}
