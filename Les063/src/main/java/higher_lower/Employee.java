package higher_lower;

public class Employee {

    public int id;
    public String firstName;
    public String lastName;

    public Employee() {
    }

    public Employee(int id) {
        this.id = id;
    }

    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }


}
