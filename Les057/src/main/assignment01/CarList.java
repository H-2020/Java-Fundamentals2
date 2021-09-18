package assignment01;

public class CarList {

    // CLASS LEVEL VARIABLES
    String[] cars = {
            "BMW", "Audi", "Mercedes", "Tesla", "Toyota", "Mitsubishi", "Volvo"
    };

    void printCars() {
        for (int index = 0; index < cars.length; index++) {
            System.out.println(cars[index]);
        }
    }

    String[] addCar(String newCarName) {

        // METHOD LEVEL VARIABLE
        String[] tempArr = new String[cars.length + 1];

        for (int index = 0; index < cars.length; index++) {
            tempArr[index] = cars[index];
        }

        tempArr[tempArr.length - 1] = newCarName;

        return tempArr;
    }
}
