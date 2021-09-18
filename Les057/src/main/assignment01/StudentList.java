package assignment01;

public class StudentList {

    // CLASS LEVEL VARIABLES
    double[] scores = new double[0];


    // ADD_SCORE
    void addScore(double newScore) {
        double[] tempArr = new double[scores.length + 1];
        for (int index = 0; index < scores.length; index++) {
            tempArr[index] = scores[index];
        }
        tempArr[tempArr.length - 1] = newScore;
        // we assigned the new value of scores array from temp array.
        // it contains all elements from previous array and together with newScore
        scores = tempArr;
    }

    // REMOVE_SCORE
    void removeScore(int indexToRemove) {
        double[] tempArr = new double[scores.length - 1];

        // IF(index_is_in_the_boundary)
        if (indexToRemove < scores.length) {
            // find the element
            // set the value to '0.00'
            scores[indexToRemove] = 0.00;
        }
    }

    // ASSIGMENT 01:
    // REMOVE_LAST_ELEMENT
    void removeLastScore() {
        double[] tempArr = new double[scores.length - 1];
        for (int index = 0; index < scores.length - 1; index++) {
            tempArr[index] = scores[index];
        }
        scores = tempArr;
    }

    void sortScores() {



    }


}
