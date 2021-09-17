public class KeyboardTester {

    public static void main(String[] args) {

        // PRINT -> Welcome
        Printer.info("Welcome to keyboard reader app..");


        Printer.info("Please enter a String: ");
        String text = Keyboard.readString();



        /*
        Printer.info(stringFromKeyboard);
        Printer.error("This is not really an error, but anywayy...");
        Printer.warning("I am warning you, if you don't order a pizza, I will eat you..");
         */

        /*
        char character = Keyboard.readChar();
        */

        String[] students = {
                "Irina", "Hilal", "Joey"
        };

        Printer.infoArray(students);

        Printer.separator();

        // PRINT -> Goodbye
        Printer.info("Goodbye");

    }
}
