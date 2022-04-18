import java.util.*;
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
        int number;
        while ((number = scanner.nextInt()) != 42) {
            int result = 0;
            while (number != 0) {
                result += number % 10;
                number = number / 10;
            }
            int flag = 0;
            number = result;
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                cnt++;
        }
        System.out.println("Count of coffee - request - " + cnt);
        scanner.close();
    }
}
