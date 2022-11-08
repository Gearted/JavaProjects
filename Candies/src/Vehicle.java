public abstract class Vehicle {
    public String brand;
    public int kilometers;

    public Vehicle(String brand, int kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }

    public abstract String doStuff();
}
