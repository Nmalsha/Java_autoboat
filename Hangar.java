public class Hangar {
    public static void main(String[] args) {
        Car clio = new Car("Clio", 50000);
        Boat titanic = new Boat("Titanic", 200000);

        System.out.println(clio.doStuff());
        System.out.println(titanic.doStuff());
    }
}