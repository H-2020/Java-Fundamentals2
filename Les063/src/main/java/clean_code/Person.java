package clean_code;

public class Person {

    // RULE_1 : FIELDS -> make all fields private
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private char gender;

    // RULE_2: METHODS -> most of the methods are public, start with public
    // if it is really necessary to make that specific method private then change it later..

    // RULE_3. FIELDS & METHOD -> create getters and setters for all fields.

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        // RULE_4: Always Use the same name with the field for your method parameters
        this.id = id;
    }

    // RULE_05: METHODS -> if the instruction in a method is only one line, you can merge this with
    // return statement with this rule: return (instruction);
}
