public class Question03 {

    public static void main(String[] args) {

        // INFINITE LOOPS
        // Gaming: Creating a form, panel, button, player which will exist during the whole game..

        int counter = 0;

        for (; ; ) {
            System.out.println(++counter);
            if (counter == 5) {
                break;
            }
        }

        // WHAT IS THE OUTPUT?
        // 1
        // 2
        // 3
        // 4
        // 5

        /*
        while (true) {
            if (playerIsAlive) {

            } else {
                System.out.println("Game Over..!");
                break;
            }
        }
         */
    }
}
