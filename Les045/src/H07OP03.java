public class H07OP03 {

    public static void main(String[] args) {

             /*
                | 0 | 0 | 0 | 0 | 0 | 0 |
                | 0 | 0 | 0 | 0 | 0 | 0 |
                | 0 | 0 | 0 | 0 | 0 | 0 |
                | 0 | 0 | 0 | 0 | 0 | 0 |
             */

        // CREATE_2D_ARRAY
        int[][] table = new int[4][6];

        char[] characters = {
                'A', 'B', 'C', 'D', 'E', 'F', 'G'
        };

        System.out.print("  " + "|   ");
        for (int charIndex = 0; charIndex < 6; charIndex++) {
            System.out.print(characters[charIndex] + " |  ");
        }

        System.out.println();

        // OUTER_FOR(TABLE_COUNT)
        for (int row = 0; row < table.length; row++) {

            // PRINT -> row index
            System.out.print((row + 1) + " | ");

            // INNER_FOR(TABLE_ELEMENT_COUNT)
            for (int col = 0; col < table[row].length; col++) {

                // PRINT -> colum index
                int mul = (row + 1) * (col + 1);

                if (mul < 10) {
                    System.out.print(" " + "0" + mul + " |");
                } else {
                    System.out.print(" " + mul + " |");
                }
            }

            /*
            0 |  00 00 00 00 00 00
            1 |  00 01 02 03 04 05
            2 |  00 02 04 06 08 10
            3 |  00 03 06 09 12 15
             */

            System.out.println();

        }


    }

}
