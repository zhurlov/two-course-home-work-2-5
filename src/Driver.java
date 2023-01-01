public abstract class Driver {

    private String fullName;
    private boolean possessionOfDriversLicense;
    private String experience;

     Driver(String fullName, boolean possessionOfDriversLicense, String experience) {
        this.fullName = Validate.validateString(fullName, "ошибка");
        this.possessionOfDriversLicense = Validate.validateBoolean(possessionOfDriversLicense, true);
        this.experience = Validate.validateString(experience, "ошибка");
    }

    Driver() {

    }

    public String fullName() {
        return fullName;
    }

    public boolean isPossessionOfDriversLicense() {
        return possessionOfDriversLicense;
    }

    public String getExperience() {
        return experience;
    }

    public abstract String startMoving();

    public abstract String stop();

    public abstract String refuelTheCar();

}