package be.intecbrussel.students.hilal.les065;

public class Employee {

    public static int counter;
    // RULE_1
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private char gender;
    private String department;
    private String username;
    private String password;

    // RULE_2 : methods and constructors will be public..
    // RULE_X : max. 3 constructors.
    public Employee() {
        counter++;
    }

    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        counter++;
    }

    // TIP: max 6-8 params..
    public Employee(int id, String firstName, String lastName, int age, double salary, char gender, String department) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.department = department;
        counter++;
    }

    // SET_USERNAME_AND_PASSWORD
    public void setUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCounter(){
        return this.counter;
    }
}
