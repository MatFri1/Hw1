public class ParkingTester {
    public static void main(String[] args){
        ParkingLot parkinglot = new ParkingLot();
        System.out.println(parkinglot.toString());

        Car infiniti = new Car("Infiniti A", "Infiniti", true);
        int infinitySpot = parkinglot.parkCar(infiniti);
        System.out.println(parkinglot.toString());

        Car cadillac = new Car("Cadillac B", "Cadillac", false);
        parkinglot.parkCar(cadillac);
        System.out.println(parkinglot.toString());

        parkinglot.unparkCar(infinitySpot);
        System.out.println(parkinglot.toString());
    }
}