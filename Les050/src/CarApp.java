class CarApp {

    public static void main(String[] args) {

        // ClassName variableName = new ClassName();
        Car car1 = new Car();
        car1.brand = "Volvo";
        car1.model = "S40";
        car1.manufacturedYear = 2019;
        car1.price = 17000;

        Car car2 = new Car();
        car2.brand = "BMW";
        car2.model = "1.16D";
        car2.manufacturedYear = 2018;
        car2.price = 21000;

        Car car3 = new Car();
        car3.brand = "Mercedes";
        car3.model = "S400";
        car3.manufacturedYear = 2015;
        car3.price = 25000;


        System.out.println(car2.brand);
        System.out.println(car2.model);
        car1.stop_air_conditioner();

        car2.startEngine();

        car2.startEngine();

        car2.startEngine();

        car2.startEngine();

        car2.startEngine();

        car2.startEngine();

    }

}
