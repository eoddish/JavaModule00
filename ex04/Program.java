import java.util.*;
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        char str[] = string.toCharArray();
        int occur[] = new int[999];
        char chars[] = new char[999];
        int distinct = 0;

        for (int i = 0; i < string.length(); i++) {
            int counted = 0;
            for (int j = 0; j < distinct; j++) {
                if (str[i] == chars[j]) {
                    occur[j]++;
                    counted = 1;
                    break;
                }
            }
            if (counted == 0) {
                chars[distinct] = str[i];
                occur[distinct]++;
                distinct++;
            }
        }

        int i = 1;
        while (i < distinct) {
            int j = i;
            while (j > 0 && (occur[j - 1] < occur[j] || (occur[j - 1] == occur[j]) && (chars[j - 1] > chars[j] ))) {
                int tmp = occur[j];
                occur[j] = occur[j - 1];
                occur[j - 1] = tmp;
                char temp = chars[j];
                chars[j] = chars[j - 1];
                chars[j - 1] = temp;
                j = j - 1;
            }
            i = i + 1;
        }

        int chart[] = new int[10];
        for (int k = 0; k < 10 && k < distinct; k++) {
            chart[k] = occur[k] * 10 / occur[0];
        }

        for(int k = 10; k >= 0; k--) {
            for (int m = 0; m < 10 && m < distinct; m++) {
                if (chart[m] == k)
                    System.out.print("" + occur[m] + " ");
                if (chart[m] > k)
                System.out.print("# ");
            }
               System.out.println();
        }
        for (int k = 0; k < 10 && k < distinct; k++) {
            System.out.print("" + chars[k] + " ");
        }
        System.out.println();
        scanner.close();
    }
}
