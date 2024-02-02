public class ParkingLot{
    public ParkingSpot[] spots;

    public ParkingLot(){
        this.spots = new ParkingSpot[10];
        for (int i = 0; i < 10; i++){
            if(i > 1){
                this.spots[i] = new ParkingSpot(false);
            }
            else{
                this.spots[i] = new ParkingSpot(true);
            }
        }
    }
    public int parkCar(Car car){
        for(int i = 0 ; i < spots.length; i++){
            if(spots[i].isAvailable() && (car.isHandicap() == spots[i].getHandicap())){
                spots[i].parkCar(car);
                return i;
            }
        }
        return -1;
    }
    public Car unparkCar(int spotnum){
        if(spotnum >= 0 && spotnum < spots.length) {
            return spots[spotnum].removeCar();
        }
        return null;
    }
    public String toString(){
        int handicapAval = 0;
        int regularAval = 0;
        for(ParkingSpot spot : spots){
            if(spot.isAvailable()){
                if(spot.getHandicap()){
                    handicapAval++;
                }
                else {
                    regularAval++;
                }
            }
        }
        return handicapAval + " " + regularAval;
    }
}