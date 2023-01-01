public class FreightC < C extends Trucks > extends Driver {

    public enum loadCapacity {N1(),N2(), N3()}

    private double min;

    private double max;

     FreightC(String fullName, boolean possessionOfDriversLicense, String experience) {
        super(fullName, possessionOfDriversLicense, experience);
        this.min = min;
        this.max = max;
    }

    FreightC() {

    }

    public  double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

//    public FreightC(String tygachIvanPetrovich, boolean possessionOfDriversLicense, String experience) {
//        super(tygachIvanPetrovich, possessionOfDriversLicense, experience);
//    }

    public loadCapacity getValue(double value) {
        for (loadCapacity st : loadCapacity.values()) {
            if (value >= getMin() & value <= getMax()) {
                System.out.println(st);
                return st;
            }
        }
        return null;
     }

    @Override
    public String startMoving() {
        return CarS.PIT_STOP[1];
    }

    @Override
    public String stop() {
        return "Stop";
    }

    @Override
    public String refuelTheCar() {
        return "Дизельным топливом и с включенным двигателем";
    }

    @Override
    public String toString() {
        return fullName() + " стаж " + getExperience() + " управляет автомобилем класса - " + startMoving() + ", который можно заправлять " + refuelTheCar();

    }
}
