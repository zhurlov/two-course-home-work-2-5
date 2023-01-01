public class CarS extends Car implements Competition {

    private String brand;
    private String model;
    private double engineDisplacement;

    public CarS(String brand, String model, double engineDisplacement) {
        this.brand = Validate.validateString(brand,"ошибка");
        this.model = Validate.validateString(model, "ошибка");
        this.engineDisplacement = Validate.validateDouble(engineDisplacement, 0.0);
    }

    public void startMoving(){

    }
    public void finishMotionMethod(){

    }

    @Override
    public void refill() {
        System.out.println("запрваляться бензин не ниже 92");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(double engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    @Override
    public String pitStop() {
        return PIT_STOP[2];
    }

    @Override
    public String bestLapTime() {
        return brand +" " + model + " " +  engineDisplacement;

    }

    @Override
    public double topSpeed() {
        return engineDisplacement;
    }


    @Override
    public String toString() {
        return "CarS{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineDisplacement=" + engineDisplacement +
                '}';
    }
}
