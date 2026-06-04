
class Box<T> {
  private T content;

  public Box(T content) {
    this.content = content;
  }

  public T getContent() {
    return content;
  }

  public void setContent(T content) {
    this.content = content;
  }

  public boolean isEmpty() {
    return content == null;
  }

  @Override
  public String toString() {
    if (isEmpty()) {
      return "Box contains : nothing(empty)";
    }

    return "Box contains : " + content;
  }
}

public class GenericsBox {
  public static void main(String[] args) {

    // Box with string
    Box<String> stringBox = new Box<>("Hello generics");
    System.out.println(stringBox);
    System.out.println("Is Empty?" + stringBox.isEmpty());
    stringBox.setContent("New Content");
    System.out.println("After settter:" + stringBox.getContent());
    System.out.println();

    // Box with integer
    Box<Integer> integerBox = new Box<>(22);
    System.out.println(integerBox);
    System.out.println("Is Empty? " + integerBox.isEmpty());
    integerBox.setContent(8);
    System.out.println("After settter:" + integerBox.getContent());
    System.out.println();

    // Empty Box
    Box<Double> empty = new Box<>(null);
    System.out.println(empty.getContent());
    System.out.println("is Empty?" + empty.isEmpty());

  }
}
