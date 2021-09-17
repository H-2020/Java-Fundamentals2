public class LookUpTables {

    public static void main(String[] args) {

        int tableLength = 2_000_000;

        String[] names = new String[tableLength];

        names[0] = "Yilmaz Mustafa";
        names[1] = "Nikola Tesla";
        names[2] = "Charles Darwin";
        names[3] = "Thomas Edison";
        names[4] = "Justin Bieber";

        double[] salaries = new double[tableLength];

        salaries[0] = 80.00;
        salaries[1] = 120.00;
        salaries[2] = 250.00;
        salaries[3] = 50.00;
        salaries[4] = 2000.00;

        int[] workingHours = new int[tableLength];
        workingHours[0] = 37;
        workingHours[1] = 40;
        workingHours[2] = 35;
        workingHours[3] = 38;
        workingHours[4] = 26;

        boolean[] isStillWorking = new boolean[tableLength];
        isStillWorking[0] = true;
        isStillWorking[1] = false;
        isStillWorking[2] = false;
        isStillWorking[3] = false;
        isStillWorking[4] = true;

        int[] totalWorkingHours = new int[tableLength];
        totalWorkingHours[0] = 600 * 24;
        totalWorkingHours[1] = 5000 * 24;
        totalWorkingHours[2] = 319 * 24;
        totalWorkingHours[3] = 950 * 24;
        totalWorkingHours[4] = 50 * 24;

        boolean[] canGetUnemploymentBenefits = new boolean[tableLength];

        int minWorkingHoursRequired = 320 * 24;

        // for(initialization; condition; operation)

        // if(bla_bla) break;

        for (int index = 0; index < tableLength; index++) {

            if (names[index] == null || salaries[index] <= 30 || workingHours[index] <= 25) {
                break;
            }

            System.out.println("Employee " + index + ": ");

            if (totalWorkingHours[index] > minWorkingHoursRequired) {
                canGetUnemploymentBenefits[index] = true;
            }

            System.out.println(names[index] + " earns "
                    + salaries[index] + " €/h"
                    + " and works " + workingHours[index]
                    + " in total = " + (salaries[index] * workingHours[index]) + "€"
                    + " total working hours: " + totalWorkingHours[index]
                    + " still working: " + isStillWorking[index]
                    + " can get unemployement benefits: " + canGetUnemploymentBenefits[index]
            );


        }

    }

}
