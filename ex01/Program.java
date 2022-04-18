import java.util.*;
public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 0 || number == 1 || number < 0) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }

        int cnt = 0;
        for (int i = 2; i * i <= number; i++) {
            cnt++;
            if (number % i == 0) {
                System.out.println("false " + cnt);
                return;
            }
        }
        cnt++;
        System.out.println("true " + cnt);
        scanner.close();
    }
}
