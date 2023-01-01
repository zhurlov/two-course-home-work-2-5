 public abstract class Car {
        public static final String PIT_STOP[] = {"автобус", "грузовые", "легковые"};

        private int yearOfIssue;
        private String countryOfOrigin;

        public abstract void refill();


        public int getYearOfIssue() {
            return yearOfIssue;
        }

        public void setYearOfIssue(int yearOfIssue) {
            this.yearOfIssue = yearOfIssue;
        }

        public String getCountryOfOrigin() {
            return countryOfOrigin;
        }

        public void setCountryOfOrigin(String countryOfOrigin) {
            this.countryOfOrigin = countryOfOrigin;
        }
    }


