package be.intecbrussel.students.hilal.les058;

public class EmlpoyeeList {

   int tableLength=0;
    // TABLE_COLUMNS
    int[] idColumnArray = new int[tableLength];
    String[] firstNameColumnArray = new String[tableLength];
    String[] lastNameColumnArray = new String[tableLength];
    String[] departmentColumnArray = new String[tableLength];
    double[] salaryColumnArray = new double[tableLength];
    String[] emailColumnArray = new String[tableLength];
    long[] phoneNumberColumnArray = new long[tableLength];
    boolean[] isStillEmployedColumnArray = new boolean[tableLength];
    boolean[] isOutsourcedColumnArray = new boolean[tableLength];

    // return_type method_name (parameters: data_type_for_param1 param1_name,data_type_for_param2 param2_name)
     void addEmployeeId( int employeeId) {

        int tableLength = idColumnArray.length;
        int[] tempArr = new int[++tableLength]; // 5 + 1 = 6

        // CLONE_ALL_ELEMENTS_FROM_ORIGINAL_TO_TEMPORARY_ARRAY
        for (int index = 0; index < idColumnArray.length; index++) {
            tempArr[index] = idColumnArray[index];
        }

        // ADD NEW ELEMENT TO THE ARRAY..
        tempArr[tableLength - 1] = employeeId;
         idColumnArray=tempArr;


    }

     void removeEmployeeId() {

        int length = idColumnArray.length;
        int[] tempArr = new int[--length]; // 5 - 1 = 4

        for (int index = 0; index < length; index++) {
            tempArr[index] = idColumnArray[index];

        }
         idColumnArray=tempArr;


    }

    void addFirstName(String firstName){
        int tableLength = firstNameColumnArray.length;
        String[] tempArr = new String[++tableLength]; // 5 + 1 = 6

        // CLONE_ALL_ELEMENTS_FROM_ORIGINAL_TO_TEMPORARY_ARRAY
        for (int index = 0; index < firstNameColumnArray.length; index++) {
            tempArr[index] = firstNameColumnArray[index];
        }

        // ADD NEW ELEMENT TO THE ARRAY..
        tempArr[tableLength - 1] = firstName;

        firstNameColumnArray=tempArr;



    }
    void printEmployee(int index){
        System.out.println(idColumnArray[index]+" "+firstNameColumnArray[index]+ " "+lastNameColumnArray[index]);

    }
    void removeFirstName(){
        int length = firstNameColumnArray.length;
        String[] tempArr = new String[--length]; // 5 - 1 = 4

        for (int index = 0; index < length; index++) {
            tempArr[index] = firstNameColumnArray[index];

        }
        firstNameColumnArray=tempArr;


    }



}
