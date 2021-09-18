import java.util.Scanner;

public class Validator {

    int readValidPassword() {

        //CREATE->Scanner
        Scanner scanner = new Scanner(System.in);

        //DECLARE->password
        String password;

        while (true) {

            System.out.println("Please enter your password");
            password = scanner.nextLine();

            if (password.length() != 4) {

                System.out.println("Please eneter a valid password");
                password = scanner.nextLine();

            } else {
                break;
            }

        }
        int result = Integer.parseInt(password);

        // RETURN -> password
        return result;
    }
}

