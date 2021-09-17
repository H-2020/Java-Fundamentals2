public class BmiUtility {

    public static float calculateBmi(int weight, int height) {
        float bmi = weight / ((height / 100F * height / 100F));
        return bmi;
    }

    public static void printDiagnose(float bmi) {
        System.out.println("You BMI index is " + bmi);
    }
}