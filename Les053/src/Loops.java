public class Loops {

    public static void main(String[] args) {

        Validator validator= new Validator();

        int validPassword=validator.readValidPassword();

        System.out.println("Your password is" + validPassword);
    }
}
