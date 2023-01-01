public class Trucks extends Car implements Competition {

    private String brand;
    private String model;
    private double engineDisplacement;

    public Trucks(String brand, String model, double engineDisplacement) {
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
        System.out.println("Дизельным топливом и с включенным двигателем");
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
        return PIT_STOP[1];

    }

    @Override
    public String bestLapTime() {
        return model;

    }

    @Override
    public double topSpeed() {
        return engineDisplacement;
    }


    @Override
    public String toString() {
        return "Trucks{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineDisplacement=" + engineDisplacement +
                '}';
    }
}