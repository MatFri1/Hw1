public class ParkingSpot{
    public Car parkedCar;
    public boolean handicap;

    public ParkingSpot(boolean handicap){
        this.handicap = handicap;
    }

    public boolean getHandicap(){
        return handicap;
    }
    public boolean isAvailable(){
        return parkedCar == null;
    }
    public void parkCar(Car car){
        this.parkedCar = car;
    }
    public Car removeCar(){
        Car car = this.parkedCar;
        this.parkedCar = null;
        return car;
    }
}