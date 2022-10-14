package java_basics;

public class CarTest {


    public static void main(String[] args) {

        MyCar bmw = new MyCar();
        MyCar ford = new MyCar();


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
