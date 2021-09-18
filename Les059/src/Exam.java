package be.intecbrussel.students.hilal.les059;

public class Exam {
    // [] -> many ...
    String[] questions = new String[0];
    Student[] students = new Student[0];

    void addStudent(Student student) {

        Student[] tempArr = new Student[students.length + 1];
        // CLONE_ALL_ELEMENTS_FROM_ORIGINAL_TO_TEMP
        for (int index = 0; index < students.length; index++) {
            tempArr[index] = students[index];
        }

        // add the new students to the last index ..
        tempArr[tempArr.length - 1] = student;

        students = tempArr;
    }

    void removeStudent() {

        Student[] tempArr = new Student[students.length - 1];
        // CLONE_ALL_ELEMENTS_FROM_ORIGINAL_TO_TEMP
        for (int index = 0; index < students.length - 1; index++) {
            tempArr[index] = students[index];
        }

        students = tempArr;
    }

    void addQuestion() {
        // TODO: ?
    }

    void removeQuestion() {
        // TODO?
    }

    void printStudents() {
        for(int index=0;index<students.length;index++){
            System.out.println(students[index]);
        }
    }

    void printQuestions() {

    }
}
