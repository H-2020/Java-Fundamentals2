public class Question02 {

    public static void main(String args[]) {

        String text = "Ch€f";
        for (int index = 0; index <= text.length() - 1; index++) {
            System.out.println(text.charAt(index));
        }

        System.out.println("-------------------------------");

        for (int index = text.length() - 1; index >= 0; index--) {
            System.out.println(text.charAt(index));
        }

        // WHAT IS THE OUTPUT?
    }


}

