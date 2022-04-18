public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner();
        String[] students = new String[10];
        int[] hours = new int[10];
        int[] days = new String[10];
        int i = 0;
        while ((String name = scanner.next()) != ".") {
            students[i++] = name;
        }
        i = 0;
        while ((String name = scanner.next()) != ".") {
            classes[i] = name;
        }
        while ((String name = scanner.next()) != ".") {
            days[i] = name;
        }
    }
}
