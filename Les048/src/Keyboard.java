import java.util.Scanner;

public class Keyboard {

    // return_type method_name (parameters: datatype variable_name)

    public static String readString() {
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        return result;
    }

    public static char readChar() {
        Scanner scanner = new Scanner(System.in);
        char result = scanner.nextLine().charAt(0);
        return result;
    }

    public static double readDouble() {
        Scanner scanner = new Scanner(System.in);
        double result = scanner.nextDouble();
        return result;
    }

    public static int readInt() {
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        return result;
    }

    public static boolean readBoolean() {
        Scanner scanner = new Scanner(System.in);
        boolean result = scanner.nextBoolean();
        return result;
    }

}
