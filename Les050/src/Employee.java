public class Employee {

    int id;
    String firstName;
    String lastName;
    int age;
    float salary;

    // return_type method_name (parameters: datatype1 variable1, datatype2 variable2)
    void print(int id) {
        System.out.println("ID: " + this.id + "    " + this.firstName + " " + this.lastName + ", " + this.age + " years old. Earns " + this.salary + "€");
    }
}
