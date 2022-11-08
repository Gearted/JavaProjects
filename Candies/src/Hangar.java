public class Hangar {
    public static void main(String[] args) {
        Car car = new Car("clio", 200000) {
            @Override
            public String doStuff() {
                return "Je suis " + this.brand + " et je fais vroum vroum !";
            }
        };
        Boat boat = new Boat("Titanic", 100000) {
            @Override
            public String doStuff() {
                return "Je suis " + this.brand + " et je fais glou glou !";
            }
        };
        System.out.println(car.doStuff());
        System.out.println(boat.doStuff());

    }
}
