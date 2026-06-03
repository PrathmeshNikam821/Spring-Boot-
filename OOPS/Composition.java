class Engine {

  public void start() {
    System.out.println("Engine Started");

  }
}

class Car {
  private Engine engine;// compositon --> HAS - A Relationship

  public Car(Engine engine) {
    this.engine = engine;

  }

  public void start() {
    // Delegation: Car delegates start() to its Engine

    System.out.print("Car starting: ");
    engine.start();
  }

}

public class Composition {
  public static void main(String[] args) {
    Engine engine = new Engine();
    Car car = new Car(engine);
    car.start();
  }
}
