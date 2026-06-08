import java.util.*;

public class ReduceMethod {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    int product = numbers.stream()
        .filter(n -> n > 2)
        .reduce(1, (a, b) -> a * b);

    System.out.println(product);
  }
}
