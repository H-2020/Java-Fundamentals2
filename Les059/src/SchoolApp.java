package be.intecbrussel.students.hilal.les059;

public class SchoolApp {
    public static void main(String[] args) {



        Student student01 = new Student();
        student01.studentId = 1;
        student01.firstName = "Yilmaz";
        student01.lastName = "Mustafa";
        student01.age = 35;
        student01.phone = 47711798L;
        student01.email = "yilmaz.mustafa@intecbrussel.be";
        student01.city = "Zele";
        student01.score = 0;

        Student student02 = new Student();
        student02.studentId = 2;
        student02.firstName = "Justin";
        student02.lastName = "Bieber";
        student02.age = 12;
        student02.phone = 47722700L;
        student02.email = "justin.the.rich@intecbrussel.be";
        student02.city = "Bora Bora Islands";
        student02.score = -10;

        Exam exam01 = new Exam();
        exam01.addStudent(student01);
        exam01.addStudent(student02);
        exam01.printStudents();




    }
}
