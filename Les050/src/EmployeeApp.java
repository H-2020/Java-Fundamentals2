public class EmployeeApp {
    public static void main(String[] args) {

        // employee2 -> 1000

        Employee employee1 = new Employee();
        employee1.id = 1;
        employee1.firstName = "Yilmaz";
        employee1.lastName = "Mustafa";
        employee1.age = 36;
        employee1.salary = 2500;

        Employee employee2 = new Employee();
        employee2.id=5;
        employee2.firstName = "Justin";

        System.out.println(employee1.firstName);
        System.out.println(employee2.firstName);

        System.out.println(employee2.lastName);
        employee1.print(employee2.id);


    }
}
