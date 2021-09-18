package be.intecbrussel.students.hilal.les058;

public class SortingApp {
    public static void main(String[] args) {

        double[] sortedArray = {5, 55, 20, 99, 40};

        // 5 - 55
        // 55 - 20 -> 20 - 55
        // 55 - 99
        // 99 - 40 -> 40 - 99
        // 5 20 55 40 99

        // 5 - 55 -> min : 5 max: 55
        // 55 - 20 -> min: 20 max: 55
        // 55 - 99 -> min: 55 max: 99
        // 99 - 40 -> min: 40 max: 99



        // FOR(SORTED_ARRAY_LENGTH)
        for (int index = 0; index < sortedArray.length; index++) {



        }



        for (int index = 0; index < sortedArray.length; index++) {

            System.out.println("the recent score is " + sortedArray[index]);
            System.out.println("the next score is " + sortedArray[index + 1]);


            if (sortedArray[index] > sortedArray[index + 1] && index < sortedArray.length - 2) {
                sortedArray[index] = sortedArray[index + 1];
                sortedArray[index + 1] = sortedArray[index];
            }
        }


        for (int index = 0; index < sortedArray.length; index++) {
            System.out.println(sortedArray[index]);
        }

    }
}
