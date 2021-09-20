package be.intecbrussel.students.hilal.les065;

public class App {
    public static void main(String[] args) {



            //int employeeCounter=0;
            Employee employee1 = new Employee();
            employee1.setId(1);
            employee1.setFirstName("Yilmaz");
            employee1.setLastName("Mustafa");
            employee1.setAge(35);
            employee1.setDepartment("java");
            employee1.setGender('M');
            employee1.setUser("yilmazchef", "123azerty");
            employee1.setSalary(2250);
            //employeeCounter++;


            Employee employee2 = new Employee(2, "Justin", "Bieber");
            employee2.setAge(14);
            employee2.setDepartment("no one knows");
            employee2.setGender('M');
            employee2.setUser("just.in", "321azerty");
            employee2.setSalary(9999);
            //employeeCounter++;


            Employee employee3 = new Employee(3, "Nikola", "Tesla", 76, 100, 'M', "genius");
            //employeeCounter++;
            Employee employee4 = new Employee(4, "Marie", "Curie", 45, 6800, 'F', "genius");
            //employeeCounter++;
            // Replace: CTRL + 'R'
            // Duplicate: CTRL + 'D'
            // Copy: CTRL + 'C'
            // Paste: CTRL + 'V'
            // Print: CTRL + 'P'
       //System.out.println(employeeCounter);
            System.out.println(Employee.counter);
    }

}
