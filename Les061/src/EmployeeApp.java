public class EmployeeApp {

    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Justin", "Bieber", 'M');
        Employee employee2 = new Employee(2, "Christiano", "Ronaldo", 'M');
        Employee employee3 = new Employee(3, "Marie", "Curie", 'F');
        Employee employee4 = new Employee(4, "Nikola", "Tesla", 'M');

        employee1.print();
        employee2.print();
        employee3.print();

    }
}
