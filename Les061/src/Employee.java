package be.intecbrussel.students.hilal.less061;

 class Employee {
    int id;
    String fName;
    String lName;
    char gender;

    // CONSTRUCTOR
    // NameOfTheClass(parameters: ...){ }

    Employee(int paramId, String paramFName, String paramLName, char paramGender) {
        id = paramId;
        fName = paramFName;
        lName = paramLName;
        gender = paramGender;
    }

    void print() {
        System.out.println("Employee: " + id + " " + fName + " " + lName + ", " + gender);
    }


}
