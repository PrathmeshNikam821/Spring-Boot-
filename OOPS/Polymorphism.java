class Person {
  private String name;
  private int age;

  // constructor
  Person(String name, int age) {
    this.name = name;
    setAge(age);
  }

  // getter and setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    try {
      if (age < 0 || age > 150) {
        throw new IllegalArgumentException("Age must be between 0 and 150 . Provided:" + age);
      }
      this.age = age;

    } catch (IllegalArgumentException e) {
      System.out.println("Invalid age :" + e.getMessage());
      this.age = 0;
    }
  }

  public int getAge() {
    return age;
  }

}

public class Polymorphism {
  public static void main(String[] args) {
    // System.out.println("Hello World");

    Person p = new Person("pratham", 22);
    System.out.println(p.getName());
    System.out.println(p.getAge());
    p.setAge(24);
    p.setName("Prathmesh");
    System.out.println(p.getName());
    System.out.println(p.getAge());

    Person p2 = new Person("p", 161);
    System.out.println("After exception ");
    p2.setAge(10);
    System.out.println(p2.getAge());
  }
}
