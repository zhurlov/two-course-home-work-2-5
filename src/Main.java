public class Main {
    public static void main(String[] args) {

        CarsB <CarS> b = new CarsB<>("Зайцева Маргарита Михайловна", true, "4 года");
        System.out.println(b);


        FreightC <Trucks> c = new FreightC<Trucks>("Сергеев Богдан Глебович", false, "7 лет");
        System.out.println(c);


        BusesD<Buses> d = new BusesD<>("Лукьянова Диана Марковна", true, "9 месяцев");
        System.out.println(d);

        CarsB.passengerBody();


    }
}