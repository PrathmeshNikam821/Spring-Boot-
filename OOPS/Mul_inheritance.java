interface Swimmable {
  void swim();
}

abstract class Animal {
  public abstract void sound();

  public void eat() {
    System.out.println("Eating");
  }

}

class Fish extends Animal implements Swimmable {
  @Override
  public void sound() {
    System.out.println("Blub");
  }

  @Override
  public void swim() {
    System.out.println("Fish is swimming");
  }
}

public class Mul_inheritance {
  public static void main(String[] args) {
    Fish fish = new Fish();

    Animal animalRef = fish;
    animalRef.sound();
    animalRef.eat();

    Swimmable swimRef = fish;
    swimRef.swim();

    fish.sound();
    fish.swim();
  }
}
