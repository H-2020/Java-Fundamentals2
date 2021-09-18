package be.intecbrussel.students.hilal.les058;

public class EmployeeApp {

    public static void main(String[] args) {

        int tableLength = 5;


        // LOOK_UP_TABLES
        /*
         * idColumnArray[0] & firstNameColumnArray[0] & lastNameColumnArray[0] ... & isOutsourcedColumnArray[0]
         *   */

        // EMPLOYEE_0
        int employee0id = 0;
        String employee0FirstName = "Charles";
        String employee0LastName = "Darwin";
        String employee0Department = "Scientist";
        double employee0Salary = 50_000;
        String employee0Email = "charles.darwin@intecbrussel.be";
        long employee0PhoneNumber = 467700705L;
        boolean employee0StillEmployed = false;
        boolean employee0Outsourced = false;

        // EMPLOYEE_1
        int employee1id = 1;
        String employee1FirstName = "Yilmaz";
        String employee1LastName = "Mustafa";
        String employee1Department = "Instructors";
        double employee1Salary = 2250;
        String employee1Email = "yilmaz.mustafa@intecbrussel.be";
        long employee1PhoneNumber = 467711709L;
        boolean employee1StillEmployed = true;
        boolean employee1Outsourced = false;

        // EMPLOYEE_2
        int employee2id = 2;
        String employee2FirstName = "Justin";
        String employee2LastName = "Bieber";
        String employee2Department = "No One Knows";
        double employee2Salary = 2_000_000;
        String employee2Email = "justin.bieber@intecbrussel.be";
        long employee2PhoneNumber = 467711703L;
        boolean employee2StillEmployed = true;
        boolean employee2Outsourced = true;

        // EMPLOYEE_3
        int employee3id = 3;
        String employee3FirstName = "Nikola";
        String employee3LastName = "Tesla";
        String employee3Department = "Scientist";
        double employee3Salary = 100;
        String employee3Email = "nikola.tesla@intecbrussel.be";
        long employee3PhoneNumber = 467711705L;
        boolean employee3StillEmployed = false;
        boolean employee3Outsourced = false;

        // EMPLOYEE_4
        int employee4id = 4;
        String employee4FirstName = "Thomas";
        String employee4LastName = "Edison";
        String employee4Department = "Business person";
        double employee4Salary = 1_000_000;
        String employee4Email = "thomas.edison@intecbrussel.be";
        long employee4PhoneNumber = 467711701L;
        boolean employee4StillEmployed = false;
        boolean employee4Outsourced = true;

        // ADD_EMPLOYEES_TO_TABLE
        /*idColumnArray[0] = employee0id;
        idColumnArray[1] = employee1id;
        idColumnArray[2] = employee2id;
        idColumnArray[3] = employee3id;
        idColumnArray[4] = employee4id;

        firstNameColumnArray[0] = employee0FirstName;
        firstNameColumnArray[1] = employee1FirstName;
        firstNameColumnArray[2] = employee2FirstName;
        firstNameColumnArray[3] = employee3FirstName;
        firstNameColumnArray[4] = employee4FirstName;

        lastNameColumnArray[0] = employee0LastName;
        lastNameColumnArray[1] = employee1LastName;
        lastNameColumnArray[2] = employee2LastName;
        lastNameColumnArray[3] = employee3LastName;
        lastNameColumnArray[4] = employee4LastName;

        departmentColumnArray[0] = employee0Department;
        departmentColumnArray[1] = employee1Department;
        departmentColumnArray[2] = employee2Department;
        departmentColumnArray[3] = employee3Department;
        departmentColumnArray[4] = employee4Department;

        salaryColumnArray[0] = employee0Salary;
        salaryColumnArray[1] = employee1Salary;
        salaryColumnArray[2] = employee2Salary;
        salaryColumnArray[3] = employee3Salary;
        salaryColumnArray[4] = employee4Salary;

        emailColumnArray[0] = employee0Email;
        emailColumnArray[1] = employee1Email;
        emailColumnArray[2] = employee2Email;
        emailColumnArray[3] = employee3Email;
        emailColumnArray[4] = employee4Email;

        phoneNumberColumnArray[0] = employee0PhoneNumber;
        phoneNumberColumnArray[1] = employee1PhoneNumber;
        phoneNumberColumnArray[2] = employee2PhoneNumber;
        phoneNumberColumnArray[3] = employee3PhoneNumber;
        phoneNumberColumnArray[4] = employee4PhoneNumber;

        isStillEmployedColumnArray[0] = employee0StillEmployed;
        isStillEmployedColumnArray[1] = employee1StillEmployed;
        isStillEmployedColumnArray[2] = employee2StillEmployed;
        isStillEmployedColumnArray[3] = employee3StillEmployed;
        isStillEmployedColumnArray[4] = employee4StillEmployed;

        isOutsourcedColumnArray[0] = employee0Outsourced;
        isOutsourcedColumnArray[1] = employee1Outsourced;
        isOutsourcedColumnArray[2] = employee2Outsourced;
        isOutsourcedColumnArray[3] = employee3Outsourced;
        isOutsourcedColumnArray[4] = employee4Outsourced;*/


        String SEPARATOR = "-------------------------------------------------";

        // PRINT EACH ELEMENT OF AN ARRAY

        /* Algorithm:
         * for(int index = 0; index < array.length; index++) {
         *     System.out.println(array[index]);
         * }
         *   */

        // FOR(idColumnArray.length)
        /*for (int index = 0; index < idColumnArray.length; index++) {
            // PRINT_ORIGINAL_ARRAY_ELEMENT
            System.out.println(idColumnArray[index]);
        }*/

        // ADD ELEMENT TO AN ARRAY

        /* Algorithm:
         *
         *   */
        System.out.println(SEPARATOR);

        // EMPLOYEE_5
        int employee5id = 5;
        String employee5FirstName = "Elon";
        String employee5LastName = "Desk";
        String employee5Department = "Marketing guy";
        double employee5Salary = 1_000_000_000;
        String employee5Email = "elon.desk@intecbrussel.be";
        long employee5PhoneNumber = 567711102L;
        boolean employee5StillEmployed = false;
        boolean employee5Outsourced = true;


        System.out.println(SEPARATOR);

        // EMPLOYEE_6
        int employee6id = 6;
        String employee6FirstName = "Jeff";
        String employee6LastName = "BeeZoos";
        String employee6Department = "Bossy and mean guy";
        double employee6Salary = 1_500_000_000;
        String employee6Email = "jeff.the.mean@intecbrussel.be";
        long employee6PhoneNumber = 667722102L;
        boolean employee6StillEmployed = true;
        boolean employee6Outsourced = false;




    }


}
