public class BusesD < D extends Buses > extends Driver {

    public BusesD(String tygachIvanPetrovich, boolean possessionOfDriversLicense, String experience) {
        super(tygachIvanPetrovich, possessionOfDriversLicense, experience);
    }

    @Override
    public String startMoving() {
        return CarS.PIT_STOP[0];
    }

    @Override
    public String stop() {
        return "Stop";
    }

    @Override
    public String refuelTheCar() {
        return "Дизельным топливом";
    }
    @Override
    public String toString() {
        return fullName() + " стаж " + getExperience() + " управляет автомобилем класса - " + startMoving() + ", который можно заправлять " + refuelTheCar();
    }

}
