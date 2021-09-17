class Car {

    String brand;
    String model;
    int manufacturedYear;
    float price;

    // return_type method_name (parameters: data_type variable_name )
    void startEngine() {
        System.out.println("brrrrrrrrrrrrrrrrr....");
        System.out.println("Engine started..");
    }

    void stopEngine() {
        System.out.println("Engine stopped..");
    }

    void playMusic(String song) {
        System.out.println("Playing " + song);
    }

    void speed(int kmPerHour, boolean isIncreasing) {
        if (isIncreasing) {
            System.out.println("Speeding up to " + kmPerHour);
        } else {
            System.out.println("Speeding down to" + kmPerHour);
        }
    }

    void startAirConditioner() {
        System.out.println("Air conditioner started..");
    }

    void stop_air_conditioner() {
        System.out.println("Air conditioner stopped");
    }

}
