public class BmiApplication {

    public static void main(String[] args) {

        System.out.println("Enter you length (cm): ");
        int height = KeyboardUtility.readInt();
        System.out.println("Enter your weight (kg): ");
        int weight = KeyboardUtility.readInt();
        float bmi = BmiUtility.calculateBmi(weight, height);
        BmiUtility.printDiagnose(bmi);

    }
}
