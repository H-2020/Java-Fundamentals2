package assignment01;

public class EmployeeList {

    // return_type method_name (parameters: data_type_for_param1 param1_name,data_type_for_param2 param2_name)
    public static int[] addEmployeeId(int[] originalArr, int employeeId) {

        int tableLength = originalArr.length;
        int[] tempArr = new int[++tableLength]; // 5 + 1 = 6

        // CLONE_ALL_ELEMENTS_FROM_ORIGINAL_TO_TEMPORARY_ARRAY
        for (int index = 0; index < originalArr.length; index++) {
            tempArr[index] = originalArr[index];
        }

        // ADD NEW ELEMENT TO THE ARRAY..
        tempArr[tableLength - 1] = employeeId;

        // FOR(tempArr.length)
        for (int index = 0; index < tempArr.length; index++) {
            System.out.println(tempArr[index]);
        }

        return tempArr;

    }

    public static int[] removeEmployeeId(int[] originalArr) {

        int length = originalArr.length;
        int[] tempArr = new int[--length]; // 5 - 1 = 4

        for (int index = 0; index < length; index++) {
            tempArr[index] = originalArr[index];
        }

        return tempArr;
    }

}

