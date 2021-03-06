public class Printer {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void info(String text) {
        System.out.println(ANSI_BLUE + "Info" + text);
    }

    public static void error(String text) {
        System.out.println(ANSI_RED + "Error: " + text);
    }

    public static void separator() {
        System.out.println("-------------------------------------");
    }

    public static void warning(String text) {
        System.out.println(ANSI_YELLOW + "Warning: " + text);

    }

    public static void infoArray(String[] texts) {
        for (int index = 0; index < texts.length; index++) {
            System.out.println(ANSI_CYAN + "Student ID: " + index + " name: " + texts[index]);
        }
    }
}
