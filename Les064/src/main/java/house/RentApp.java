package house;

public class RentApp {
    public static void main(String[] args) {

        House houseLokeren = new House();

        House houseBrussels = new House();

        House houseAmsterdam = new House();

        System.out.println("Kitchen in Lokeren: " + houseLokeren.getKitchen().getName());
        System.out.println("Kitchen in Brussels: " + houseBrussels.getKitchen().getName());
        System.out.println("Kitchen in Amsterdam: " + houseAmsterdam.getKitchen().getName());





    }

}
