abstract class Vehicle {
  private String model;
  private int year;

  public Vehicle(String model, int year) {
    this.model = model;
    this.year = year;
  }

  public String getModel() {
    return model;
  }

  public int getAge() {
    return year;
  }

  public abstract void startEngine();

  public void stop() {
    System.out.println("Stopping..");
  }
}

class Car extends Vehicle {
  public Car(String model, int year) {
    super(model, year);
  }

  @Override
  public void startEngine() {
    System.out.println("Car engine started: " + getModel());
  }
}

class Bike extends Vehicle {
  public Bike(String model, int year) {
    super(model, year);
  }

  @Override
  public void startEngine() {
    System.out.println("Bike engine started" + getModel());
  }
}

public class Hierarchy {
  public static void main(String[] args) {
    Vehicle[] vehicles = new Vehicle[2];
    vehicles[0] = new Car("Tesla Model", 2023);
    vehicles[1] = new Bike("Yamaha", 2024);

    for (Vehicle v : vehicles) {
      v.startEngine();
      v.stop();
      System.out.println();

    }
  }
}