package higher_lower;

import jdk.swing.interop.SwingInterOpUtils;

public class EmployeeApp {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.id = 1;
        employee1.firstName = "Yilmaz";
        employee1.lastName = "Mustafa";

        Employee employee2 = new Employee(2);
        employee2.firstName = "Nikola";
        employee2.lastName = "Tesla";

        Employee employee3 = new Employee(3, "Justin", "Bieber");
        System.out.println(employee1.firstName);
        System.out.println(employee2.lastName);
        System.out.println(employee3.id);

    }
}
