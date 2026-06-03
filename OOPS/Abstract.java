
import java.util.*;

abstract class Animal {
  public abstract void sound();

  public void eat() {
    System.out.println("Eating");
  }

}

// subclass Dog

class Dog extends Animal {
  @Override
  public void sound() {
    System.out.println("Woof..");
  }

}

class Cat extends Animal {

  @Override
  public void sound() {
    System.out.println("meow");
  }

}

public class Abstract {

  public static void makeSoundAll(List<Animal> animals) {
    for (Animal animal : animals) {
      animal.sound();
    }
  }

  public static void main(String[] args) {

    List<Animal> animals = new ArrayList<>();
    animals.add(new Dog());
    animals.add(new Cat());

    makeSoundAll(animals);
  }
}
