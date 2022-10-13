package java_basics;

public class CarTest {


    public static void main(String[] args) {

        Car bmw = new Car();
        Car ford = new Car();


//        System.out.println(bmw);
//        System.out.println(ford);

        bmw.manufacturer = "BMW";
        bmw.color ="Imola Red";
        ford.manufacturer="Ford";
        ford.color="black";
        bmw.startEngine();
        ford.startEngine();
        System.out.println(bmw.typeOfVehicle);
        bmw.typeOfVehicle = "Boat";
        System.out.println(bmw.typeOfVehicle);
        System.out.println(ford.typeOfVehicle);

    }

}
