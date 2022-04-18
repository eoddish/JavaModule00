import java.util.*;
public class Program {
    public static void main(String[] args) {
        String str;
        long result = 0;
        Scanner scanner = new Scanner(System.in);
        int weekNumber = 1;
        while (true) {
            str = scanner.next();
            if (str.equals("42"))
                break;
            else if (str.equals("Week")) {
                int week = scanner.nextInt();
                if (week != weekNumber) {
                    System.err.println("IllegalArgument");
                    System.exit(-1);
                }
                int min = scanner.nextInt();
                for (int i = 0; i < 4; i++) {
                    int number = scanner.nextInt();
                    if (number < min)
                        min = number;
                }
                int pow = weekNumber - 1;
                int multiply = 1;
                while (pow > 0) {
                    multiply *= 10;
                    pow--;
                }
                result += multiply * min;
                weekNumber++;
            }
        }
        for (int i = 0; i < weekNumber-1; i++) {
            System.out.print("Week " + (i + 1));
            for (int j = 0; j < result % 10; j++) {
                System.out.print("=");
            }
            System.out.println(">");
            result = result / 10;
        }
        scanner.close();
    }
}
