public class Main {
    public static void main(String[] args) {

        hw7a();

        hw7b();

    }

    public static void hw7a() {
        Plate plate = new Plate(60);
        plate.info();

        Cat[] cats = new Cat[] {
                new Cat("Васька",20),
                new Cat("Борька",15),
                new Cat("Оглоед", 40),
                new Cat("Тихоня", 20)
        };

        for (Cat val: cats) {
            val.eat(plate);
        }

        System.out.println();

        for (Cat val: cats) {
            val.info();
        }

        plate.addFood(100);
        plate.info();

        System.out.println();

        for (Cat val: cats) {
            val.eat(plate);
        }

        System.out.println();
        plate.info();
    }

    public static void hw7b() {
        Window window = new Window();
    }
}
