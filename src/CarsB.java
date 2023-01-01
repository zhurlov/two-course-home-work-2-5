public class CarsB < B extends CarS > extends Driver {

    public enum passengerBody {СЕДАН,ХЕТЧБЕК,КУПЕ,УНИВЕРСАЛ,ВНЕДОРОЖНИК,КРОССОВЕР,ПИКАП,ФУРГОН,МИНИВЭН}

    public CarsB(String fullName, boolean possessionOfDriversLicense, String experience) {
        super(fullName, possessionOfDriversLicense, experience);
    }

    public void driverB(B b){
        refuelTheCar();
        System.out.println("Водитель категории В");
    }
    public static void passengerBody(){
        for (passengerBody passengerBody : passengerBody.values()) {
            System.out.println(passengerBody);
        }
       // return passengerBody();
//        String[] passenger = new String[passengerBody.values().length];
//        for (int i = 0; i < passenger.length; i++) {
//            passenger[i] = passengerBody.values()[i].name();
//        }
//        System.out.println(passenger);
//        return passenger;
    }


    @Override
    public String startMoving() {
        return CarS.PIT_STOP[2];
    }

    @Override
    public String stop() {
        return "Stop";
    }

    @Override
    public String refuelTheCar() {
        return "бензин не ниже 92";
    }

    @Override
    public String toString() {
        return fullName() + " стаж " + getExperience() + " управляет автомобилем класса - " + startMoving() + ", который можно заправлять " + refuelTheCar();
    }

}
