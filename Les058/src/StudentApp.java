public class StudentApp {

    public static void main(String[] args) {

   StudentList studentlist=new StudentList();
   studentlist.addScore(80);
   studentlist.addScore(85);
   studentlist.addScore(75);
   //studentlist.removeLastScore();
   //studentlist.removeScore(1);
        studentlist.sortScores();
   studentlist.printScore();


    }

}
