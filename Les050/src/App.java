import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // NameOfClass variableName = new NameOfClass();
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        // variableName.info = value;
        Patient patient1 = new Patient();
        patient1.id = 1;
        patient1.firstName = "Yilmaz";
        patient1.familyName = "Mustafa";
        patient1.dateOfBirth = "11/03/1986";
        patient1.email = "yilmaz@mail.be";
        patient1.phone = "0467711709";

        Patient patient2 = new Patient();
        patient2.id = 2;
        patient2.firstName = "Justin";
        patient2.familyName = "Bieber";
        patient2.dateOfBirth = "11/03/2010";
        patient2.email = "justin@dontbelikeme.be";
        patient2.phone = "0000000011";

        Patient patient3 = new Patient();
        patient3.id = 3;
        patient3.firstName = "Robyn Rihanna";
        patient3.familyName = "Fenty";
        patient3.dateOfBirth = "20/02/1988";
        patient3.email = "rihanna@featchef.be";
        patient3.phone = "0467711999";

        Patient patient4 = new Patient();
        patient4.id = 4;
        patient4.firstName = "Wolfgang Amadeus";
        patient4.familyName = "Mozart";
        patient4.dateOfBirth = "27/01/1756";
        patient4.email = "mozart@iamtheboss.be";
        patient4.phone = "00000000001";


        System.out.println(patient1.id + ": " + patient1.firstName + " " + patient1.familyName);


    }

}
